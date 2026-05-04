package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkOverflow

/** Defines how content overflowing a given area should be handled.
  *
  * This is used in [method@Gtk.Widget.set_overflow]. The
  * [property@Gtk.Widget:overflow] property is modeled after the CSS overflow
  * property, but implements it only partially.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Overflow(val raw: GtkOverflow):
  /** No change is applied. Content is drawn at the specified position.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VISIBLE extends Overflow(GtkOverflow.GTK_OVERFLOW_VISIBLE)

  /** Content is clipped to the bounds of the area. Content outside the area is
    * not drawn and cannot be interacted with.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HIDDEN extends Overflow(GtkOverflow.GTK_OVERFLOW_HIDDEN)
end Overflow

object Overflow:
  def fromRaw(raw: GtkOverflow): Overflow =
    raw match
      case GtkOverflow.GTK_OVERFLOW_VISIBLE => Overflow.VISIBLE
      case GtkOverflow.GTK_OVERFLOW_HIDDEN  => Overflow.HIDDEN
  end fromRaw
end Overflow
