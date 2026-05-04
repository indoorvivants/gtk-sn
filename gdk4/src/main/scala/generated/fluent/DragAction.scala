package sn.gnome.gdk4.fluent

import _root_.sn.gnome.gdk4.internal.GdkDragAction

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used in `GdkDrop` and `GdkDrag` to indicate the actions that the destination
  * can and should do with the dropped data.
  */
class DragAction private (val raw: GdkDragAction):
  def is(kv: DragAction): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[DragAction.KnownValue]
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used in `GdkDrop` and `GdkDrag` to indicate the actions that the
    * destination can and should do with the dropped data.
    */
  enum KnownValue(override val raw: GdkDragAction, name: String)
      extends DragAction(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Copy the data.
      */
    case COPY extends KnownValue(GdkDragAction.GDK_ACTION_COPY, "COPY")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Move the data, i.e. first copy it, then delete it from the source using
      * the DELETE target of the X selection protocol.
      */
    case MOVE extends KnownValue(GdkDragAction.GDK_ACTION_MOVE, "MOVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Add a link to the data. Note that this is only useful if source and
      * destination agree on what it means, and is not supported on all
      * platforms.
      */
    case LINK extends KnownValue(GdkDragAction.GDK_ACTION_LINK, "LINK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Ask the user what to do with the data.
      */
    case ASK extends KnownValue(GdkDragAction.GDK_ACTION_ASK, "ASK")
  end KnownValue
end DragAction
