package cs108


import scala.util.{Success, Failure}
import scala.collection.mutable.{Map => MutableMap}
import scala.concurrent.Future

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}
import scala.scalajs.concurrent.JSExecutionContext.Implicits.queue

import org.scalajs.dom
import org.scalajs.dom.experimental.{Fetch, RequestInit, HttpMethod}
import scala.scalajs.js.Date
import scala.scalajs.js.Thenable.Implicits._

import js.JSConverters._
import org.scalajs.dom.document

import upickle.default._




import com.raquo.laminar.api.L._
import com.raquo.domtypes.generic.codecs.BooleanAsAttrPresenceCodec
import com.raquo.laminar.keys.ReactiveProp
import com.raquo.domtypes.generic.codecs.BooleanAsIsCodec
import typings.zipJsZipJs.mod.ZipWriter
import typings.zipJsZipJs.mod.Data64URIWriter
import typings.zipJsZipJs.mod.BlobReader
import java.io.File
import java.io.FileReader
import java.net.URI






sealed trait Err
object Err {
  case object Empty extends Err

  // Token-related errors
  case class UnknownTokenKey(tokenKey: String) extends Err
  case class MismatchedEvents(token1: Token, token2: Token) extends Err
  case class InactiveEvent(event: Event) extends Err

  // File-related errors
  case class FileTooBig(size: Long, maxSize: Long) extends Err
}

class Client(apiBaseURL: String, container: dom.Element) {

  def tokenFeedbackFr(validatedToken: Either[Err, Token]): HtmlElement =
    validatedToken match {
      case Right(token) =>
        val owners = token.owners.toSeq.map(_.lastName).sorted
        div("Jeton valide pour ", b(token.event.description), " par ",
            owners.mkString(" et "), ".")
      case Left(Err.UnknownTokenKey(tokenKey)) =>
        div(s"Erreur : le jeton ${tokenKey} est inconnu.")
      case Left(Err.MismatchedEvents(token1, token2)) =>
        div(s"Erreur : les deux parties du jeton appartiennent chacune à un "
              + s"événement différent.")
      case Left(Err.InactiveEvent(event)) =>
        div(s"Erreur : l'événement ${event.description} n'est pas actif "
              + s"actuellement")
      case _ =>
        div()
    }

  def fileFeedbackFr(validatedFile: Either[Err, dom.File]): HtmlElement =
    validatedFile match {
      case Left(Err.FileTooBig(size, maxSize)) =>
        div(s"Erreur : le fichier est trop gros (taille max. ${maxSize}).")
      case _ =>
        div()
    }

  // Token
  val tokenKeys = Var[Option[(String, String)]](None)
  // TODO maybe used Cat's Validated instead of Either
  val validatedToken: Signal[Either[Err, Token]] = {
    val tokenFor: String => Future[Either[Err, Token]] = {
      def tokenFor(tokenKey: String): Future[Either[Err, Token]] =
        Fetch.fetch(s"$apiBaseURL/token/$tokenKey")
          .flatMap(_.text())
          .map(t => Right(read[Token](t)))
          .recover(_ => Left(Err.UnknownTokenKey(tokenKey)))

      val table = MutableMap[String, Future[Either[Err, Token]]]()
      tokenKey: String => table.getOrElseUpdate(tokenKey, tokenFor(tokenKey))
    }

    def checkTokenActivity(token: Token): Either[Err, Token] = {
      val now = Date.now()
      val validFrom = token.event.validFrom * 1000
      val validTo = token.event.validTo * 1000
      val validNow = validFrom <= now && now <= validTo
      Either.cond(validNow, token, Err.InactiveEvent(token.event))
    }

    implicit val signalFlatteningStrategy = SwitchFutureStrategy
    val validatedTokenStream = tokenKeys.signal.flatMap {
      case Some((k1, k2)) =>
        for {
          maybeT1 <- tokenFor(k1)
          maybeT2 <- tokenFor(k2)
        } yield {
          for {
            t1 <- maybeT1
            t2 <- maybeT2
            t12 <- t1.append(t2).toRight(Err.MismatchedEvents(t1, t2))
            t <- checkTokenActivity(t12)
          } yield t
        }

      case None =>
        Future.successful(Left(Err.Empty))
    }

    validatedTokenStream.startWith(Left(Err.Empty))
  }

  // File
  val file = Var[Option[dom.File]](None)
  val validatedFile: Signal[Either[Err, dom.File]] =
    file.signal.combineWith(validatedToken)
      .map {
        case (Some(f), Right(t)) if f.size > t.event.maxFileSize =>
          Left(Err.FileTooBig(f.size.toLong, t.event.maxFileSize))
        case (Some(f), Right(t)) =>
          Right(f)
        case _ =>
          Left(Err.Empty)
      }

  def validatedClass(validated: Either[Any, Any]): String = validated match {
    case Left(_) => "error"
    case Right(_) => "ok"
  }

  val tokenID = "token"
  val tokenInput = input(
    idAttr := tokenID,
    typ := "text",
    name := "token",
    minLength := Token.maxKeyLength,
    maxLength := Token.maxKeyLength,
    required := true,
    spellCheck := false,
    size := Token.maxKeyLength,
    inContext { thisNode =>
      onInput.mapTo(
        Option.when(Token.isValidKey(2)(thisNode.ref.value)) {
          val Seq(k1, k2) = Token.splitKey(thisNode.ref.value)
          (k1, k2) }) --> tokenKeys })
  val tokenFeedback = div(
    className := "feedback",
    className <-- validatedToken.map(validatedClass),
    child <-- validatedToken.map(tokenFeedbackFr))
 
  val webkitdirectory: ReactiveProp[Boolean,Boolean] = customProp("webkitdirectory", BooleanAsIsCodec) // imaginary prop

  val fileID = "file"
  val fileInput = input(
    idAttr := fileID,
    typ := "file",
    name := "file",
    multiple:= true,
    required := true,
    webkitdirectory := true , 
    inContext { thisNode =>
        onChange.mapTo(Option.when(thisNode.ref.files.length > 0)
                                (zipFile(thisNode.ref.files))) --> file })

  
    
     
  
   // zip the selected folder 
  def zipFile(files : dom.raw.FileList): dom.raw.File = {  
    val zip = new ZipWriter(new Data64URIWriter("application/zip"))
    var result : dom.raw.Blob  = new dom.raw.Blob()
    js.Promise.all(inputFilestoArray(files)
    .map(file => {
        println(file._1.name)
        zip.add(file._2, new BlobReader(file._1));   
    }))
    .toFuture.andThen({
      case Success(value) =>  
      zip.close().toFuture.andThen({
        case Success(value) => {
          val link = document.createElement("a").asInstanceOf[dom.raw.HTMLAnchorElement];
    
      link.textContent = "Download";
          link.href= value.toString()
          result = new dom.raw.Blob(js.Array.apply(value))
            document.body.appendChild(link)
        }
      });
    
      });
    
      println(result)
  result.asInstanceOf[dom.raw.File]
  }        
  

  def inputFilestoArray(files : dom.raw.FileList) : js.Array[(File_c,String)] = {
       
       
        println(files.length)
       
        var t_files : IndexedSeq[File_c] = for( i<- 0 to files.length-1) yield   files.item(i).asInstanceOf[File_c]
        
        var paths = t_files.toList.zip(t_files.toList.map(f => f.webkitRelativePath))
       
       
        scala.collection.mutable.Seq(paths:_*).toJSArray
  }

    
  val fileFeedback = div(
    className := "feedback",
    className <-- validatedFile.map(validatedClass),
    child <-- validatedFile.map(fileFeedbackFr))

  val submitInput = input(
    typ := "submit",
    value := "Envoyer",
    // Note: file cannot be validated if token isn't either
    disabled <-- validatedFile.map(_.isLeft))

  val submissionName = Var("")

  def submitObserver(form: dom.html.Form)(event: dom.Event): Unit = {
    event.preventDefault()

    val requestInit = new RequestInit(){}
    requestInit.method = HttpMethod.POST
    requestInit.body = new dom.FormData(form)

    Fetch.fetch(s"${apiBaseURL}/submit", requestInit)
      .flatMap(_.text())
      .map(read[SubmissionReceipt](_))
      .onComplete {
        case Success(receipt) =>
          submissionName.set(receipt.name)
        case Failure(e) =>
          dom.window.alert("Votre rendu a été refusé par le serveur !")
      }
  }

  val submissionForm = form(
    inContext { thisNode =>
      onSubmit --> Observer(submitObserver(thisNode.ref)) },
    table(
      tr(td(className := "label", label(forId := tokenID, "Jeton :")),
         td(tokenInput)),
      tr(td(colSpan := 2, tokenFeedback)),
      tr(td(className := "label", label(forId := fileID, "Archive Zip :")),
         td(fileInput)),
      tr(td(colSpan := 2, fileFeedback)),
      tr(td(), td(submitInput)))
  )

  val serverFeedback = div(
    idAttr := "server-feedback",
    visibility <-- submissionName.signal.map(n =>
      if (n.isEmpty) "hidden" else "visible"),
    "Votre rendu a bien été reçu par le serveur et stocké sous le nom :",
    div(
      idAttr := "submission-id",
      child.text <-- submissionName.signal),
    "Votre rendu sera prochainement validé et le résultat de cette ",
    "validation vous sera communiqué par e-mail, à votre adresse de l'EPFL."
  )

  render(container, div(submissionForm, serverFeedback))
}



@JSExportTopLevel("SubserveClient")
object Client {
  @JSExport
  def start(apiBaseURL: String, container: dom.Element): Unit = {
    new Client(apiBaseURL, container)
  }
}
