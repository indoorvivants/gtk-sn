package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkListScrollFlags

/** List of actions to perform when scrolling to items in a list widget.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class ListScrollFlags private (val raw: GtkListScrollFlags):
  def is(kv: ListScrollFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[ListScrollFlags.KnownValue]
    ListScrollFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"ListScrollFlags(${sb.result().mkString(", ")})"
end ListScrollFlags

object ListScrollFlags:
  export KnownValue.*

  def fromRaw(raw: GtkListScrollFlags) = new ListScrollFlags(raw)

  extension (af: ListScrollFlags)
    def &(other: ListScrollFlags) =
      ListScrollFlags(af.raw & other.raw)
    def |(other: ListScrollFlags) =
      ListScrollFlags(af.raw | other.raw)

  /** List of actions to perform when scrolling to items in a list widget.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkListScrollFlags, name: String)
      extends ListScrollFlags(raw):
    override def toString(): String = this.name

    /** Don't do anything extra
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NONE
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_NONE, "NONE")

    /** Focus the target item
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUS
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_FOCUS, "FOCUS")

    /** Select the target item and unselect all other items.
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SELECT
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_SELECT, "SELECT")
  end KnownValue
end ListScrollFlags
