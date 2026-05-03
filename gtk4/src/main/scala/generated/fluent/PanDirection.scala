package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPanDirection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes the panning direction of a [class@GesturePan].
  */
enum PanDirection(val raw: GtkPanDirection):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * panned towards the left
    */
  case LEFT extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * panned towards the right
    */
  case RIGHT extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * panned upwards
    */
  case UP extends PanDirection(GtkPanDirection.GTK_PAN_DIRECTION_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * panned downwards
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
