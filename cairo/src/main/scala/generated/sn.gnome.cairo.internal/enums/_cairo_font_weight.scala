package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_weight_t: _FONT_WEIGHT_NORMAL: Normal font weight, since 1.0 _FONT_WEIGHT_BOLD: Bold font weight, since 1.0
*/
opaque type _cairo_font_weight = CUnsignedInt
object _cairo_font_weight extends _BindgenEnumCUnsignedInt[_cairo_font_weight]:
  given _tag: Tag[_cairo_font_weight] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_weight = a.toUInt
  val CAIRO_FONT_WEIGHT_NORMAL = define(0)
  val CAIRO_FONT_WEIGHT_BOLD = define(1)
  def getName(value: _cairo_font_weight): Option[String] =
    value match
      case `CAIRO_FONT_WEIGHT_NORMAL` => Some("CAIRO_FONT_WEIGHT_NORMAL")
      case `CAIRO_FONT_WEIGHT_BOLD` => Some("CAIRO_FONT_WEIGHT_BOLD")
      case _ => _root_.scala.None
  extension (a: _cairo_font_weight)
    inline def &(b: _cairo_font_weight): _cairo_font_weight = a & b
    inline def |(b: _cairo_font_weight): _cairo_font_weight = a | b
    inline def is(b: _cairo_font_weight): Boolean = (a & b) == b