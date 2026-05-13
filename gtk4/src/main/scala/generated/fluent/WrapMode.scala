package sn.gnome.gtk4

import _root_.sn.gnome.gtk4.internal.GtkWrapMode

/** Describes a type of line wrapping.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum WrapMode(val raw: GtkWrapMode):
  /** do not wrap lines; just make the text area wider
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case NONE extends WrapMode(GtkWrapMode.GTK_WRAP_NONE)

  /** wrap text, breaking lines anywhere the cursor can appear (between
    * characters, usually - if you want to be technical, between graphemes, see
    * pango_get_log_attrs())
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHAR extends WrapMode(GtkWrapMode.GTK_WRAP_CHAR)

  /** wrap text, breaking lines in between words
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD extends WrapMode(GtkWrapMode.GTK_WRAP_WORD)

  /** wrap text, breaking lines in between words, or if that is not enough, also
    * between graphemes
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD_CHAR extends WrapMode(GtkWrapMode.GTK_WRAP_WORD_CHAR)
end WrapMode

object WrapMode:
  def fromRaw(raw: GtkWrapMode): WrapMode =
    raw match
      case GtkWrapMode.GTK_WRAP_NONE      => WrapMode.NONE
      case GtkWrapMode.GTK_WRAP_CHAR      => WrapMode.CHAR
      case GtkWrapMode.GTK_WRAP_WORD      => WrapMode.WORD
      case GtkWrapMode.GTK_WRAP_WORD_CHAR => WrapMode.WORD_CHAR
  end fromRaw
end WrapMode
