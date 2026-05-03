package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextDirection

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Reading directions for text.
  */
enum TextDirection(val raw: GtkTextDirection):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * No direction.
    */
  case NONE extends TextDirection(GtkTextDirection.GTK_TEXT_DIR_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Left to right text direction.
    */
  case LTR extends TextDirection(GtkTextDirection.GTK_TEXT_DIR_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Right to left text direction.
    */
  case RTL extends TextDirection(GtkTextDirection.GTK_TEXT_DIR_RTL)
end TextDirection

object TextDirection:
  def fromRaw(raw: GtkTextDirection): TextDirection =
    raw match
      case GtkTextDirection.GTK_TEXT_DIR_NONE => TextDirection.NONE
      case GtkTextDirection.GTK_TEXT_DIR_LTR  => TextDirection.LTR
      case GtkTextDirection.GTK_TEXT_DIR_RTL  => TextDirection.RTL
  end fromRaw
end TextDirection
