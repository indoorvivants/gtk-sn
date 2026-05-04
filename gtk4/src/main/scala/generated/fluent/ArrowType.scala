package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkArrowType

/** Used to indicate the direction in which an arrow should point.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ArrowType(val raw: GtkArrowType):
  /** Represents an upward pointing arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case UP extends ArrowType(GtkArrowType.GTK_ARROW_UP)

  /** Represents a downward pointing arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DOWN extends ArrowType(GtkArrowType.GTK_ARROW_DOWN)

  /** Represents a left pointing arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends ArrowType(GtkArrowType.GTK_ARROW_LEFT)

  /** Represents a right pointing arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends ArrowType(GtkArrowType.GTK_ARROW_RIGHT)

  /** No arrow.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
