package cs108

final case class Event(key: String,
                       description: String,
                       validFrom: Long,
                       validTo: Long,
                       gitBranch: String,
                       maxFileSize: Int,
                       regex : Set[String])
    extends Keyed[String]

object Event {
  import upickle.default.{ ReadWriter, macroRW }
  implicit def rw: ReadWriter[Event] = macroRW
}
