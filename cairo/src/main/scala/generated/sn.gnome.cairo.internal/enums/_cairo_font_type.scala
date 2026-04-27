package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_type_t: _FONT_TYPE_TOY: The font was created using cairo's toy font api (Since: 1.2) _FONT_TYPE_FT: The font is of type FreeType (Since: 1.2) _FONT_TYPE_WIN32: The font is of type Win32 (Since: 1.2) _FONT_TYPE_QUARTZ: The font is of type Quartz (Since: 1.6, in 1.2 and 1.4 it was named CAIRO_FONT_TYPE_ATSUI) _FONT_TYPE_USER: The font was create using cairo's user font api (Since: 1.8) _FONT_TYPE_DWRITE: The font is of type Win32 DWrite (Since: 1.18)
*/
opaque type _cairo_font_type = CUnsignedInt
object _cairo_font_type extends _BindgenEnumCUnsignedInt[_cairo_font_type]:
  given _tag: Tag[_cairo_font_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_font_type = a.toUInt
  val CAIRO_FONT_TYPE_TOY = define(0)
  val CAIRO_FONT_TYPE_FT = define(1)
  val CAIRO_FONT_TYPE_WIN32 = define(2)
  val CAIRO_FONT_TYPE_QUARTZ = define(3)
  val CAIRO_FONT_TYPE_USER = define(4)
  val CAIRO_FONT_TYPE_DWRITE = define(5)
  def getName(value: _cairo_font_type): Option[String] =
    value match
      case `CAIRO_FONT_TYPE_TOY` => Some("CAIRO_FONT_TYPE_TOY")
      case `CAIRO_FONT_TYPE_FT` => Some("CAIRO_FONT_TYPE_FT")
      case `CAIRO_FONT_TYPE_WIN32` => Some("CAIRO_FONT_TYPE_WIN32")
      case `CAIRO_FONT_TYPE_QUARTZ` => Some("CAIRO_FONT_TYPE_QUARTZ")
      case `CAIRO_FONT_TYPE_USER` => Some("CAIRO_FONT_TYPE_USER")
      case `CAIRO_FONT_TYPE_DWRITE` => Some("CAIRO_FONT_TYPE_DWRITE")
      case _ => _root_.scala.None
  extension (a: _cairo_font_type)
    inline def &(b: _cairo_font_type): _cairo_font_type = a & b
    inline def |(b: _cairo_font_type): _cairo_font_type = a | b
    inline def is(b: _cairo_font_type): Boolean = (a & b) == b