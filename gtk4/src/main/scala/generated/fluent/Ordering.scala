package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkOrdering

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the way two values can be compared.
  *
  * These values can be used with a [callback@GLib.CompareFunc]. However, a
  * `GCompareFunc` is allowed to return any integer values. For converting such
  * a value to a `GtkOrdering` value, use [func@Gtk.Ordering.from_cmpfunc].
  */
enum Ordering(val raw: GtkOrdering):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the first value is smaller than the second
    */
  case SMALLER extends Ordering(GtkOrdering.GTK_ORDERING_SMALLER)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the two values are equal
    */
  case EQUAL extends Ordering(GtkOrdering.GTK_ORDERING_EQUAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * the first value is larger than the second
    */
  case LARGER extends Ordering(GtkOrdering.GTK_ORDERING_LARGER)
end Ordering

object Ordering:
  def fromRaw(raw: GtkOrdering): Ordering =
    raw match
      case GtkOrdering.GTK_ORDERING_SMALLER => Ordering.SMALLER
      case GtkOrdering.GTK_ORDERING_EQUAL   => Ordering.EQUAL
      case GtkOrdering.GTK_ORDERING_LARGER  => Ordering.LARGER
  end fromRaw
end Ordering
