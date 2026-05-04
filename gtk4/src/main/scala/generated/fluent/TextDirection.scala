package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkTextDirection

/** Reading directions for text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum TextDirection(val raw: GtkTextDirection):
  /** No direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends TextDirection(GtkTextDirection.GTK_TEXT_DIR_NONE)

  /** Left to right text direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LTR extends TextDirection(GtkTextDirection.GTK_TEXT_DIR_LTR)

  /** Right to left text direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
