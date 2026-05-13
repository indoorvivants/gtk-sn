package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkOrdering

/** Describes the way two values can be compared.
  *
  * These values can be used with a [callback@GLib.CompareFunc]. However, a
  * `GCompareFunc` is allowed to return any integer values. For converting such
  * a value to a `GtkOrdering` value, use [func@Gtk.Ordering.from_cmpfunc].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Ordering(val raw: GtkOrdering):
  /** the first value is smaller than the second
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case SMALLER extends Ordering(GtkOrdering.GTK_ORDERING_SMALLER)

  /** the two values are equal
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case EQUAL extends Ordering(GtkOrdering.GTK_ORDERING_EQUAL)

  /** the first value is larger than the second
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
