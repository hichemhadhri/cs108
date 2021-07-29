package cs108

import org.scalajs.dom
import scala.scalajs.js
import org.scalajs.dom.document
import org.w3c.dom.html.HTMLInputElement
import java.awt.event.MouseEvent
import typings.zipJsZipJs.mod.ZipWriter
import typings.zipJsZipJs.mod.Data64URIWriter
import typings.zipJsZipJs.mod.BlobReader
import scala.collection.mutable
import js.JSConverters._
import scala.util.Success



object Main {
 
  //val paths : List[String] = List()
  val inputF  = document.getElementById("directory").asInstanceOf[dom.raw.HTMLInputElement] // get the input tag in index.html
  val button1  = document.getElementById("button").asInstanceOf[dom.raw.Element] // get the button tag in index.html
  implicit val ec: scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global // global execution context to work with futures

   
  
  

  def main(args: Array[String]): Unit = {
    //listener to the button element
     index.start("https://cs108.epfl.ch/api",document.getElementById("submission-form"))
    
  }


  //turn the selected files into a scala list and display them on console
  def inputFilestoArray() : js.Array[(dom.raw.File,String)] = {
        /*
        this div element is added to the body in index.html to hold the webkit relative path of the files 
        then retrived here to extract those paths and then gets deleted 
        */
        val div  = document.getElementById("path").asInstanceOf[dom.raw.HTMLDivElement] 

        println(inputF.files.length)
        val path = div.innerHTML.split("<br>").toList
        var files : IndexedSeq[dom.raw.File] = for( i<- 0 to inputF.files.length-1) yield inputF.files.item(i)
        var paths = files.toList.zip(path)
        document.body.removeChild(div)
        scala.collection.mutable.Seq(paths:_*).toJSArray
  }

  // zip the selected folder 
  def zipFile(): Unit = {  
    val zip = new ZipWriter(new Data64URIWriter("application/zip"))

    js.Promise.all(inputFilestoArray().filter(file=> file._1.name.endsWith(".java") ).map(file => {
        zip.add(file._2, new BlobReader(file._1));   
    }))
    .toFuture.andThen({
      case Success(value) =>  val link = document.createElement("a").asInstanceOf[dom.raw.HTMLAnchorElement];
    
      link.dir = "test.zip"; 
      
      link.textContent = "Download";
      zip.close().toFuture.andThen({
        case Success(value) => link.href = value.toString()
      });

      document.body.appendChild(link);
      
    });

  
 
}
 
}


object index {
  
  def start(apiBaseURL: String, container: dom.Element): Unit = {
    new Client(apiBaseURL, container)
  }
}