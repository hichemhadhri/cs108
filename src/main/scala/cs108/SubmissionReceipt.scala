package cs108

final case class SubmissionReceipt(name: String, timeStamp: String)

object SubmissionReceipt {
  import upickle.default.{ ReadWriter, macroRW }
  implicit def rw: ReadWriter[SubmissionReceipt] = macroRW
}
