package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoFontMask: _FONT_MASK_FAMILY: the font family is specified. _FONT_MASK_STYLE: the font style is specified. _FONT_MASK_VARIANT: the font variant is specified. _FONT_MASK_WEIGHT: the font weight is specified. _FONT_MASK_STRETCH: the font stretch is specified. _FONT_MASK_SIZE: the font size is specified. _FONT_MASK_GRAVITY: the font gravity is specified (Since: 1.16.) _FONT_MASK_VARIATIONS: OpenType font variations are specified (Since: 1.42)
*/
opaque type PangoFontMask = CUnsignedInt
object PangoFontMask extends _BindgenEnumCUnsignedInt[PangoFontMask]:
  given _tag: Tag[PangoFontMask] = Tag.UInt
  inline def define(inline a: Long): PangoFontMask = a.toUInt
  val PANGO_FONT_MASK_FAMILY = define(1)
  val PANGO_FONT_MASK_STYLE = define(2)
  val PANGO_FONT_MASK_VARIANT = define(4)
  val PANGO_FONT_MASK_WEIGHT = define(8)
  val PANGO_FONT_MASK_STRETCH = define(16)
  val PANGO_FONT_MASK_SIZE = define(32)
  val PANGO_FONT_MASK_GRAVITY = define(64)
  val PANGO_FONT_MASK_VARIATIONS = define(128)
  def getName(value: PangoFontMask): Option[String] =
    value match
      case `PANGO_FONT_MASK_FAMILY` => Some("PANGO_FONT_MASK_FAMILY")
      case `PANGO_FONT_MASK_STYLE` => Some("PANGO_FONT_MASK_STYLE")
      case `PANGO_FONT_MASK_VARIANT` => Some("PANGO_FONT_MASK_VARIANT")
      case `PANGO_FONT_MASK_WEIGHT` => Some("PANGO_FONT_MASK_WEIGHT")
      case `PANGO_FONT_MASK_STRETCH` => Some("PANGO_FONT_MASK_STRETCH")
      case `PANGO_FONT_MASK_SIZE` => Some("PANGO_FONT_MASK_SIZE")
      case `PANGO_FONT_MASK_GRAVITY` => Some("PANGO_FONT_MASK_GRAVITY")
      case `PANGO_FONT_MASK_VARIATIONS` => Some("PANGO_FONT_MASK_VARIATIONS")
      case _ => _root_.scala.None
  extension (a: PangoFontMask)
    inline def &(b: PangoFontMask): PangoFontMask = a & b
    inline def |(b: PangoFontMask): PangoFontMask = a | b
    inline def is(b: PangoFontMask): Boolean = (a & b) == b