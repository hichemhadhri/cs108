package typings.node

import typings.node.NodeJS.ArrayBufferView
import typings.node.NodeJS.ErrnoException
import typings.node.anon.Encoding
import typings.node.anon.EncodingFlag
import typings.node.anon.Flag
import typings.node.anon.Interval
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.anon.ObjectEncodingOptionsAbor
import typings.node.anon.ObjectEncodingOptionsflag
import typings.node.anon.ObjectEncodingOptionsflagEncoding
import typings.node.anon.ObjectEncodingOptionsmode
import typings.node.anon.ObjectEncodingOptionswith
import typings.node.anon.ObjectEncodingOptionswithEncoding
import typings.node.anon.StatOptionsbigintfalseund
import typings.node.anon.StatOptionsbiginttrue
import typings.node.anon.WatchOptionsencodingbuffe
import typings.node.anon.WithFileTypes
import typings.node.anon.`2`
import typings.node.anon.encodingBufferEncodingfla
import typings.node.anon.encodingBufferEncodingflaEncoding
import typings.node.anon.encodingnullundefinedflag
import typings.node.anon.encodingnullundefinedflagEncoding
import typings.node.bufferMod.global.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.fsMod.BufferEncodingOption
import typings.node.fsMod.EncodingOption
import typings.node.fsMod.FSWatcher
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.NoParamCallback
import typings.node.fsMod.ObjectEncodingOptions
import typings.node.fsMod.OpenDirOptions
import typings.node.fsMod.OpenMode
import typings.node.fsMod.PathLike
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.ReadPosition
import typings.node.fsMod.ReadStreamOptions
import typings.node.fsMod.ReadSyncOptions
import typings.node.fsMod.RmDirOptions
import typings.node.fsMod.RmOptions
import typings.node.fsMod.StatOptions
import typings.node.fsMod.StatSyncFn
import typings.node.fsMod.StreamOptions
import typings.node.fsMod.TimeLike
import typings.node.fsMod.WatchListener
import typings.node.fsMod.WatchOptions
import typings.node.fsMod.WriteFileOptions
import typings.node.fsMod.symlink.Type
import typings.node.fsPromisesMod.FileHandle
import typings.node.fsPromisesMod.FlagAndOpenMode
import typings.node.nodeStreamMod.Stream
import typings.node.nodeStrings.buffer_
import typings.node.streamMod.ReadableOptions
import typings.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFsMod {
  
  @JSImport("node:fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("node:fs", "BigIntStats")
  @js.native
  class BigIntStats ()
    extends typings.node.fsMod.BigIntStats
  
  @JSImport("node:fs", "Dir")
  @js.native
  class Dir ()
    extends typings.node.fsMod.Dir
  
  @JSImport("node:fs", "Dirent")
  @js.native
  class Dirent ()
    extends typings.node.fsMod.Dirent
  
  @JSImport("node:fs", "ReadStream")
  @js.native
  class ReadStream () extends StObject {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("node:fs", "Stats")
  @js.native
  class Stats ()
    extends typings.node.fsMod.Stats
  
  @JSImport("node:fs", "WriteStream")
  @js.native
  class WriteStream () extends StObject {
    def this(opts: WritableOptions) = this()
  }
  
  @scala.inline
  def access(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def access(path: PathLike, mode: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def access(path: PathLike, mode: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("access")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def accessSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def accessSync(path: PathLike, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("accessSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def appendFile(file: PathOrFileDescriptor, data: java.lang.String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFile(
    file: PathOrFileDescriptor,
    data: java.lang.String,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFile(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFile(
    file: PathOrFileDescriptor,
    data: js.typedarray.Uint8Array,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFile")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def appendFileSync(file: PathOrFileDescriptor, data: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFileSync(file: PathOrFileDescriptor, data: java.lang.String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFileSync(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def appendFileSync(file: PathOrFileDescriptor, data: js.typedarray.Uint8Array, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("appendFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chown(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def chownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def close(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def close(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("close")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def closeSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closeSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  object constants {
    
    // File Copy Constants
    /** Constant for fs.copyFile. Flag indicating the destination file should not be overwritten if it already exists. */
    @JSImport("node:fs", "constants.COPYFILE_EXCL")
    @js.native
    val COPYFILE_EXCL: Double = js.native
    
    /**
      * Constant for fs.copyFile. copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then a fallback copy mechanism is used.
      */
    @JSImport("node:fs", "constants.COPYFILE_FICLONE")
    @js.native
    val COPYFILE_FICLONE: Double = js.native
    
    /**
      * Constant for fs.copyFile. Copy operation will attempt to create a copy-on-write reflink.
      * If the underlying platform does not support copy-on-write, then the operation will fail with an error.
      */
    @JSImport("node:fs", "constants.COPYFILE_FICLONE_FORCE")
    @js.native
    val COPYFILE_FICLONE_FORCE: Double = js.native
    
    // File Access Constants
    /** Constant for fs.access(). File is visible to the calling process. */
    @JSImport("node:fs", "constants.F_OK")
    @js.native
    val F_OK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that data will be appended to the end of the file. */
    @JSImport("node:fs", "constants.O_APPEND")
    @js.native
    val O_APPEND: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to create the file if it does not already exist. */
    @JSImport("node:fs", "constants.O_CREAT")
    @js.native
    val O_CREAT: Double = js.native
    
    /** Constant for fs.open(). When set, an attempt will be made to minimize caching effects of file I/O. */
    @JSImport("node:fs", "constants.O_DIRECT")
    @js.native
    val O_DIRECT: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is not a directory. */
    @JSImport("node:fs", "constants.O_DIRECTORY")
    @js.native
    val O_DIRECTORY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O with write operations waiting for data integrity. */
    @JSImport("node:fs", "constants.O_DSYNC")
    @js.native
    val O_DSYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that opening a file should fail if the O_CREAT flag is set and the file already exists. */
    @JSImport("node:fs", "constants.O_EXCL")
    @js.native
    val O_EXCL: Double = js.native
    
    /**
      * constant for fs.open().
      * Flag indicating reading accesses to the file system will no longer result in
      * an update to the atime information associated with the file.
      * This flag is available on Linux operating systems only.
      */
    @JSImport("node:fs", "constants.O_NOATIME")
    @js.native
    val O_NOATIME: Double = js.native
    
    /**
      * Constant for fs.open(). Flag indicating that if path identifies a terminal device,
      * opening the path shall not cause that terminal to become the controlling terminal for the process
      * (if the process does not already have one).
      */
    @JSImport("node:fs", "constants.O_NOCTTY")
    @js.native
    val O_NOCTTY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the open should fail if the path is a symbolic link. */
    @JSImport("node:fs", "constants.O_NOFOLLOW")
    @js.native
    val O_NOFOLLOW: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the file in nonblocking mode when possible. */
    @JSImport("node:fs", "constants.O_NONBLOCK")
    @js.native
    val O_NONBLOCK: Double = js.native
    
    // File Open Constants
    /** Constant for fs.open(). Flag indicating to open a file for read-only access. */
    @JSImport("node:fs", "constants.O_RDONLY")
    @js.native
    val O_RDONLY: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for read-write access. */
    @JSImport("node:fs", "constants.O_RDWR")
    @js.native
    val O_RDWR: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open the symbolic link itself rather than the resource it is pointing to. */
    @JSImport("node:fs", "constants.O_SYMLINK")
    @js.native
    val O_SYMLINK: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that the file is opened for synchronous I/O. */
    @JSImport("node:fs", "constants.O_SYNC")
    @js.native
    val O_SYNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating that if the file exists and is a regular file, and the file is opened successfully for write access, its length shall be truncated to zero. */
    @JSImport("node:fs", "constants.O_TRUNC")
    @js.native
    val O_TRUNC: Double = js.native
    
    /** Constant for fs.open(). Flag indicating to open a file for write-only access. */
    @JSImport("node:fs", "constants.O_WRONLY")
    @js.native
    val O_WRONLY: Double = js.native
    
    /** Constant for fs.access(). File can be read by the calling process. */
    @JSImport("node:fs", "constants.R_OK")
    @js.native
    val R_OK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a block-oriented device file. */
    @JSImport("node:fs", "constants.S_IFBLK")
    @js.native
    val S_IFBLK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a character-oriented device file. */
    @JSImport("node:fs", "constants.S_IFCHR")
    @js.native
    val S_IFCHR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a directory. */
    @JSImport("node:fs", "constants.S_IFDIR")
    @js.native
    val S_IFDIR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a FIFO/pipe. */
    @JSImport("node:fs", "constants.S_IFIFO")
    @js.native
    val S_IFIFO: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a symbolic link. */
    @JSImport("node:fs", "constants.S_IFLNK")
    @js.native
    val S_IFLNK: Double = js.native
    
    // File Type Constants
    /** Constant for fs.Stats mode property for determining a file's type. Bit mask used to extract the file type code. */
    @JSImport("node:fs", "constants.S_IFMT")
    @js.native
    val S_IFMT: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a regular file. */
    @JSImport("node:fs", "constants.S_IFREG")
    @js.native
    val S_IFREG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining a file's type. File type constant for a socket. */
    @JSImport("node:fs", "constants.S_IFSOCK")
    @js.native
    val S_IFSOCK: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by group. */
    @JSImport("node:fs", "constants.S_IRGRP")
    @js.native
    val S_IRGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by others. */
    @JSImport("node:fs", "constants.S_IROTH")
    @js.native
    val S_IROTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable by owner. */
    @JSImport("node:fs", "constants.S_IRUSR")
    @js.native
    val S_IRUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by group. */
    @JSImport("node:fs", "constants.S_IRWXG")
    @js.native
    val S_IRWXG: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by others. */
    @JSImport("node:fs", "constants.S_IRWXO")
    @js.native
    val S_IRWXO: Double = js.native
    
    // File Mode Constants
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating readable, writable and executable by owner. */
    @JSImport("node:fs", "constants.S_IRWXU")
    @js.native
    val S_IRWXU: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by group. */
    @JSImport("node:fs", "constants.S_IWGRP")
    @js.native
    val S_IWGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by others. */
    @JSImport("node:fs", "constants.S_IWOTH")
    @js.native
    val S_IWOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating writable by owner. */
    @JSImport("node:fs", "constants.S_IWUSR")
    @js.native
    val S_IWUSR: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by group. */
    @JSImport("node:fs", "constants.S_IXGRP")
    @js.native
    val S_IXGRP: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by others. */
    @JSImport("node:fs", "constants.S_IXOTH")
    @js.native
    val S_IXOTH: Double = js.native
    
    /** Constant for fs.Stats mode property for determining access permissions for a file. File mode indicating executable by owner. */
    @JSImport("node:fs", "constants.S_IXUSR")
    @js.native
    val S_IXUSR: Double = js.native
    
    /**
      * When set, a memory file mapping is used to access the file. This flag
      * is available on Windows operating systems only. On other operating systems,
      * this flag is ignored.
      */
    @JSImport("node:fs", "constants.UV_FS_O_FILEMAP")
    @js.native
    val UV_FS_O_FILEMAP: Double = js.native
    
    /** Constant for fs.access(). File can be written by the calling process. */
    @JSImport("node:fs", "constants.W_OK")
    @js.native
    val W_OK: Double = js.native
    
    /** Constant for fs.access(). File can be executed by the calling process. */
    @JSImport("node:fs", "constants.X_OK")
    @js.native
    val X_OK: Double = js.native
  }
  
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def copyFile(src: PathLike, dest: PathLike, flags: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFile")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def copyFileSync(src: PathLike, dest: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def copyFileSync(src: PathLike, dest: PathLike, flags: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyFileSync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def createReadStream(path: PathLike): typings.node.fsMod.ReadStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: PathLike, options: java.lang.String): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  @scala.inline
  def createReadStream(path: PathLike, options: ReadStreamOptions): typings.node.fsMod.ReadStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createReadStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.ReadStream]
  
  @scala.inline
  def createWriteStream(path: PathLike): typings.node.fsMod.WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: PathLike, options: java.lang.String): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  @scala.inline
  def createWriteStream(path: PathLike, options: StreamOptions): typings.node.fsMod.WriteStream = (^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.WriteStream]
  
  @scala.inline
  def exists(path: PathLike, callback: js.Function1[/* exists */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def existsSync(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("existsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def fchmod(fd: Double, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmod")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fchmodSync(fd: Double, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchmodSync")(fd.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fchown(fd: Double, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchown")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fchownSync(fd: Double, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fchownSync")(fd.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fdatasync(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fdatasync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fdatasyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fdatasyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def fstat(
    fd: Double,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fstat(
    fd: Double,
    options: Unit,
    callback: js.Function2[
      ErrnoException | Null, 
      typings.node.fsMod.BigIntStats | (/* stats */ typings.node.fsMod.Stats), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fstat(
    fd: Double,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fstat(
    fd: Double,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.BigIntStats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def fstat(
    fd: Double,
    options: StatOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fstat")(fd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node:fs", "fstatSync")
  @js.native
  val fstatSync: StatSyncFn[Double] = js.native
  
  @scala.inline
  def fsync(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fsync")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def fsyncSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fsyncSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def ftruncate(fd: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ftruncate(fd: Double, len: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ftruncate(fd: Double, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ftruncate(fd: Double, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncate")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def ftruncateSync(fd: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def ftruncateSync(fd: Double, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ftruncateSync")(fd.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def futimes(fd: Double, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimes")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def futimesSync(fd: Double, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("futimesSync")(fd.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lchmod(path: PathLike, mode: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmod")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lchmodSync(path: PathLike, mode: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchmodSync")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lchown(path: PathLike, uid: Double, gid: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchown")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lchownSync(path: PathLike, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lchownSync")(path.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def link(existingPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def linkSync(existingPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("linkSync")(existingPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lstat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def lstat(
    path: PathLike,
    options: Unit,
    callback: js.Function2[
      ErrnoException | Null, 
      typings.node.fsMod.BigIntStats | (/* stats */ typings.node.fsMod.Stats), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def lstat(
    path: PathLike,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def lstat(
    path: PathLike,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.BigIntStats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def lstat(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lstat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node:fs", "lstatSync")
  @js.native
  val lstatSync: StatSyncFn[PathLike] = js.native
  
  @scala.inline
  def lutimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def lutimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lutimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mkdir(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(
    path: PathLike,
    options: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(path: PathLike, options: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(
    path: PathLike,
    options: Unit,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(path: PathLike, options: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptionsrecur,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(
    path: PathLike,
    options: MakeDirectoryOptions,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(
    path: PathLike,
    options: Mode,
    callback: js.Function2[/* err */ ErrnoException | Null, /* path */ js.UndefOr[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(path: PathLike, options: Mode, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mkdirSync(path: PathLike): js.UndefOr[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdirSync(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def mkdirSync(path: PathLike, options: Mode): js.UndefOr[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[java.lang.String]]
  
  @scala.inline
  def mkdirSync_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def mkdirSync_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ java.lang.String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: `2`,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* folder */ java.lang.String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdtemp(
    prefix: java.lang.String,
    options: buffer_,
    callback: js.Function2[/* err */ ErrnoException | Null, /* folder */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtemp")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mkdtempSync(prefix: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def mkdtempSync(prefix: java.lang.String, options: EncodingOption): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String): java.lang.String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | Buffer]
  @scala.inline
  def mkdtempSync_Union(prefix: java.lang.String, options: EncodingOption): java.lang.String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdtempSync")(prefix.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Buffer]
  
  @scala.inline
  def open(
    path: PathLike,
    flags: OpenMode,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(
    path: PathLike,
    flags: OpenMode,
    mode: Null,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(
    path: PathLike,
    flags: OpenMode,
    mode: Unit,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(
    path: PathLike,
    flags: OpenMode,
    mode: Mode,
    callback: js.Function2[/* err */ ErrnoException | Null, /* fd */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def openSync(path: PathLike, flags: OpenMode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def openSync(path: PathLike, flags: OpenMode, mode: Mode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(path.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def opendir(
    path: java.lang.String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def opendir(
    path: java.lang.String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typings.node.fsMod.Dir, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("opendir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def opendirSync(path: java.lang.String): typings.node.fsMod.Dir = ^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any]).asInstanceOf[typings.node.fsMod.Dir]
  @scala.inline
  def opendirSync(path: java.lang.String, options: OpenDirOptions): typings.node.fsMod.Dir = (^.asInstanceOf[js.Dynamic].applyDynamic("opendirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.node.fsMod.Dir]
  
  object promises {
    
    @JSImport("node:fs", "promises")
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
  }
  
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def read[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: ReadPosition,
    callback: js.Function3[/* err */ ErrnoException | Null, /* bytesRead */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: java.lang.String,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* data */ java.lang.String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: Null,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, (/* data */ Buffer) | java.lang.String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: ObjectEncodingOptionsflag,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String | Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: encodingBufferEncodingflaEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ java.lang.String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readFile(
    path: PathOrFileDescriptor,
    options: encodingnullundefinedflagEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* data */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readFileSync(path: PathOrFileDescriptor): java.lang.String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | Buffer]
  @scala.inline
  def readFileSync(path: PathOrFileDescriptor, options: EncodingFlag): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def readFileSync(path: PathOrFileDescriptor, options: Flag): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def readFileSync(path: PathOrFileDescriptor, options: ObjectEncodingOptionsflagEncoding): java.lang.String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Buffer]
  @scala.inline
  def readFileSync(path: PathOrFileDescriptor, options: BufferEncoding): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def readFileSync_Buffer(path: PathOrFileDescriptor): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  @scala.inline
  def readFileSync_Union(path: PathOrFileDescriptor, options: BufferEncoding): java.lang.String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readFileSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Buffer]
  
  @scala.inline
  def readSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: ReadPosition): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readSync(fd: Double, buffer: ArrayBufferView, opts: ReadSyncOptions): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def readdir(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: Unit,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: Encoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: ObjectEncodingOptionswithEncoding,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[typings.node.fsMod.Dirent], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: ObjectEncodingOptionswith,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* files */ js.Array[Buffer | java.lang.String], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: WithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | java.lang.String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readdir(
    path: PathLike,
    options: buffer_,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readdirSync(path: PathLike): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  @scala.inline
  def readdirSync(path: PathLike, options: ObjectEncodingOptionswith): js.Array[Buffer | java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer | java.lang.String]]
  @scala.inline
  def readdirSync(path: PathLike, options: ObjectEncodingOptionswithEncoding): js.Array[typings.node.fsMod.Dirent] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.node.fsMod.Dirent]]
  @scala.inline
  def readdirSync(path: PathLike, options: WithFileTypes): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  @scala.inline
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  
  @scala.inline
  def readdirSync_buffer(path: PathLike, options: buffer_): js.Array[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Buffer]]
  
  @scala.inline
  def readlink(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ java.lang.String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readlink(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* linkString */ Buffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readlink(
    path: PathLike,
    options: EncodingOption,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* linkString */ java.lang.String), Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readlink")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readlinkSync(path: PathLike): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def readlinkSync(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  @scala.inline
  def readlinkSync(path: PathLike, options: EncodingOption): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def readlinkSync_Union(path: PathLike): java.lang.String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | Buffer]
  @scala.inline
  def readlinkSync_Union(path: PathLike, options: EncodingOption): java.lang.String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("readlinkSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Buffer]
  
  @scala.inline
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def readv(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesRead */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readv")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def readvSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("readvSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  object realpath {
    
    @scala.inline
    def apply(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("node:fs", "realpath")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def native(
      path: PathLike,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ java.lang.String, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def native(
      path: PathLike,
      options: BufferEncodingOption,
      callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def native(
      path: PathLike,
      options: EncodingOption,
      callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ java.lang.String), Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  object realpathSync {
    
    @scala.inline
    def apply(path: PathLike): java.lang.String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def apply(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def apply(path: PathLike, options: EncodingOption): java.lang.String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @JSImport("node:fs", "realpathSync")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def native(path: PathLike): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
    @scala.inline
    def native(path: PathLike, options: BufferEncodingOption): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    @scala.inline
    def native(path: PathLike, options: EncodingOption): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
    
    @scala.inline
    def native_Union(path: PathLike): java.lang.String | Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any]).asInstanceOf[java.lang.String | Buffer]
    @scala.inline
    def native_Union(path: PathLike, options: EncodingOption): java.lang.String | Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("native")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String | Buffer]
  }
  
  @scala.inline
  def rename(oldPath: PathLike, newPath: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rename")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def renameSync(oldPath: PathLike, newPath: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renameSync")(oldPath.asInstanceOf[js.Any], newPath.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rm(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def rm(path: PathLike, options: RmOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rm")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rmSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def rmSync(path: PathLike, options: RmOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rmdir(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def rmdir(path: PathLike, options: RmDirOptions, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def rmdirSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def rmdirSync(path: PathLike, options: RmDirOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSync")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def stat(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(
    path: PathLike,
    options: Unit,
    callback: js.Function2[
      ErrnoException | Null, 
      typings.node.fsMod.BigIntStats | (/* stats */ typings.node.fsMod.Stats), 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(
    path: PathLike,
    options: StatOptionsbigintfalseund,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(
    path: PathLike,
    options: StatOptionsbiginttrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ typings.node.fsMod.BigIntStats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def stat(
    path: PathLike,
    options: StatOptions,
    callback: js.Function2[
      /* err */ ErrnoException | Null, 
      /* stats */ typings.node.fsMod.Stats | typings.node.fsMod.BigIntStats, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stat")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("node:fs", "statSync")
  @js.native
  val statSync: StatSyncFn[PathLike] = js.native
  
  object symlink {
    
    @scala.inline
    def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(target: PathLike, path: PathLike, `type`: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("node:fs", "symlink")
    @js.native
    val ^ : js.Any = js.native
  }
  
  @scala.inline
  def symlinkSync(target: PathLike, path: PathLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def symlinkSync(target: PathLike, path: PathLike, `type`: Type): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symlinkSync")(target.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def truncate(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def truncate(path: PathLike, len: Double, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def truncate(path: PathLike, len: Null, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def truncate(path: PathLike, len: Unit, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncate")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def truncateSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def truncateSync(path: PathLike, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateSync")(path.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unlink(path: PathLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def unlinkSync(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unlinkSync")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def unwatchFile(filename: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def unwatchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("unwatchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def utimes(path: PathLike, atime: TimeLike, mtime: TimeLike, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimes")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def utimesSync(path: PathLike, atime: TimeLike, mtime: TimeLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("utimesSync")(path.asInstanceOf[js.Any], atime.asInstanceOf[js.Any], mtime.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def watch(filename: PathLike): FSWatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any]).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, listener: WatchListener[java.lang.String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: java.lang.String): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: java.lang.String, listener: WatchListener[java.lang.String | Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: Null, listener: WatchListener[java.lang.String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: Unit, listener: WatchListener[java.lang.String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: WatchOptionsencodingbuffe, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: BufferEncoding): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: BufferEncoding, listener: WatchListener[java.lang.String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: WatchOptions): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch(filename: PathLike, options: WatchOptions, listener: WatchListener[Buffer | java.lang.String]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  @scala.inline
  def watchFile(
    filename: PathLike,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watchFile(
    filename: PathLike,
    options: Unit,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def watchFile(
    filename: PathLike,
    options: Interval,
    listener: js.Function2[/* curr */ typings.node.fsMod.Stats, /* prev */ typings.node.fsMod.Stats, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("watchFile")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def watch_buffer(filename: PathLike, options: buffer_): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  @scala.inline
  def watch_buffer(filename: PathLike, options: buffer_, listener: WatchListener[Buffer]): FSWatcher = (^.asInstanceOf[js.Dynamic].applyDynamic("watch")(filename.asInstanceOf[js.Any], options.asInstanceOf[js.Any], listener.asInstanceOf[js.Any])).asInstanceOf[FSWatcher]
  
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.DataView,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.DataView, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float32Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Float64Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Float64Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int16Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int32Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Int8Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Int8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint16Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint16Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint32Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint32Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8Array,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8Array, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    buffer: js.typedarray.Uint8ClampedArray,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* buffer */ js.typedarray.Uint8ClampedArray, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Double,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Double,
    encoding: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Double,
    encoding: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Double,
    encoding: BufferEncoding,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Null,
    encoding: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Null,
    encoding: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Null,
    encoding: BufferEncoding,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Unit,
    encoding: Null,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Unit,
    encoding: Unit,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write(
    fd: Double,
    string: java.lang.String,
    position: Unit,
    encoding: BufferEncoding,
    callback: js.Function3[
      /* err */ ErrnoException | Null, 
      /* written */ Double, 
      /* str */ java.lang.String, 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Double,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Null,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Null,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Null,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Unit,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Unit,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Double,
    length: Unit,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Double,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Null,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Null,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Null,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Unit,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Unit,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Null,
    length: Unit,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Double,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Double,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Double,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Null,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Null,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Null,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Unit,
    position: Double,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Unit,
    position: Null,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def write[TBuffer /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BigUint64Array */ js.Any */](
    fd: Double,
    buffer: TBuffer,
    offset: Unit,
    length: Unit,
    position: Unit,
    callback: js.Function3[/* err */ ErrnoException | Null, /* written */ Double, /* buffer */ TBuffer, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFile(path: PathOrFileDescriptor, data: java.lang.String, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFile(
    path: PathOrFileDescriptor,
    data: java.lang.String,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFile(path: PathOrFileDescriptor, data: ArrayBufferView, callback: NoParamCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFile(
    path: PathOrFileDescriptor,
    data: ArrayBufferView,
    options: WriteFileOptions,
    callback: NoParamCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeFileSync(path: PathOrFileDescriptor, data: java.lang.String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFileSync(path: PathOrFileDescriptor, data: java.lang.String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFileSync(path: PathOrFileDescriptor, data: ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFileSync(path: PathOrFileDescriptor, data: ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Double, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Null, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Null, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, buffer: ArrayBufferView, offset: Unit, length: Unit, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], length.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, string: java.lang.String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, string: java.lang.String, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, string: java.lang.String, position: Double, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, string: java.lang.String, position: Null, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writeSync(fd: Double, string: java.lang.String, position: Unit, encoding: BufferEncoding): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writeSync")(fd.asInstanceOf[js.Any], string.asInstanceOf[js.Any], position.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writev(
    fd: Double,
    buffers: js.Array[ArrayBufferView],
    position: Double,
    cb: js.Function3[
      /* err */ ErrnoException | Null, 
      /* bytesWritten */ Double, 
      /* buffers */ js.Array[ArrayBufferView], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writev")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any])).asInstanceOf[Double]
  @scala.inline
  def writevSync(fd: Double, buffers: js.Array[ArrayBufferView], position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("writevSync")(fd.asInstanceOf[js.Any], buffers.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
}
