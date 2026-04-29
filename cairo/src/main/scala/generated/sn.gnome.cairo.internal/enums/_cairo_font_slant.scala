package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0
*/
opaque type _cairo_font_slant = CUnsignedInt
object _cairo_font_slant extends _BindgenEnumCUnsignedInt[_cairo_font_slant]:
  given _tag: Tag[_cairo_font_slant] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_slant = a.toUInt
  val CAIRO_FONT_SLANT_NORMAL = define(0)
  val CAIRO_FONT_SLANT_ITALIC = define(1)
  val CAIRO_FONT_SLANT_OBLIQUE = define(2)
  def getName(value: _cairo_font_slant): Option[String] =
    value match
      case `CAIRO_FONT_SLANT_NORMAL` => Some("CAIRO_FONT_SLANT_NORMAL")
      case `CAIRO_FONT_SLANT_ITALIC` => Some("CAIRO_FONT_SLANT_ITALIC")
      case `CAIRO_FONT_SLANT_OBLIQUE` => Some("CAIRO_FONT_SLANT_OBLIQUE")
      case _ => _root_.scala.None
  extension (a: _cairo_font_slant)
    inline def &(b: _cairo_font_slant): _cairo_font_slant = a & b
    inline def |(b: _cairo_font_slant): _cairo_font_slant = a | b
    inline def is(b: _cairo_font_slant): Boolean = (a & b) == b