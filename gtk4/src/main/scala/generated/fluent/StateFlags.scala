package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkStateFlags

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes a widget state.
  *
  * Widget states are used to match the widget against CSS pseudo-classes. Note
  * that GTK extends the regular CSS classes and sometimes uses different names.
  */
class StateFlags private (val raw: GtkStateFlags):
  def is(kv: StateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): String =
    var rem = raw.value
    val sb = List.newBuilder[StateFlags.KnownValue]
    StateFlags.KnownValue.values.foreach: kv =>
      if this.is(kv) then sb += kv

      rem = rem & (~kv.raw.value)

    s"StateFlags(${sb.result().mkString(", ")})"
end StateFlags

object StateFlags:
  export KnownValue.*

  def fromRaw(raw: GtkStateFlags) = new StateFlags(raw)

  extension (af: StateFlags)
    def &(other: StateFlags) =
      StateFlags(af.raw & other.raw)
    def |(other: StateFlags) =
      StateFlags(af.raw | other.raw)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Describes a widget state.
    *
    * Widget states are used to match the widget against CSS pseudo-classes.
    * Note that GTK extends the regular CSS classes and sometimes uses different
    * names.
    */
  enum KnownValue(override val raw: GtkStateFlags, name: String)
      extends StateFlags(raw):
    override def toString(): String = this.name

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * State during normal operation
      */
    case NORMAL
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_NORMAL, "NORMAL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is active
      */
    case ACTIVE
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_ACTIVE, "ACTIVE")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget has a mouse pointer over it
      */
    case PRELIGHT
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_PRELIGHT, "PRELIGHT")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is selected
      */
    case SELECTED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_SELECTED, "SELECTED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is insensitive
      */
    case INSENSITIVE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_INSENSITIVE,
          "INSENSITIVE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is inconsistent
      */
    case INCONSISTENT
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_INCONSISTENT,
          "INCONSISTENT"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget has the keyboard focus
      */
    case FOCUSED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_FOCUSED, "FOCUSED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is in a background toplevel window
      */
    case BACKDROP
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_BACKDROP, "BACKDROP")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is in left-to-right text direction
      */
    case DIR_LTR
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_DIR_LTR, "DIR_LTR")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is in right-to-left text direction
      */
    case DIR_RTL
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_DIR_RTL, "DIR_RTL")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is a link
      */
    case LINK extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_LINK, "LINK")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * The location the widget points to has already been visited
      */
    case VISITED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_VISITED, "VISITED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is checked
      */
    case CHECKED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_CHECKED, "CHECKED")

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget is highlighted as a drop target for DND
      */
    case DROP_ACTIVE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_DROP_ACTIVE,
          "DROP_ACTIVE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget has the visible focus
      */
    case FOCUS_VISIBLE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_FOCUS_VISIBLE,
          "FOCUS_VISIBLE"
        )

    /** COMMENT FOR THE ORIGINAL C DEFINITION
      *
      * Widget contains the keyboard focus
      */
    case FOCUS_WITHIN
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_FOCUS_WITHIN,
          "FOCUS_WITHIN"
        )
  end KnownValue
end StateFlags
