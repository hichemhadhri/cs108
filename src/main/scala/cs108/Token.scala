package cs108

final case class Token(key: String,
                       owners: Set[Student],
                       event: Event)
    extends Keyed[String] {
  def append(that: Token): Option[Token] = {
    if (event == that.event)
      Some(Token(key + that.key, owners ++ that.owners, event))
    else
      None
  }
}

object Token {
  private val partLength = 8
  private val partCount = 2

  private val isValidKeyChar = {
    val validRanges = Seq('a' to 'z', 'A' to 'Z', '0' to '9')
    c: Char => validRanges exists (_ contains c)
  }

  import upickle.default.{ ReadWriter, macroRW }
  implicit def rw: ReadWriter[Token] = macroRW

  val maxKeyLength = partCount * partLength

  def isValidKey(requiredPartsCount: Int)(s: String): Boolean =
    (s.length == requiredPartsCount * partLength) && (s forall isValidKeyChar)

  def splitKey(s: String): Seq[String] =
    (s grouped partLength).toList
}
