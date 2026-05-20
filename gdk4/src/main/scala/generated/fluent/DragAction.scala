package sn.gnome.gdk4

import _root_.sn.gnome.gdk4.internal.GdkDragAction

/** Used in `GdkDrop` and `GdkDrag` to indicate the actions that the destination
  * can and should do with the dropped data.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class DragAction private (val raw: GdkDragAction):
  def is(kv: DragAction): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[DragAction.KnownValue]
    DragAction.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"DragAction(${sb.result().mkString(", ")})"
end DragAction

object DragAction:
  export KnownValue.*

  def fromRaw(raw: GdkDragAction) = new DragAction(raw)

  extension (af: DragAction)
    def &(other: DragAction) =
      DragAction(af.raw & other.raw)
    def |(other: DragAction) =
      DragAction(af.raw | other.raw)

  /** Used in `GdkDrop` and `GdkDrag` to indicate the actions that the
    * destination can and should do with the dropped data.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GdkDragAction, name: scala.Predef.String)
      extends DragAction(raw):
    override def toString(): scala.Predef.String = this.name

    /** Copy the data.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case COPY extends KnownValue(GdkDragAction.GDK_ACTION_COPY, "COPY")

    /** Move the data, i.e. first copy it, then delete it from the source using
      * the DELETE target of the X selection protocol.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case MOVE extends KnownValue(GdkDragAction.GDK_ACTION_MOVE, "MOVE")

    /** Add a link to the data. Note that this is only useful if source and
      * destination agree on what it means, and is not supported on all
      * platforms.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LINK extends KnownValue(GdkDragAction.GDK_ACTION_LINK, "LINK")

    /** Ask the user what to do with the data.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ASK extends KnownValue(GdkDragAction.GDK_ACTION_ASK, "ASK")
  end KnownValue
end DragAction
