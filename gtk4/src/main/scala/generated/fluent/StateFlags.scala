package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkStateFlags

/** Describes a widget state.
  *
  * Widget states are used to match the widget against CSS pseudo-classes. Note
  * that GTK extends the regular CSS classes and sometimes uses different names.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
class StateFlags private (val raw: GtkStateFlags):
  def is(kv: StateFlags): Boolean =
    raw.is(kv.raw)

  override def toString(): scala.Predef.String =
    var rem = raw.value
    val sb = scala.List.newBuilder[StateFlags.KnownValue]
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

  /** Describes a widget state.
    *
    * Widget states are used to match the widget against CSS pseudo-classes.
    * Note that GTK extends the regular CSS classes and sometimes uses different
    * names.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  enum KnownValue(override val raw: GtkStateFlags, name: scala.Predef.String)
      extends StateFlags(raw):
    override def toString(): scala.Predef.String = this.name

    /** State during normal operation
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case NORMAL
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_NORMAL, "NORMAL")

    /** Widget is active
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case ACTIVE
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_ACTIVE, "ACTIVE")

    /** Widget has a mouse pointer over it
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case PRELIGHT
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_PRELIGHT, "PRELIGHT")

    /** Widget is selected
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case SELECTED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_SELECTED, "SELECTED")

    /** Widget is insensitive
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INSENSITIVE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_INSENSITIVE,
          "INSENSITIVE"
        )

    /** Widget is inconsistent
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case INCONSISTENT
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_INCONSISTENT,
          "INCONSISTENT"
        )

    /** Widget has the keyboard focus
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUSED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_FOCUSED, "FOCUSED")

    /** Widget is in a background toplevel window
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case BACKDROP
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_BACKDROP, "BACKDROP")

    /** Widget is in left-to-right text direction
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DIR_LTR
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_DIR_LTR, "DIR_LTR")

    /** Widget is in right-to-left text direction
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DIR_RTL
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_DIR_RTL, "DIR_RTL")

    /** Widget is a link
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case LINK extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_LINK, "LINK")

    /** The location the widget points to has already been visited
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case VISITED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_VISITED, "VISITED")

    /** Widget is checked
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case CHECKED
        extends KnownValue(GtkStateFlags.GTK_STATE_FLAG_CHECKED, "CHECKED")

    /** Widget is highlighted as a drop target for DND
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case DROP_ACTIVE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_DROP_ACTIVE,
          "DROP_ACTIVE"
        )

    /** Widget has the visible focus
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUS_VISIBLE
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_FOCUS_VISIBLE,
          "FOCUS_VISIBLE"
        )

    /** Widget contains the keyboard focus
      *
      * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
      * MIGHT BE APPLICABLE TO SCALA
      */
    case FOCUS_WITHIN
        extends KnownValue(
          GtkStateFlags.GTK_STATE_FLAG_FOCUS_WITHIN,
          "FOCUS_WITHIN"
        )
  end KnownValue
end StateFlags
