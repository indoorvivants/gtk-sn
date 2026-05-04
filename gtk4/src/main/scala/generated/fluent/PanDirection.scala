package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPanDirection

/** Describes the panning direction of a [class@GesturePan].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PanDirection(val raw: GtkPanDirection):
  /** panned towards the left
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_LEFT)

  /** panned towards the right
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_RIGHT)

  /** panned upwards
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UP extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_UP)

  /** panned downwards
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOWN extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_DOWN)
end PanDirection

object PanDirection:
  def fromRaw(raw: GtkPanDirection): PanDirection =
    raw match
      case GtkPanDirection.GTK_PAN_DIRECTION_LEFT  => PanDirection.LEFT
      case GtkPanDirection.GTK_PAN_DIRECTION_RIGHT => PanDirection.RIGHT
      case GtkPanDirection.GTK_PAN_DIRECTION_UP    => PanDirection.UP
      case GtkPanDirection.GTK_PAN_DIRECTION_DOWN  => PanDirection.DOWN
  end fromRaw
end PanDirection
