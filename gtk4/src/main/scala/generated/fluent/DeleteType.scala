package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDeleteType

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Passed to various keybinding signals for deleting text.
  */
enum DeleteType(val raw: GtkDeleteType):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete characters.
    */
  case CHARS extends DeleteType(GtkDeleteType.GTK_DELETE_CHARS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete only the portion of the word to the left/right of cursor if we’re
    * in the middle of a word.
    */
  case WORD_ENDS extends DeleteType(GtkDeleteType.GTK_DELETE_WORD_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete words.
    */
  case WORDS extends DeleteType(GtkDeleteType.GTK_DELETE_WORDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete display-lines. Display-lines refers to the visible lines, with
    * respect to the current line breaks. As opposed to paragraphs, which are
    * defined by line breaks in the input.
    */
  case DISPLAY_LINES extends DeleteType(GtkDeleteType.GTK_DELETE_DISPLAY_LINES)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete only the portion of the display-line to the left/right of cursor.
    */
  case DISPLAY_LINE_ENDS
      extends DeleteType(GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete to the end of the paragraph. Like C-k in Emacs (or its reverse).
    */
  case PARAGRAPH_ENDS
      extends DeleteType(GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete entire line. Like C-k in pico.
    */
  case PARAGRAPHS extends DeleteType(GtkDeleteType.GTK_DELETE_PARAGRAPHS)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Delete only whitespace. Like M-\ in Emacs.
    */
  case WHITESPACE extends DeleteType(GtkDeleteType.GTK_DELETE_WHITESPACE)
end DeleteType

object DeleteType:
  def fromRaw(raw: GtkDeleteType): DeleteType =
    raw match
      case GtkDeleteType.GTK_DELETE_CHARS         => DeleteType.CHARS
      case GtkDeleteType.GTK_DELETE_WORD_ENDS     => DeleteType.WORD_ENDS
      case GtkDeleteType.GTK_DELETE_WORDS         => DeleteType.WORDS
      case GtkDeleteType.GTK_DELETE_DISPLAY_LINES => DeleteType.DISPLAY_LINES
      case GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS =>
        DeleteType.DISPLAY_LINE_ENDS
      case GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS => DeleteType.PARAGRAPH_ENDS
      case GtkDeleteType.GTK_DELETE_PARAGRAPHS     => DeleteType.PARAGRAPHS
      case GtkDeleteType.GTK_DELETE_WHITESPACE     => DeleteType.WHITESPACE
  end fromRaw
end DeleteType
