package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkOrientation

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Represents the orientation of widgets and other objects.
  *
  * Typical examples are [class@Box] or [class@GesturePan].
  */
enum Orientation(val raw: GtkOrientation):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The element is in horizontal orientation.
    */
  case HORIZONTAL extends Orientation(GtkOrientation.GTK_ORIENTATION_HORIZONTAL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The element is in vertical orientation.
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
