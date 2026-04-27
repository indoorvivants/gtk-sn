package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+1-0ab16a73-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontColor: _FONT_COLOR_FORBIDDEN: The font should not have color glyphs _FONT_COLOR_REQUIRED: The font should have color glyphs _FONT_COLOR_DONT_CARE: The font may or may not use color
*/
opaque type PangoFontColor = CUnsignedInt
object PangoFontColor extends _BindgenEnumCUnsignedInt[PangoFontColor]:
  given _tag: Tag[PangoFontColor] = Tag.UInt
  inline def define(inline a: Long): PangoFontColor = a.toUInt
  val PANGO_FONT_COLOR_FORBIDDEN = define(0)
  val PANGO_FONT_COLOR_REQUIRED = define(1)
  val PANGO_FONT_COLOR_DONT_CARE = define(2)
  def getName(value: PangoFontColor): Option[String] =
    value match
      case `PANGO_FONT_COLOR_FORBIDDEN` => Some("PANGO_FONT_COLOR_FORBIDDEN")
      case `PANGO_FONT_COLOR_REQUIRED` => Some("PANGO_FONT_COLOR_REQUIRED")
      case `PANGO_FONT_COLOR_DONT_CARE` => Some("PANGO_FONT_COLOR_DONT_CARE")
      case _ => _root_.scala.None
  extension (a: PangoFontColor)
    inline def &(b: PangoFontColor): PangoFontColor = a & b
    inline def |(b: PangoFontColor): PangoFontColor = a | b
    inline def is(b: PangoFontColor): Boolean = (a & b) == b