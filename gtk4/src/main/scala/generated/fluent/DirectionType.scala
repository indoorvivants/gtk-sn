package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkDirectionType

/** Focus movement types.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DirectionType(val raw: GtkDirectionType):
  /** Move forward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAB_FORWARD extends DirectionType(GtkDirectionType.GTK_DIR_TAB_FORWARD)

  /** Move backward.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TAB_BACKWARD extends DirectionType(GtkDirectionType.GTK_DIR_TAB_BACKWARD)

  /** Move up.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UP extends DirectionType(GtkDirectionType.GTK_DIR_UP)

  /** Move down.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOWN extends DirectionType(GtkDirectionType.GTK_DIR_DOWN)

  /** Move left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends DirectionType(GtkDirectionType.GTK_DIR_LEFT)

  /** Move right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends DirectionType(GtkDirectionType.GTK_DIR_RIGHT)
end DirectionType

object DirectionType:
  def fromRaw(raw: GtkDirectionType): DirectionType =
    raw match
      case GtkDirectionType.GTK_DIR_TAB_FORWARD  => DirectionType.TAB_FORWARD
      case GtkDirectionType.GTK_DIR_TAB_BACKWARD => DirectionType.TAB_BACKWARD
      case GtkDirectionType.GTK_DIR_UP           => DirectionType.UP
      case GtkDirectionType.GTK_DIR_DOWN         => DirectionType.DOWN
      case GtkDirectionType.GTK_DIR_LEFT         => DirectionType.LEFT
      case GtkDirectionType.GTK_DIR_RIGHT        => DirectionType.RIGHT
  end fromRaw
end DirectionType
