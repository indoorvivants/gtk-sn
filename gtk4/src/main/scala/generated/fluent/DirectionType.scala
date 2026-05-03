package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDirectionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Focus movement types.
  */
enum DirectionType(val raw: GtkDirectionType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move forward.
    */
  case TAB_FORWARD extends DirectionType(GtkDirectionType.GTK_DIR_TAB_FORWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move backward.
    */
  case TAB_BACKWARD extends DirectionType(GtkDirectionType.GTK_DIR_TAB_BACKWARD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move up.
    */
  case UP extends DirectionType(GtkDirectionType.GTK_DIR_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move down.
    */
  case DOWN extends DirectionType(GtkDirectionType.GTK_DIR_DOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move left.
    */
  case LEFT extends DirectionType(GtkDirectionType.GTK_DIR_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Move right.
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
