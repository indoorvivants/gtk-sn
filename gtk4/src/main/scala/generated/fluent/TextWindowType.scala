package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextWindowType

/** Used to reference the parts of `GtkTextView`.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TextWindowType(val raw: GtkTextWindowType):
  /** Window that floats over scrolling areas.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WIDGET extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET)

  /** Scrollable text window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TEXT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_TEXT)

  /** Left side border window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LEFT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_LEFT)

  /** Right side border window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RIGHT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT)

  /** Top border window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TOP extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_TOP)

  /** Bottom border window.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case BOTTOM extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_BOTTOM)
end TextWindowType

object TextWindowType:
  def fromRaw(raw: GtkTextWindowType): TextWindowType =
    raw match
      case GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET => TextWindowType.WIDGET
      case GtkTextWindowType.GTK_TEXT_WINDOW_TEXT   => TextWindowType.TEXT
      case GtkTextWindowType.GTK_TEXT_WINDOW_LEFT   => TextWindowType.LEFT
      case GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT  => TextWindowType.RIGHT
      case GtkTextWindowType.GTK_TEXT_WINDOW_TOP    => TextWindowType.TOP
      case GtkTextWindowType.GTK_TEXT_WINDOW_BOTTOM => TextWindowType.BOTTOM
  end fromRaw
end TextWindowType
