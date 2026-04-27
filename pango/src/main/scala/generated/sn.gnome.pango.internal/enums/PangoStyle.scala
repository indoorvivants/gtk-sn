package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoStyle: _STYLE_NORMAL: the font is upright. _STYLE_OBLIQUE: the font is slanted, but in a roman style. _STYLE_ITALIC: the font is slanted in an italic style.
*/
opaque type PangoStyle = CUnsignedInt
object PangoStyle extends _BindgenEnumCUnsignedInt[PangoStyle]:
  given _tag: Tag[PangoStyle] = Tag.UInt
  inline def define(inline a: Long): PangoStyle = a.toUInt
  val PANGO_STYLE_NORMAL = define(0)
  val PANGO_STYLE_OBLIQUE = define(1)
  val PANGO_STYLE_ITALIC = define(2)
  def getName(value: PangoStyle): Option[String] =
    value match
      case `PANGO_STYLE_NORMAL` => Some("PANGO_STYLE_NORMAL")
      case `PANGO_STYLE_OBLIQUE` => Some("PANGO_STYLE_OBLIQUE")
      case `PANGO_STYLE_ITALIC` => Some("PANGO_STYLE_ITALIC")
      case _ => _root_.scala.None
  extension (a: PangoStyle)
    inline def &(b: PangoStyle): PangoStyle = a & b
    inline def |(b: PangoStyle): PangoStyle = a | b
    inline def is(b: PangoStyle): Boolean = (a & b) == b