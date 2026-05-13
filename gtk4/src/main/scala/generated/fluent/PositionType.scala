package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkPositionType

/** Describes which edge of a widget a certain feature is positioned at.
  *
  * For examples, see the tabs of a [class@Notebook], or the label of a
  * [class@Scale].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum PositionType(val raw: GtkPositionType):
  /** The feature is at the left edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends PositionType(GtkPositionType.GTK_POS_LEFT)

  /** The feature is at the right edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends PositionType(GtkPositionType.GTK_POS_RIGHT)

  /** The feature is at the top edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP extends PositionType(GtkPositionType.GTK_POS_TOP)

  /** The feature is at the bottom edge.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
