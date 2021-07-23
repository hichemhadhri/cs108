package typings.zipJsZipJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@zip.js/zip.js", "ZipWriter")
@js.native
class ZipWriter protected () extends StObject {
  def this(writer: Writer) = this()
  def this(writer: Writer, options: ZipWriterOptions) = this()
  
  def add(name: String, reader: Reader): js.Promise[Entry] = js.native
  def add(name: String, reader: Reader, options: AddDataOptions): js.Promise[Entry] = js.native
  def add(name: String, reader: Reader, options: OnprogressEntryDataOption): js.Promise[Entry] = js.native
  def add(name: String, reader: Reader, options: ZipWriterOptions): js.Promise[Entry] = js.native
  
  def close(): js.Promise[js.Any] = js.native
  def close(comment: js.typedarray.Uint8Array): js.Promise[js.Any] = js.native
  def close(comment: js.typedarray.Uint8Array, options: CloseOptions): js.Promise[js.Any] = js.native
  def close(comment: js.typedarray.Uint8Array, options: OnprogressEntryOption): js.Promise[js.Any] = js.native
  def close(comment: Unit, options: CloseOptions): js.Promise[js.Any] = js.native
  def close(comment: Unit, options: OnprogressEntryOption): js.Promise[js.Any] = js.native
  
  val hasCorruptedEntries: js.UndefOr[Boolean] = js.native
}
