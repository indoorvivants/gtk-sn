package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoWrapMode: _WRAP_WORD: wrap lines at word boundaries. _WRAP_CHAR: wrap lines at character boundaries. _WRAP_WORD_CHAR: wrap lines at word boundaries, but fall back to character boundaries if there is not enough space for a full word.
*/
opaque type PangoWrapMode = CUnsignedInt
object PangoWrapMode extends _BindgenEnumCUnsignedInt[PangoWrapMode]:
  given _tag: Tag[PangoWrapMode] = Tag.UInt
  inline def define(inline a: Long): PangoWrapMode = a.toUInt
  val PANGO_WRAP_WORD = define(0)
  val PANGO_WRAP_CHAR = define(1)
  val PANGO_WRAP_WORD_CHAR = define(2)
  def getName(value: PangoWrapMode): Option[String] =
    value match
      case `PANGO_WRAP_WORD` => Some("PANGO_WRAP_WORD")
      case `PANGO_WRAP_CHAR` => Some("PANGO_WRAP_CHAR")
      case `PANGO_WRAP_WORD_CHAR` => Some("PANGO_WRAP_WORD_CHAR")
      case _ => _root_.scala.None
  extension (a: PangoWrapMode)
    inline def &(b: PangoWrapMode): PangoWrapMode = a & b
    inline def |(b: PangoWrapMode): PangoWrapMode = a | b
    inline def is(b: PangoWrapMode): Boolean = (a & b) == b