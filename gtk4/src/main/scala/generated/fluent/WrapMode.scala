package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkWrapMode

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Describes a type of line wrapping.
  */
enum WrapMode(val raw: GtkWrapMode):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * do not wrap lines; just make the text area wider
    */
  case NONE extends WrapMode(GtkWrapMode.GTK_WRAP_NONE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * wrap text, breaking lines anywhere the cursor can appear (between
    * characters, usually - if you want to be technical, between graphemes, see
    * pango_get_log_attrs())
    */
  case CHAR extends WrapMode(GtkWrapMode.GTK_WRAP_CHAR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * wrap text, breaking lines in between words
    */
  case WORD extends WrapMode(GtkWrapMode.GTK_WRAP_WORD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * wrap text, breaking lines in between words, or if that is not enough, also
    * between graphemes
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
