package cs107

import org.scalajs.dom
import scala.scalajs.js
import org.scalajs.dom.document
 

import org.w3c.dom.html.HTMLInputElement
import java.awt.event.MouseEvent
import scala.scalajs.js.annotation.JSImport
import typings.zipJsZipJs.mod.ZipWriter
import typings.zipJsZipJs.mod.Data64URIWriter
import typings.zipJsZipJs.mod.BlobReader
import scala.collection.mutable
import js.JSConverters._
import com.raquo.laminar.api.L._
import java.io.File
import java.net.URL
import scala.concurrent.Await
import scala.concurrent.duration.Duration
import scala.util.Success



object Main {
  //val zip = g.require("@zip.js/zip.js"); // import zip.js module 
  //val fs = g.require("fs"); // to download the zip file locally

  // Note : still could not find a way to work with zip.js inside scala
  val paths : List[String] = List()
  val inputF  = document.getElementById("directory").asInstanceOf[dom.raw.HTMLInputElement] // get the input tag in index.html
  val button1  = document.getElementById("button").asInstanceOf[dom.raw.Element] // get the button tag in index.html
  val div  = document.getElementById("path").asInstanceOf[dom.raw.HTMLDivElement]
  implicit val ec: scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global

   

  def main(args: Array[String]): Unit = {
  //render(dom.document.body,app)
  //listener to the button element
    button1.addEventListener("click", { (e: dom.MouseEvent) =>
    zipFile()
    val zip = new ZipWriter(new Data64URIWriter("application/zip"))

    js.Promise.all(displayFiles().filter(file=> file._1.name.endsWith(".java") ).map(file => {
      
        appendPar(document.body, file._2  )
  
        zip.add(file._2, new BlobReader(file._1));   
      
    })).toFuture.andThen({
      case Success(value) =>  val link = document.createElement("a").asInstanceOf[dom.raw.HTMLAnchorElement];
    
    link.dir = "test.zip"; 
    link.textContent = "Download";
   zip.close().toFuture.andThen({
     case Success(value) => link.href = value.toString()
   })
    document.body.appendChild(link);

    });
   

  })
  }

@js.annotation.JSExportTopLevel("addFiles")
def addFiles(path : String): Unit = {
  path :: paths
  
}

@js.annotation.JSExportTopLevel("addClickedMessage")
def addClickedMessage(): Unit = {
  appendPar(document.body, "You clicked the button!")
}

  def appendPar(targetNode: dom.Node, text: String): Unit = {
  val parNode = document.createElement("p")
  parNode.textContent = text
  targetNode.appendChild(parNode)
}
  
  //turn the selected files into a scala list and display them on console
  def displayFiles() : js.Array[(dom.raw.File,String)] = {
        
        println(inputF.files.length)
        val path = div.innerHTML.split("<br>").toList
        var files : IndexedSeq[dom.raw.File] = for( i<- 0 to inputF.files.length-1) yield inputF.files.item(i)
        var paths = files.toList.zip(path)
       
        scala.collection.mutable.Seq(paths:_*).toJSArray
  }

//event handler for the button 
  def zipFile(): Unit = {  
   println(paths)
   val l = displayFiles()

  
 
}
 
}