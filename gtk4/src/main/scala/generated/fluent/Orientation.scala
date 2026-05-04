package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkOrientation

/** Represents the orientation of widgets and other objects.
  *
  * Typical examples are [class@Box] or [class@GesturePan].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Orientation(val raw: GtkOrientation):
  /** The element is in horizontal orientation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HORIZONTAL extends Orientation(GtkOrientation.GTK_ORIENTATION_HORIZONTAL)

  /** The element is in vertical orientation.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case VERTICAL extends Orientation(GtkOrientation.GTK_ORIENTATION_VERTICAL)
end Orientation

object Orientation:
  def fromRaw(raw: GtkOrientation): Orientation =
    raw match
      case GtkOrientation.GTK_ORIENTATION_HORIZONTAL => Orientation.HORIZONTAL
      case GtkOrientation.GTK_ORIENTATION_VERTICAL   => Orientation.VERTICAL
  end fromRaw
end Orientation
