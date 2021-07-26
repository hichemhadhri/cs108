package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.BytesWritten
import typings.node.anon.Encoding
import typings.node.anon.EncodingBufferEncoding
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAbor
import typings.node.anon.ObjectEncodingOptionsflagFlag
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.`3`
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingnullundefinedflag
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.eventsMod.Abortable
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.ObjectEncodingOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.ReadVResult
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.WatchOptions
import typings.node.fsMod.WriteVResult
import typings.node.nodeFsMod.BigIntStats
import typings.node.nodeFsMod.Dir
import typings.node.nodeFsMod.Dirent
import typings.node.nodeFsMod.Stats
import typings.node.nodeStreamMod.Stream
import typings.node.nodeStrings.buffer_
import typings.node.workerThreadsMod._TransferListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsPromisesMod {
  
  @JSImport("fs/promises", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Asynchronously tests a user's permissions for the file specified by path.
    * @param path A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @scala.inline
  def access(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def access(path: PathLike, mode: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously append data to a file, creating the file if it does not exist.
    * @param file A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'a'` is used.
    */
  @scala.inline
  def appendFile(path: PathLike, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: java.lang.String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(
    path: PathLike,
    data: js.typedarray.Uint8Array,
    options: ObjectEncodingOptions with FlagAndOpenMode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: PathLike, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: java.lang.String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(
    path: FileHandle,
    data: js.typedarray.Uint8Array,
    options: ObjectEncodingOptions with FlagAndOpenMode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def appendFile(path: FileHandle, data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous chmod(2) - Change permissions of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @scala.inline
  def chmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def chown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously copies `src` to `dest`. By default, `dest` is overwritten if it already exists.
    * Node.js makes no guarantees about the atomicity of the copy operation.
    * If an error occurs after the destination file has been opened for writing, Node.js will attempt
    * to remove the destination.
    * @param src A path to the source file.
    * @param dest A path to the destination file.
    * @param flags An optional integer that specifies the behavior of the copy operation. The only
    * supported flag is `fs.constants.COPYFILE_EXCL`, which causes the copy operation to fail if
    * `dest` already exists.
    */
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike, flags: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lchmod(2) - Change permissions of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
    */
  @scala.inline
  def lchmod(path: PathLike, mode: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lchown(2) - Change ownership of a file. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def lchown(path: PathLike, uid: Double, gid: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous link(2) - Create a new link (also known as a hard link) to an existing file.
    * @param existingPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def link(existingPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous lstat(2) - Get file status. Does not dereference symbolic links.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def lstat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  @scala.inline
  def lstat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats | BigIntStats]]
  
  /**
    * Changes the access and modification times of a file in the same way as `fsPromises.utimes()`,
    * with the difference that if the path refers to a symbolic link, then the link is not
    * dereferenced: instead, the timestamps of the symbolic link itself are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @scala.inline
  def lutimes(path: PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: java.lang.String, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: java.lang.String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def lutimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @scala.inline
  def mkdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  /**
    * Asynchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.Promise[js.UndefOr[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[java.lang.String]]]
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptions): js.Promise[js.UndefOr[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[java.lang.String]]]
  @scala.inline
  def mkdir(path: PathLike, options: Mode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def mkdtemp(prefix: java.lang.String): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def mkdtemp(prefix: java.lang.String, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required `prefix` to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def mkdtemp(prefix: java.lang.String, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def mkdtemp(prefix: java.lang.String, options: ObjectEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  /**
    * Asynchronous open(2) - open and possibly create a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not
    * supplied, defaults to `0o666`.
    */
  @scala.inline
  def open(path: PathLike, flags: java.lang.String): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: java.lang.String, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: Double): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  @scala.inline
  def open(path: PathLike, flags: Double, mode: Mode): js.Promise[FileHandle] = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[js.Promise[FileHandle]]
  
  @scala.inline
  def opendir(path: java.lang.String): js.Promise[Dir] = ^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Dir]]
  @scala.inline
  def opendir(path: java.lang.String, options: OpenDirOptions): js.Promise[Dir] = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dir]]
  
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @scala.inline
  def readFile(path: PathLike): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: PathLike, options: ObjectEncodingOptionsAbor): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  /**
    * Asynchronously reads the entire contents of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param options An object that may contain an optional flag.
    * If a flag is not provided, it defaults to `'r'`.
    */
  @scala.inline
  def readFile(path: PathLike, options: encodingBufferEncodingfla): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(path: PathLike, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(path: FileHandle): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: ObjectEncodingOptionsAbor): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: encodingBufferEncodingfla): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readFile(path: FileHandle, options: encodingnullundefinedflag): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readFile(path: FileHandle, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readdir(path: PathLike): js.Promise[js.Array[java.lang.String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readdir(path: PathLike, options: Encoding): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  @scala.inline
  def readdir(path: PathLike, options: ObjectEncodingOptionswith): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  /**
    * Asynchronous readdir(3) - read a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options If called with `withFileTypes: true` the result data will be an array of Dirent.
    */
  @scala.inline
  def readdir(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Promise[js.Array[Dirent]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Dirent]]]
  @scala.inline
  def readdir(path: PathLike, options: BufferEncoding): js.Promise[js.Array[java.lang.String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[java.lang.String]]]
  
  @scala.inline
  def readdir_buffer(path: PathLike, options: buffer_): js.Promise[js.Array[Buffer]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Buffer]]]
  
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readlink(path: PathLike): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def readlink(path: PathLike, options: java.lang.String): js.Promise[java.lang.String | Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String | Buffer]]
  @scala.inline
  def readlink(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def readlink(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def readlink(path: PathLike, options: ObjectEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def realpath(path: PathLike): js.Promise[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[java.lang.String]]
  @scala.inline
  def realpath(path: PathLike, options: BufferEncoding): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  /**
    * Asynchronous realpath(3) - return the canonicalized absolute pathname.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  @scala.inline
  def realpath(path: PathLike, options: BufferEncodingOption): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  @scala.inline
  def realpath(path: PathLike, options: ObjectEncodingOptions): js.Promise[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("realpath")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[java.lang.String]]
  
  /**
    * Asynchronous rename(2) - Change the name or location of a file or directory.
    * @param oldPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * @param newPath A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  @scala.inline
  def rename(oldPath: PathLike, newPath: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously removes files and directories (modeled on the standard POSIX `rm` utility).
    */
  @scala.inline
  def rm(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rm(path: PathLike, options: RmOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def rmdir(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def rmdir(path: PathLike, options: RmDirOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def stat(path: PathLike): js.Promise[Stats] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptionsbigintfalseund): js.Promise[Stats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[BigIntStats]]
  @scala.inline
  def stat(path: PathLike, opts: StatOptions): js.Promise[Stats | BigIntStats] = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Stats | BigIntStats]]
  
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  @scala.inline
  def symlink(target: PathLike, path: PathLike): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def symlink(target: PathLike, path: PathLike, `type`: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("symlink")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous truncate(2) - Truncate a file to a specified length.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param len If not specified, defaults to `0`.
    */
  @scala.inline
  def truncate(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def truncate(path: PathLike, len: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  @scala.inline
  def unlink(path: PathLike): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  @scala.inline
  def utimes(path: PathLike, atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: java.lang.String, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: java.lang.String, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: js.Date, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: js.Date): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def utimes(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  @scala.inline
  def watch(filename: PathLike): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def watch(filename: PathLike, options: java.lang.String): /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string> */ js.Any]
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  @scala.inline
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def watch(filename: PathLike, options: BufferEncoding): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  /**
    * Watch for changes on `filename`, where `filename` is either a file or a directory, returning an `FSWatcher`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the encoding for the filename provided to the listener, or an object optionally specifying encoding, persistent, and recursive options.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `persistent` is not supplied, the default of `true` is used.
    * If `recursive` is not supplied, the default of `false` is used.
    */
  @scala.inline
  def watch(filename: PathLike, options: WatchOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def watch_buffer(filename: PathLike, options: buffer_): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /**
    * Asynchronously writes data to a file, replacing the file if it already exists.
    * It is unsafe to call `fsPromises.writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    * If a `FileHandle` is provided, the underlying file will _not_ be closed automatically.
    * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
    * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
    * If `encoding` is not supplied, the default of `'utf8'` is used.
    * If `mode` is not supplied, the default of `0o666` is used.
    * If `mode` is a string, it is parsed as an octal integer.
    * If `flag` is not supplied, the default of `'w'` is used.
    */
  @scala.inline
  def writeFile(path: PathLike, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: java.lang.String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: PathLike,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: PathLike,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any,
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: PathLike,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any,
    options: BufferEncoding
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: js.Iterable[ArrayBufferView | java.lang.String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: PathLike,
    data: js.Iterable[java.lang.String | ArrayBufferView],
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: js.Iterable[java.lang.String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: PathLike, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: java.lang.String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: java.lang.String, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: FileHandle,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: FileHandle,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any,
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: FileHandle,
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AsyncIterable<string | NodeJS.ArrayBufferView> */ js.Any,
    options: BufferEncoding
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: js.Iterable[ArrayBufferView | java.lang.String]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(
    path: FileHandle,
    data: js.Iterable[java.lang.String | ArrayBufferView],
    options: ObjectEncodingOptionsmode
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: js.Iterable[java.lang.String | ArrayBufferView], options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: ArrayBufferView): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: ArrayBufferView, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: ArrayBufferView, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: Stream): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: Stream, options: ObjectEncodingOptionsmode): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def writeFile(path: FileHandle, data: Stream, options: BufferEncoding): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  // TODO: Add `EventEmitter` close
  @js.native
  trait FileHandle
    extends StObject
       with _TransferListItem {
    
    /**
      * Asynchronously append data to a file, creating the file if it does not exist. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for appending.
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'a'` is used.
      */
    def appendFile(data: java.lang.String): js.Promise[Unit] = js.native
    def appendFile(data: java.lang.String, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = js.native
    def appendFile(data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array, options: ObjectEncodingOptions with FlagAndOpenMode): js.Promise[Unit] = js.native
    def appendFile(data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchmod(2) - Change permissions of a file.
      * @param mode A file mode. If a string is passed, it is parsed as an octal integer.
      */
    def chmod(mode: Mode): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fchown(2) - Change ownership of a file.
      */
    def chown(uid: Double, gid: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous close(2) - close a `FileHandle`.
      */
    def close(): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous fdatasync(2) - synchronize a file's in-core state with storage device.
      */
    def datasync(): js.Promise[Unit] = js.native
    
    /**
      * Gets the file descriptor for this file handle.
      */
    val fd: Double = js.native
    
    def read[T /* <: js.typedarray.ArrayBufferView */](): js.Promise[FileReadResult[T]] = js.native
    /**
      * Asynchronously reads data from the file.
      * The `FileHandle` must have been opened for reading.
      * @param buffer The buffer that the data will be written to.
      * @param offset The offset in the buffer at which to start writing.
      * @param length The number of bytes to read.
      * @param position The offset from the beginning of the file from which data should be read. If `null`, data will be read from the current position.
      */
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, length: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, length: Double, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, length: Null, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Double, length: Unit, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Null, length: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Null, length: Double, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Null, length: Null, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Null, length: Unit, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Unit, length: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Unit, length: Double, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Unit, length: Null, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](buffer: T, offset: Unit, length: Unit, position: Double): js.Promise[FileReadResult[T]] = js.native
    def read[T /* <: js.typedarray.ArrayBufferView */](options: FileReadOptions[T]): js.Promise[FileReadResult[T]] = js.native
    
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(): js.Promise[Buffer] = js.native
    /**
      * Asynchronously reads the entire contents of a file. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for reading.
      * @param options An object that may contain an optional flag.
      * If a flag is not provided, it defaults to `'r'`.
      */
    def readFile(options: EncodingBufferEncoding): js.Promise[java.lang.String] = js.native
    def readFile(options: ObjectEncodingOptionsflagFlag): js.Promise[java.lang.String | Buffer] = js.native
    def readFile(options: `3`): js.Promise[Buffer] = js.native
    def readFile(options: BufferEncoding): js.Promise[java.lang.String] = js.native
    
    /**
      * See `fs.readv` promisified version.
      */
    def readv(buffers: js.Array[ArrayBufferView]): js.Promise[ReadVResult] = js.native
    def readv(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[ReadVResult] = js.native
    
    /**
      * Asynchronous fstat(2) - Get file status.
      */
    def stat(): js.Promise[Stats] = js.native
    def stat(opts: StatOptionsbigintfalseund): js.Promise[Stats] = js.native
    def stat(opts: StatOptionsbiginttrue): js.Promise[BigIntStats] = js.native
    def stat(opts: StatOptions): js.Promise[Stats | BigIntStats] = js.native
    
    /**
      * Asynchronous fsync(2) - synchronize a file's in-core state with the underlying storage device.
      */
    def sync(): js.Promise[Unit] = js.native
    
    /**
      * Asynchronous ftruncate(2) - Truncate a file to a specified length.
      * @param len If not specified, defaults to `0`.
      */
    def truncate(): js.Promise[Unit] = js.native
    def truncate(len: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously change file timestamps of the file.
      * @param atime The last access time. If a string is provided, it will be coerced to number.
      * @param mtime The last modified time. If a string is provided, it will be coerced to number.
      */
    def utimes(atime: java.lang.String, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: java.lang.String, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: java.lang.String, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: js.Date, mtime: Double): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: java.lang.String): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: js.Date): js.Promise[Unit] = js.native
    def utimes(atime: Double, mtime: Double): js.Promise[Unit] = js.native
    
    /**
      * Asynchronously writes `string` to the file.
      * The `FileHandle` must have been opened for writing.
      * It is unsafe to call `write()` multiple times on the same file without waiting for the `Promise`
      * to be resolved (or rejected). For this scenario, `fs.createWriteStream` is strongly recommended.
      * @param string A string to write.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      * @param encoding The expected string encoding.
      */
    def write(data: java.lang.String): js.Promise[BytesWritten] = js.native
    def write(data: java.lang.String, position: Double): js.Promise[BytesWritten] = js.native
    def write(data: java.lang.String, position: Double, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: java.lang.String, position: Null, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: java.lang.String, position: Unit, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: js.typedarray.Uint8Array): js.Promise[BytesWritten] = js.native
    def write(data: js.typedarray.Uint8Array, position: Double): js.Promise[BytesWritten] = js.native
    def write(data: js.typedarray.Uint8Array, position: Double, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: js.typedarray.Uint8Array, position: Null, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    def write(data: js.typedarray.Uint8Array, position: Unit, encoding: BufferEncoding): js.Promise[BytesWritten] = js.native
    /**
      * Asynchronously writes `buffer` to the file.
      * The `FileHandle` must have been opened for writing.
      * @param buffer The buffer that the data will be written to.
      * @param offset The part of the buffer to be written. If not supplied, defaults to `0`.
      * @param length The number of bytes to write. If not supplied, defaults to `buffer.length - offset`.
      * @param position The offset from the beginning of the file where this data should be written. If not supplied, defaults to the current position.
      */
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Double, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Null, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Double, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Null, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    def write[TBuffer /* <: js.typedarray.Uint8Array */](buffer: TBuffer, offset: Unit, length: Unit, position: Double): js.Promise[typings.node.anon.Buffer[TBuffer]] = js.native
    
    /**
      * Asynchronously writes data to a file, replacing the file if it already exists. The underlying file will _not_ be closed automatically.
      * The `FileHandle` must have been opened for writing.
      * It is unsafe to call `writeFile()` multiple times on the same file without waiting for the `Promise` to be resolved (or rejected).
      * @param data The data to write. If something other than a `Buffer` or `Uint8Array` is provided, the value is coerced to a string.
      * @param options Either the encoding for the file, or an object optionally specifying the encoding, file mode, and flag.
      * If `encoding` is not supplied, the default of `'utf8'` is used.
      * If `mode` is not supplied, the default of `0o666` is used.
      * If `mode` is a string, it is parsed as an octal integer.
      * If `flag` is not supplied, the default of `'w'` is used.
      */
    def writeFile(data: java.lang.String): js.Promise[Unit] = js.native
    def writeFile(data: java.lang.String, options: ObjectEncodingOptions with FlagAndOpenMode with Abortable): js.Promise[Unit] = js.native
    def writeFile(data: java.lang.String, options: BufferEncoding): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array, options: ObjectEncodingOptions with FlagAndOpenMode with Abortable): js.Promise[Unit] = js.native
    def writeFile(data: js.typedarray.Uint8Array, options: BufferEncoding): js.Promise[Unit] = js.native
    
    /**
      * See `fs.writev` promisified version.
      */
    def writev(buffers: js.Array[ArrayBufferView]): js.Promise[WriteVResult] = js.native
    def writev(buffers: js.Array[ArrayBufferView], position: Double): js.Promise[WriteVResult] = js.native
  }
  
  @js.native
  trait FileReadOptions[T /* <: js.typedarray.ArrayBufferView */] extends StObject {
    
    /**
      * @default `Buffer.alloc(0xffff)`
      */
    var buffer: js.UndefOr[T] = js.native
    
    /**
      * @default `buffer.byteLength`
      */
    var length: js.UndefOr[Double | Null] = js.native
    
    /**
      * @default 0
      */
    var offset: js.UndefOr[Double | Null] = js.native
    
    var position: js.UndefOr[Double | Null] = js.native
  }
  object FileReadOptions {
    
    @scala.inline
    def apply[T /* <: js.typedarray.ArrayBufferView */](): FileReadOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileReadOptions[T]]
    }
    
    @scala.inline
    implicit class FileReadOptionsMutableBuilder[Self <: FileReadOptions[_], T /* <: js.typedarray.ArrayBufferView */] (val x: Self with FileReadOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthNull: Self = StObject.set(x, "length", null)
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetNull: Self = StObject.set(x, "offset", null)
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionNull: Self = StObject.set(x, "position", null)
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
  
  @js.native
  trait FileReadResult[T /* <: js.typedarray.ArrayBufferView */] extends StObject {
    
    var buffer: T = js.native
    
    var bytesRead: Double = js.native
  }
  object FileReadResult {
    
    @scala.inline
    def apply[T /* <: js.typedarray.ArrayBufferView */](buffer: T, bytesRead: Double): FileReadResult[T] = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], bytesRead = bytesRead.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileReadResult[T]]
    }
    
    @scala.inline
    implicit class FileReadResultMutableBuilder[Self <: FileReadResult[_], T /* <: js.typedarray.ArrayBufferView */] (val x: Self with FileReadResult[T]) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: T): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesRead(value: Double): Self = StObject.set(x, "bytesRead", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FlagAndOpenMode extends StObject {
    
    var flag: js.UndefOr[OpenMode] = js.native
    
    var mode: js.UndefOr[Mode] = js.native
  }
  object FlagAndOpenMode {
    
    @scala.inline
    def apply(): FlagAndOpenMode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagAndOpenMode]
    }
    
    @scala.inline
    implicit class FlagAndOpenModeMutableBuilder[Self <: FlagAndOpenMode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlag(value: OpenMode): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagUndefined: Self = StObject.set(x, "flag", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
}
