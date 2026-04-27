package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkWrapMode: _WRAP_NONE: do not wrap lines; just make the text area wider _WRAP_CHAR: wrap text, breaking lines anywhere the cursor can appear (between characters, usually - if you want to be technical, between graphemes, see pango_get_log_attrs()) _WRAP_WORD: wrap text, breaking lines in between words _WRAP_WORD_CHAR: wrap text, breaking lines in between words, or if that is not enough, also between graphemes
*/
opaque type GtkWrapMode = CUnsignedInt
object GtkWrapMode extends _BindgenEnumCUnsignedInt[GtkWrapMode]:
  given _tag: Tag[GtkWrapMode] = Tag.UInt
  inline def define(inline a: Long): GtkWrapMode = a.toUInt
  val GTK_WRAP_NONE = define(0)
  val GTK_WRAP_CHAR = define(1)
  val GTK_WRAP_WORD = define(2)
  val GTK_WRAP_WORD_CHAR = define(3)
  def getName(value: GtkWrapMode): Option[String] =
    value match
      case `GTK_WRAP_NONE` => Some("GTK_WRAP_NONE")
      case `GTK_WRAP_CHAR` => Some("GTK_WRAP_CHAR")
      case `GTK_WRAP_WORD` => Some("GTK_WRAP_WORD")
      case `GTK_WRAP_WORD_CHAR` => Some("GTK_WRAP_WORD_CHAR")
      case _ => _root_.scala.None
  extension (a: GtkWrapMode)
    inline def &(b: GtkWrapMode): GtkWrapMode = a & b
    inline def |(b: GtkWrapMode): GtkWrapMode = a | b
    inline def is(b: GtkWrapMode): Boolean = (a & b) == b