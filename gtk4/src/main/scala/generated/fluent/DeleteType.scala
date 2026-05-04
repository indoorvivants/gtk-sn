package sn.gnome.gtk4.fluent

import _root_.sn.gnome.gtk4.internal.GtkDeleteType

/** Passed to various keybinding signals for deleting text.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum DeleteType(val raw: GtkDeleteType):
  /** Delete characters.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case CHARS extends DeleteType(GtkDeleteType.GTK_DELETE_CHARS)

  /** Delete only the portion of the word to the left/right of cursor if we’re
    * in the middle of a word.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORD_ENDS extends DeleteType(GtkDeleteType.GTK_DELETE_WORD_ENDS)

  /** Delete words.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case WORDS extends DeleteType(GtkDeleteType.GTK_DELETE_WORDS)

  /** Delete display-lines. Display-lines refers to the visible lines, with
    * respect to the current line breaks. As opposed to paragraphs, which are
    * defined by line breaks in the input.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISPLAY_LINES extends DeleteType(GtkDeleteType.GTK_DELETE_DISPLAY_LINES)

  /** Delete only the portion of the display-line to the left/right of cursor.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case DISPLAY_LINE_ENDS
      extends DeleteType(GtkDeleteType.GTK_DELETE_DISPLAY_LINE_ENDS)

  /** Delete to the end of the paragraph. Like C-k in Emacs (or its reverse).
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPH_ENDS
      extends DeleteType(GtkDeleteType.GTK_DELETE_PARAGRAPH_ENDS)

  /** Delete entire line. Like C-k in pico.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PARAGRAPHS extends DeleteType(GtkDeleteType.GTK_DELETE_PARAGRAPHS)

  /** Delete only whitespace. Like M-\ in Emacs.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
