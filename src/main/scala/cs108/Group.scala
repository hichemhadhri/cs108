package cs108

final case class GroupID(membersID: Set[Sciper]) {
  require(membersID.nonEmpty, "empty group")

  private val sortedMembersID =
    membersID.toList.sorted

  private[this] val name =
    sortedMembersID mkString "-"

  override def toString: String =
    name
}

object GroupID {
  implicit def ordering: Ordering[GroupID] = {
    import scala.math.Ordering.Implicits._
    Ordering.by(_.sortedMembersID)
  }

  def ofString(s: String): Option[GroupID] = {
    // Note: the following could be simplified with Scalaz's sequence
    // method, but I want to avoid using Scalaz in the client.
    val maybeScipers = (s split "-").toSet map Sciper.ofString
    if (maybeScipers forall (_.isDefined))
      Some(GroupID(maybeScipers.flatten))
    else
      None
  }
}

final case class Group(members: Set[Student]) {
  require(members.nonEmpty, "empty group")

  val id: GroupID =
    GroupID(members map (_.key))

  def membersID: Set[Sciper] =
    id.membersID

  val name: String =
    id.toString
}

object Group {
  import upickle.default.{ ReadWriter, macroRW }
  implicit def rw: ReadWriter[Group] = macroRW
}
