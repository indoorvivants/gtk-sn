package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkConstraintAttribute

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The widget attributes that can be used when creating a [class@Constraint].
  */
enum ConstraintAttribute(val raw: GtkConstraintAttribute):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No attribute, used for constant relations
    */
  case NONE
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_NONE
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The left edge of a widget, regardless of text direction
    */
  case LEFT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_LEFT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The right edge of a widget, regardless of text direction
    */
  case RIGHT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_RIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The top edge of a widget
    */
  case TOP
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_TOP
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The bottom edge of a widget
    */
  case BOTTOM
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_BOTTOM
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The leading edge of a widget, depending on text direction; equivalent to
    * %GTK_CONSTRAINT_ATTRIBUTE_LEFT for LTR languages, and
    * %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for RTL ones
    */
  case START
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_START
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The trailing edge of a widget, depending on text direction; equivalent to
    * %GTK_CONSTRAINT_ATTRIBUTE_RIGHT for LTR languages, and
    * %GTK_CONSTRAINT_ATTRIBUTE_LEFT for RTL ones
    */
  case END
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_END
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The width of a widget
    */
  case WIDTH
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_WIDTH
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The height of a widget
    */
  case HEIGHT
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_HEIGHT
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The center of a widget, on the horizontal axis
    */
  case CENTER_X
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_X
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The center of a widget, on the vertical axis
    */
  case CENTER_Y
      extends ConstraintAttribute(
        GtkConstraintAttribute.GTK_CONSTRAINT_ATTRIBUTE_CENTER_Y
      )

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The baseline of a widget
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
