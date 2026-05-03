package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextWindowType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Used to reference the parts of `GtkTextView`.
  */
enum TextWindowType(val raw: GtkTextWindowType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Window that floats over scrolling areas.
    */
  case WIDGET extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_WIDGET)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Scrollable text window.
    */
  case TEXT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_TEXT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left side border window.
    */
  case LEFT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_LEFT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right side border window.
    */
  case RIGHT extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_RIGHT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Top border window.
    */
  case TOP extends TextWindowType(GtkTextWindowType.GTK_TEXT_WINDOW_TOP)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Bottom border window.
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
