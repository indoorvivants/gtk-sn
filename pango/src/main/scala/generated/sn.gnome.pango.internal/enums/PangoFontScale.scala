package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontScale: _FONT_SCALE_NONE: Leave the font size unchanged _FONT_SCALE_SUPERSCRIPT: Change the font to a size suitable for superscripts _FONT_SCALE_SUBSCRIPT: Change the font to a size suitable for subscripts _FONT_SCALE_SMALL_CAPS: Change the font to a size suitable for Small Caps
*/
opaque type PangoFontScale = CUnsignedInt
object PangoFontScale extends _BindgenEnumCUnsignedInt[PangoFontScale]:
  given _tag: Tag[PangoFontScale] = Tag.UInt
  inline def define(inline a: Long): PangoFontScale = a.toUInt
  val PANGO_FONT_SCALE_NONE = define(0)
  val PANGO_FONT_SCALE_SUPERSCRIPT = define(1)
  val PANGO_FONT_SCALE_SUBSCRIPT = define(2)
  val PANGO_FONT_SCALE_SMALL_CAPS = define(3)
  def getName(value: PangoFontScale): Option[String] =
    value match
      case `PANGO_FONT_SCALE_NONE` => Some("PANGO_FONT_SCALE_NONE")
      case `PANGO_FONT_SCALE_SUPERSCRIPT` => Some("PANGO_FONT_SCALE_SUPERSCRIPT")
      case `PANGO_FONT_SCALE_SUBSCRIPT` => Some("PANGO_FONT_SCALE_SUBSCRIPT")
      case `PANGO_FONT_SCALE_SMALL_CAPS` => Some("PANGO_FONT_SCALE_SMALL_CAPS")
      case _ => _root_.scala.None
  extension (a: PangoFontScale)
    inline def &(b: PangoFontScale): PangoFontScale = a & b
    inline def |(b: PangoFontScale): PangoFontScale = a | b
    inline def is(b: PangoFontScale): Boolean = (a & b) == b