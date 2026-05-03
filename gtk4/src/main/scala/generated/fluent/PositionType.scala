package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkPositionType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes which edge of a widget a certain feature is positioned at.
  *
  * For examples, see the tabs of a [class@Notebook], or the label of a
  * [class@Scale].
  */
enum PositionType(val raw: GtkPositionType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The feature is at the left edge.
    */
  case LEFT extends PositionType(GtkPositionType.GTK_POS_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The feature is at the right edge.
    */
  case RIGHT extends PositionType(GtkPositionType.GTK_POS_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The feature is at the top edge.
    */
  case TOP extends PositionType(GtkPositionType.GTK_POS_TOP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The feature is at the bottom edge.
    */
  case BOTTOM extends PositionType(GtkPositionType.GTK_POS_BOTTOM)
end PositionType

object PositionType:
  def fromRaw(raw: GtkPositionType): PositionType =
    raw match
      case GtkPositionType.GTK_POS_LEFT   => PositionType.LEFT
      case GtkPositionType.GTK_POS_RIGHT  => PositionType.RIGHT
      case GtkPositionType.GTK_POS_TOP    => PositionType.TOP
      case GtkPositionType.GTK_POS_BOTTOM => PositionType.BOTTOM
  end fromRaw
end PositionType
