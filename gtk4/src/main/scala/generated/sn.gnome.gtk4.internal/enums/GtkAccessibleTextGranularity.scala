package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkAccessibleTextGranularity: _ACCESSIBLE_TEXT_GRANULARITY_CHARACTER: Use the boundary between characters (including non-printing characters) _ACCESSIBLE_TEXT_GRANULARITY_WORD: Use the boundary between words, starting from the beginning of the current word and ending at the beginning of the next word _ACCESSIBLE_TEXT_GRANULARITY_SENTENCE: Use the boundary between sentences, starting from the beginning of the current sentence and ending at the beginning of the next sentence _ACCESSIBLE_TEXT_GRANULARITY_LINE: Use the boundary between lines, starting from the beginning of the current line and ending at the beginning of the next line _ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH: Use the boundary between paragraphs, starting from the beginning of the current paragraph and ending at the beginning of the next paragraph
*/
opaque type GtkAccessibleTextGranularity = CUnsignedInt
object GtkAccessibleTextGranularity extends _BindgenEnumCUnsignedInt[GtkAccessibleTextGranularity]:
  given _tag: Tag[GtkAccessibleTextGranularity] = Tag.UInt
  inline def define(inline a: Long): GtkAccessibleTextGranularity = a.toUInt
  val GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER = define(0)
  val GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD = define(1)
  val GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE = define(2)
  val GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE = define(3)
  val GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH = define(4)
  def getName(value: GtkAccessibleTextGranularity): Option[String] =
    value match
      case `GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER` => Some("GTK_ACCESSIBLE_TEXT_GRANULARITY_CHARACTER")
      case `GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD` => Some("GTK_ACCESSIBLE_TEXT_GRANULARITY_WORD")
      case `GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE` => Some("GTK_ACCESSIBLE_TEXT_GRANULARITY_SENTENCE")
      case `GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE` => Some("GTK_ACCESSIBLE_TEXT_GRANULARITY_LINE")
      case `GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH` => Some("GTK_ACCESSIBLE_TEXT_GRANULARITY_PARAGRAPH")
      case _ => _root_.scala.None
  extension (a: GtkAccessibleTextGranularity)
    inline def &(b: GtkAccessibleTextGranularity): GtkAccessibleTextGranularity = a & b
    inline def |(b: GtkAccessibleTextGranularity): GtkAccessibleTextGranularity = a | b
    inline def is(b: GtkAccessibleTextGranularity): Boolean = (a & b) == b