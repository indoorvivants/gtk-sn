package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkArrowType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to indicate the direction in which an arrow should point.
  */
enum ArrowType(val raw: GtkArrowType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Represents an upward pointing arrow.
    */
  case UP extends ArrowType(GtkArrowType.GTK_ARROW_UP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Represents a downward pointing arrow.
    */
  case DOWN extends ArrowType(GtkArrowType.GTK_ARROW_DOWN)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Represents a left pointing arrow.
    */
  case LEFT extends ArrowType(GtkArrowType.GTK_ARROW_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Represents a right pointing arrow.
    */
  case RIGHT extends ArrowType(GtkArrowType.GTK_ARROW_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No arrow.
    */
  case NONE extends ArrowType(GtkArrowType.GTK_ARROW_NONE)
end ArrowType

object ArrowType:
  def fromRaw(raw: GtkArrowType): ArrowType =
    raw match
      case GtkArrowType.GTK_ARROW_UP    => ArrowType.UP
      case GtkArrowType.GTK_ARROW_DOWN  => ArrowType.DOWN
      case GtkArrowType.GTK_ARROW_LEFT  => ArrowType.LEFT
      case GtkArrowType.GTK_ARROW_RIGHT => ArrowType.RIGHT
      case GtkArrowType.GTK_ARROW_NONE  => ArrowType.NONE
  end fromRaw
end ArrowType
