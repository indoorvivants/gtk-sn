package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDeleteType: _DELETE_CHARS: Delete characters. _DELETE_WORD_ENDS: Delete only the portion of the word to the left/right of cursor if we’re in the middle of a word. _DELETE_WORDS: Delete words. _DELETE_DISPLAY_LINES: Delete display-lines. Display-lines refers to the visible lines, with respect to the current line breaks. As opposed to paragraphs, which are defined by line breaks in the input. _DELETE_DISPLAY_LINE_ENDS: Delete only the portion of the display-line to the left/right of cursor. _DELETE_PARAGRAPH_ENDS: Delete to the end of the paragraph. Like C-k in Emacs (or its reverse). _DELETE_PARAGRAPHS: Delete entire line. Like C-k in pico. _DELETE_WHITESPACE: Delete only whitespace. Like M-\ in Emacs.
*/
opaque type GtkDeleteType = CUnsignedInt
object GtkDeleteType extends _BindgenEnumCUnsignedInt[GtkDeleteType]:
  given _tag: Tag[GtkDeleteType] = Tag.UInt
  inline def define(inline a: Long): GtkDeleteType = a.toUInt
  val GTK_DELETE_CHARS = define(0)
  val GTK_DELETE_WORD_ENDS = define(1)
  val GTK_DELETE_WORDS = define(2)
  val GTK_DELETE_DISPLAY_LINES = define(3)
  val GTK_DELETE_DISPLAY_LINE_ENDS = define(4)
  val GTK_DELETE_PARAGRAPH_ENDS = define(5)
  val GTK_DELETE_PARAGRAPHS = define(6)
  val GTK_DELETE_WHITESPACE = define(7)
  def getName(value: GtkDeleteType): Option[String] =
    value match
      case `GTK_DELETE_CHARS` => Some("GTK_DELETE_CHARS")
      case `GTK_DELETE_WORD_ENDS` => Some("GTK_DELETE_WORD_ENDS")
      case `GTK_DELETE_WORDS` => Some("GTK_DELETE_WORDS")
      case `GTK_DELETE_DISPLAY_LINES` => Some("GTK_DELETE_DISPLAY_LINES")
      case `GTK_DELETE_DISPLAY_LINE_ENDS` => Some("GTK_DELETE_DISPLAY_LINE_ENDS")
      case `GTK_DELETE_PARAGRAPH_ENDS` => Some("GTK_DELETE_PARAGRAPH_ENDS")
      case `GTK_DELETE_PARAGRAPHS` => Some("GTK_DELETE_PARAGRAPHS")
      case `GTK_DELETE_WHITESPACE` => Some("GTK_DELETE_WHITESPACE")
      case _ => _root_.scala.None
  extension (a: GtkDeleteType)
    inline def &(b: GtkDeleteType): GtkDeleteType = a & b
    inline def |(b: GtkDeleteType): GtkDeleteType = a | b
    inline def is(b: GtkDeleteType): Boolean = (a & b) == b