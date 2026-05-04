package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkListScrollFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * List of actions to perform when scrolling to items in a list widget.
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

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * List of actions to perform when scrolling to items in a list widget.
    */
  enum KnownValue(override val raw: GtkListScrollFlags, name: String)
      extends ListScrollFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Don't do anything extra
      */
    case NONE
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_NONE, "NONE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Focus the target item
      */
    case FOCUS
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_FOCUS, "FOCUS")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Select the target item and unselect all other items.
      */
    case SELECT
        extends KnownValue(GtkListScrollFlags.GTK_LIST_SCROLL_SELECT, "SELECT")
  end KnownValue
end ListScrollFlags
