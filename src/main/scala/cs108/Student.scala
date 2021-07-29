package cs108

import upickle.default._

final case class Sciper(id: Int) {
  require(100000 <= id && id <= 999999, s"invalid SCIPER $id")

  override def toString: String =
    id.toString
}

object Sciper {
  def ofString(s: String): Option[Sciper] =
    if (s.matches("[1-9][0-9]{5}")) Some(Sciper(s.toInt)) else None

  implicit def ordering: Ordering[Sciper] =
    Ordering.by(_.id)

  implicit val sciperReadWrite: ReadWriter[Sciper] =
    readwriter[Int].bimap(_.id, Sciper(_))
}

final case class Student(key: Sciper,
                         lastName: String,
                         firstName: String,
                         email: String) extends Keyed[Sciper] {
  def fullName: String =
    s"${lastName} ${firstName}"

  def fullEmail: String =
    s"${fullName} <${email}>"
}

object Student {
  import upickle.default.{ ReadWriter, macroRW }
  implicit def rw: ReadWriter[Student] = macroRW
}
