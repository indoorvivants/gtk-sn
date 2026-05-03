package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoLogAttr: i.e. this is a grapheme boundary, or the first character in the text. This flag implements Unicode's [Grapheme Cluster Boundaries](http://www.unicode.org/reports/tr29/) semantics. Note that in degenerate cases, you could have both and There are two ways to divide sentences. The first assigns all inter-sentence whitespace/control/format chars to some sentence, so all chars are in some sentence; the boundaries there. The second way doesn't assign between-sentence spaces, etc. to any sentence, so Note that in degenerate cases, you could have both and period, so the next sentence starts right away) _deletes_character: if set, backspace deletes one character rather than the entire grapheme cluster. This field is only meaningful on grapheme boundaries (where the full grapheme (e.g. letter + diacritics) is considered a unit, while in others, each decomposed character in the grapheme is a unit. In the default implementation of [func], this bit is set on all grapheme boundaries except those following Latin, Cyrillic or Greek base characters. expanded for justification purposes. (Since: 1.18) More specifically, means that this is not a position in the middle of a word. For example, both sides of a punctuation mark are considered word boundaries. This flag is particularly useful when selecting text word-by-word. This flag implements Unicode's [Word Boundaries](http://www.unicode.org/reports/tr29/) semantics. (Since: 1.22) _inserts_hyphen: when breaking lines before this char, insert a hyphen. Since: 1.50 _removes_preceding: when breaking lines before this char, remove the preceding char. Since 1.50
*/
opaque type PangoLogAttr = CStruct16[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]

object PangoLogAttr:
  given _tag: Tag[PangoLogAttr] = Tag.materializeCStruct16Tag[_root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint, _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: PangoLogAttr)
      inline def is_line_break : _root_.sn.gnome.glib.internal.guint = struct._1
      inline def is_line_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at1 = value)
      inline def is_mandatory_break : _root_.sn.gnome.glib.internal.guint = struct._2
      inline def is_mandatory_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at2 = value)
      inline def is_char_break : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def is_char_break_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
      inline def is_white : _root_.sn.gnome.glib.internal.guint = struct._4
      inline def is_white_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at4 = value)
      inline def is_cursor_position : _root_.sn.gnome.glib.internal.guint = struct._5
      inline def is_cursor_position_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at5 = value)
      inline def is_word_start : _root_.sn.gnome.glib.internal.guint = struct._6
      inline def is_word_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at6 = value)
      inline def is_word_end : _root_.sn.gnome.glib.internal.guint = struct._7
      inline def is_word_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at7 = value)
      inline def is_sentence_boundary : _root_.sn.gnome.glib.internal.guint = struct._8
      inline def is_sentence_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at8 = value)
      inline def is_sentence_start : _root_.sn.gnome.glib.internal.guint = struct._9
      inline def is_sentence_start_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at9 = value)
      inline def is_sentence_end : _root_.sn.gnome.glib.internal.guint = struct._10
      inline def is_sentence_end_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at10 = value)
      inline def backspace_deletes_character : _root_.sn.gnome.glib.internal.guint = struct._11
      inline def backspace_deletes_character_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at11 = value)
      inline def is_expandable_space : _root_.sn.gnome.glib.internal.guint = struct._12
      inline def is_expandable_space_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at12 = value)
      inline def is_word_boundary : _root_.sn.gnome.glib.internal.guint = struct._13
      inline def is_word_boundary_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at13 = value)
      inline def break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint = struct._14
      inline def break_inserts_hyphen_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at14 = value)
      inline def break_removes_preceding : _root_.sn.gnome.glib.internal.guint = struct._15
      inline def break_removes_preceding_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at15 = value)
      inline def reserved : _root_.sn.gnome.glib.internal.guint = struct._16
      inline def reserved_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at16 = value)
    end extension
  
  // Allocates PangoLogAttr on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[PangoLogAttr] = scala.scalanative.unsafe.alloc[PangoLogAttr](1)
  def apply(is_line_break : _root_.sn.gnome.glib.internal.guint, is_mandatory_break : _root_.sn.gnome.glib.internal.guint, is_char_break : _root_.sn.gnome.glib.internal.guint, is_white : _root_.sn.gnome.glib.internal.guint, is_cursor_position : _root_.sn.gnome.glib.internal.guint, is_word_start : _root_.sn.gnome.glib.internal.guint, is_word_end : _root_.sn.gnome.glib.internal.guint, is_sentence_boundary : _root_.sn.gnome.glib.internal.guint, is_sentence_start : _root_.sn.gnome.glib.internal.guint, is_sentence_end : _root_.sn.gnome.glib.internal.guint, backspace_deletes_character : _root_.sn.gnome.glib.internal.guint, is_expandable_space : _root_.sn.gnome.glib.internal.guint, is_word_boundary : _root_.sn.gnome.glib.internal.guint, break_inserts_hyphen : _root_.sn.gnome.glib.internal.guint, break_removes_preceding : _root_.sn.gnome.glib.internal.guint, reserved : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[PangoLogAttr] =
    val ____ptr = apply()
    (!____ptr).is_line_break = is_line_break
    (!____ptr).is_mandatory_break = is_mandatory_break
    (!____ptr).is_char_break = is_char_break
    (!____ptr).is_white = is_white
    (!____ptr).is_cursor_position = is_cursor_position
    (!____ptr).is_word_start = is_word_start
    (!____ptr).is_word_end = is_word_end
    (!____ptr).is_sentence_boundary = is_sentence_boundary
    (!____ptr).is_sentence_start = is_sentence_start
    (!____ptr).is_sentence_end = is_sentence_end
    (!____ptr).backspace_deletes_character = backspace_deletes_character
    (!____ptr).is_expandable_space = is_expandable_space
    (!____ptr).is_word_boundary = is_word_boundary
    (!____ptr).break_inserts_hyphen = break_inserts_hyphen
    (!____ptr).break_removes_preceding = break_removes_preceding
    (!____ptr).reserved = reserved
    ____ptr