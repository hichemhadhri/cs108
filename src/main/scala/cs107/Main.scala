package cs107

import org.scalajs.dom
import scala.scalajs.js
import org.scalajs.dom.document
 
import js.Dynamic.{global => g}
import js.DynamicImplicits._
import org.w3c.dom.html.HTMLInputElement
import java.awt.event.MouseEvent
import scala.scalajs.js.annotation.JSImport
import typings.zipJsZipJs.mod.ZipWriter
import typings.zipJsZipJs.mod.Data64URIWriter
import typings.zipJsZipJs.mod.BlobReader
import scala.collection.mutable
import js.JSConverters._



object TutorialApp {
  //val zip = g.require("@zip.js/zip.js"); // import zip.js module 
  //val fs = g.require("fs"); // to download the zip file locally

  // Note : still could not find a way to work with zip.js inside scala

  val input  = document.getElementById("directory").asInstanceOf[dom.raw.HTMLInputElement] // get the input tag in index.html
  val button1  = document.getElementById("button").asInstanceOf[dom.raw.Element] // get the button tag in index.html
  


  def main(args: Array[String]): Unit = {
  
  //listener to the button element
    button1.addEventListener("click", { (e: dom.MouseEvent) =>
    zipFile()
    val zip = new ZipWriter(new Data64URIWriter("application/zip"))
    js.Promise.all(displayFiles().map(file => {
      zip.add(file.name, new BlobReader(file));   
    }));
    val link = document.createElement("a").asInstanceOf[dom.raw.HTMLAnchorElement];
    zip.close()
    link.dir = "test.zip"; 
    link.textContent = "Download";
    document.body.appendChild(link);
  

    

  })
  }
  
  //turn the selected files into a scala list and display them on console
  def displayFiles() : js.Array[dom.raw.File] = {
        
        println(input.files.length)

        var files : IndexedSeq[dom.raw.File] = for( i<- 0 to input.files.length-1) yield input.files.item(i)
        files.foreach(f => println(f.name))

        scala.collection.mutable.Seq(files:_*).toJSArray
  }

//event handler for the button 
  def zipFile(): Unit = {  
   
   val l = displayFiles()

  
 
}
 
}