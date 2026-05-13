package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkConstraintAttribute

/** The widget attributes that can be used when creating a [class@Constraint].
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum ConstraintAttribute(val raw: GtkConstraintAttribute):
  /** No attribute, used for constant relations
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE
      )

  /** The left edge of a widget, regardless of text direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT
      )

  /** The right edge of a widget, regardless of text direction
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT
      )

  /** The top edge of a widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP
      )

  /** The bottom edge of a widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOTTOM
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM
      )

  /** The leading edge of a widget, depending on text direction; equivalent to
    * %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR languages, and
    * %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case START
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START
      )

  /** The trailing edge of a widget, depending on text direction; equivalent to
    * %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR languages, and
    * %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case END
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END
      )

  /** The width of a widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WIDTH
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH
      )

  /** The height of a widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case HEIGHT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT
      )

  /** The center of a widget, on the horizontal axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER_X
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X
      )

  /** The center of a widget, on the vertical axis
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CENTER_Y
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y
      )

  /** The baseline of a widget
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BASELINE
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BASELINE
      )
end ConstraintAttribute

object ConstraintAttribute:
  def fromRaw(raw: GtkConstraintAttribute): ConstraintAttribute =
    raw match
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE =>
        ConstraintAttribute.NONE
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT =>
        ConstraintAttribute.LEFT
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT =>
        ConstraintAttribute.RIGHT
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP =>
        ConstraintAttribute.TOP
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM =>
        ConstraintAttribute.BOTTOM
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START =>
        ConstraintAttribute.START
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END =>
        ConstraintAttribute.END
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH =>
        ConstraintAttribute.WIDTH
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT =>
        ConstraintAttribute.HEIGHT
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X =>
        ConstraintAttribute.CENTER_X
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y =>
        ConstraintAttribute.CENTER_Y
      case GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BASELINE =>
        ConstraintAttribute.BASELINE
  end fromRaw
end ConstraintAttribute
