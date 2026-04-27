package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_color_mode_t: _COLOR_MODE_DEFAULT: Use the default color mode for font backend and target device, since 1.18. _COLOR_MODE_NO_COLOR: Disable rendering color glyphs. Glyphs are always rendered as outline glyphs, since 1.18. _COLOR_MODE_COLOR: Enable rendering color glyphs. If the font contains a color presentation for a glyph, and when supported by the font backend, the glyph will be rendered in color, since 1.18.
*/
opaque type _cairo_color_mode = CUnsignedInt
object _cairo_color_mode extends _BindgenEnumCUnsignedInt[_cairo_color_mode]:
  given _tag: Tag[_cairo_color_mode] = Tag.UInt
  inline def define(inline a: Long): _cairo_color_mode = a.toUInt
  val CAIRO_COLOR_MODE_DEFAULT = define(0)
  val CAIRO_COLOR_MODE_NO_COLOR = define(1)
  val CAIRO_COLOR_MODE_COLOR = define(2)
  def getName(value: _cairo_color_mode): Option[String] =
    value match
      case `CAIRO_COLOR_MODE_DEFAULT` => Some("CAIRO_COLOR_MODE_DEFAULT")
      case `CAIRO_COLOR_MODE_NO_COLOR` => Some("CAIRO_COLOR_MODE_NO_COLOR")
      case `CAIRO_COLOR_MODE_COLOR` => Some("CAIRO_COLOR_MODE_COLOR")
      case _ => _root_.scala.None
  extension (a: _cairo_color_mode)
    inline def &(b: _cairo_color_mode): _cairo_color_mode = a & b
    inline def |(b: _cairo_color_mode): _cairo_color_mode = a | b
    inline def is(b: _cairo_color_mode): Boolean = (a & b) == b