package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrType: _ATTR_INVALID: does not happen _ATTR_LANGUAGE: language ([struct.AttrLanguage]) _ATTR_FAMILY: font family name list ([struct.AttrString]) _ATTR_STYLE: font slant style ([struct.AttrInt]) _ATTR_WEIGHT: font weight ([struct.AttrInt]) _ATTR_VARIANT: font variant (normal or small caps) ([struct.AttrInt]) _ATTR_STRETCH: font stretch ([struct.AttrInt]) _ATTR_SIZE: font size in points scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_FONT_DESC: font description ([struct.AttrFontDesc]) _ATTR_FOREGROUND: foreground color ([struct.AttrColor]) _ATTR_BACKGROUND: background color ([struct.AttrColor]) _ATTR_UNDERLINE: whether the text has an underline ([struct.AttrInt]) _ATTR_STRIKETHROUGH: whether the text is struck-through ([struct.AttrInt]) _ATTR_RISE: baseline displacement ([struct.AttrInt]) _ATTR_SHAPE: shape ([struct.AttrShape]) _ATTR_SCALE: font size scale factor ([struct.AttrFloat]) _ATTR_FALLBACK: whether fallback is enabled ([struct.AttrInt]) _ATTR_LETTER_SPACING: letter spacing ([struct]) _ATTR_UNDERLINE_COLOR: underline color ([struct.AttrColor]) _ATTR_STRIKETHROUGH_COLOR: strikethrough color ([struct.AttrColor]) _ATTR_ABSOLUTE_SIZE: font size in pixels scaled by %PANGO_SCALE ([struct.AttrInt]) _ATTR_GRAVITY: base text gravity ([struct.AttrInt]) _ATTR_GRAVITY_HINT: gravity hint ([struct.AttrInt]) _ATTR_FONT_FEATURES: OpenType font features ([struct.AttrFontFeatures]). Since 1.38 _ATTR_FOREGROUND_ALPHA: foreground alpha ([struct.AttrInt]). Since 1.38 _ATTR_BACKGROUND_ALPHA: background alpha ([struct.AttrInt]). Since 1.38 _ATTR_ALLOW_BREAKS: whether breaks are allowed ([struct.AttrInt]). Since 1.44 _ATTR_SHOW: how to render invisible characters ([struct.AttrInt]). Since 1.44 _ATTR_INSERT_HYPHENS: whether to insert hyphens at intra-word line breaks ([struct.AttrInt]). Since 1.44 _ATTR_OVERLINE: whether the text has an overline ([struct.AttrInt]). Since 1.46 _ATTR_OVERLINE_COLOR: overline color ([struct.AttrColor]). Since 1.46 _ATTR_LINE_HEIGHT: line height factor ([struct.AttrFloat]). Since: 1.50 _ATTR_ABSOLUTE_LINE_HEIGHT: line height ([struct.AttrInt]). Since: 1.50 _ATTR_WORD: override segmentation to classify the range of the attribute as a single word ([struct.AttrInt]). Since 1.50 _ATTR_SENTENCE: override segmentation to classify the range of the attribute as a single sentence ([struct.AttrInt]). Since 1.50 _ATTR_BASELINE_SHIFT: baseline displacement ([struct.AttrInt]). Since 1.50 _ATTR_FONT_SCALE: font-relative size change ([struct.AttrInt]). Since 1.50
*/
opaque type PangoAttrType = CUnsignedInt
object PangoAttrType extends _BindgenEnumCUnsignedInt[PangoAttrType]:
  given _tag: Tag[PangoAttrType] = Tag.UInt
  inline def define(inline a: Long): PangoAttrType = a.toUInt
  val PANGO_ATTR_INVALID = define(0)
  val PANGO_ATTR_LANGUAGE = define(1)
  val PANGO_ATTR_FAMILY = define(2)
  val PANGO_ATTR_STYLE = define(3)
  val PANGO_ATTR_WEIGHT = define(4)
  val PANGO_ATTR_VARIANT = define(5)
  val PANGO_ATTR_STRETCH = define(6)
  val PANGO_ATTR_SIZE = define(7)
  val PANGO_ATTR_FONT_DESC = define(8)
  val PANGO_ATTR_FOREGROUND = define(9)
  val PANGO_ATTR_BACKGROUND = define(10)
  val PANGO_ATTR_UNDERLINE = define(11)
  val PANGO_ATTR_STRIKETHROUGH = define(12)
  val PANGO_ATTR_RISE = define(13)
  val PANGO_ATTR_SHAPE = define(14)
  val PANGO_ATTR_SCALE = define(15)
  val PANGO_ATTR_FALLBACK = define(16)
  val PANGO_ATTR_LETTER_SPACING = define(17)
  val PANGO_ATTR_UNDERLINE_COLOR = define(18)
  val PANGO_ATTR_STRIKETHROUGH_COLOR = define(19)
  val PANGO_ATTR_ABSOLUTE_SIZE = define(20)
  val PANGO_ATTR_GRAVITY = define(21)
  val PANGO_ATTR_GRAVITY_HINT = define(22)
  val PANGO_ATTR_FONT_FEATURES = define(23)
  val PANGO_ATTR_FOREGROUND_ALPHA = define(24)
  val PANGO_ATTR_BACKGROUND_ALPHA = define(25)
  val PANGO_ATTR_ALLOW_BREAKS = define(26)
  val PANGO_ATTR_SHOW = define(27)
  val PANGO_ATTR_INSERT_HYPHENS = define(28)
  val PANGO_ATTR_OVERLINE = define(29)
  val PANGO_ATTR_OVERLINE_COLOR = define(30)
  val PANGO_ATTR_LINE_HEIGHT = define(31)
  val PANGO_ATTR_ABSOLUTE_LINE_HEIGHT = define(32)
  val PANGO_ATTR_TEXT_TRANSFORM = define(33)
  val PANGO_ATTR_WORD = define(34)
  val PANGO_ATTR_SENTENCE = define(35)
  val PANGO_ATTR_BASELINE_SHIFT = define(36)
  val PANGO_ATTR_FONT_SCALE = define(37)
  def getName(value: PangoAttrType): Option[String] =
    value match
      case `PANGO_ATTR_INVALID` => Some("PANGO_ATTR_INVALID")
      case `PANGO_ATTR_LANGUAGE` => Some("PANGO_ATTR_LANGUAGE")
      case `PANGO_ATTR_FAMILY` => Some("PANGO_ATTR_FAMILY")
      case `PANGO_ATTR_STYLE` => Some("PANGO_ATTR_STYLE")
      case `PANGO_ATTR_WEIGHT` => Some("PANGO_ATTR_WEIGHT")
      case `PANGO_ATTR_VARIANT` => Some("PANGO_ATTR_VARIANT")
      case `PANGO_ATTR_STRETCH` => Some("PANGO_ATTR_STRETCH")
      case `PANGO_ATTR_SIZE` => Some("PANGO_ATTR_SIZE")
      case `PANGO_ATTR_FONT_DESC` => Some("PANGO_ATTR_FONT_DESC")
      case `PANGO_ATTR_FOREGROUND` => Some("PANGO_ATTR_FOREGROUND")
      case `PANGO_ATTR_BACKGROUND` => Some("PANGO_ATTR_BACKGROUND")
      case `PANGO_ATTR_UNDERLINE` => Some("PANGO_ATTR_UNDERLINE")
      case `PANGO_ATTR_STRIKETHROUGH` => Some("PANGO_ATTR_STRIKETHROUGH")
      case `PANGO_ATTR_RISE` => Some("PANGO_ATTR_RISE")
      case `PANGO_ATTR_SHAPE` => Some("PANGO_ATTR_SHAPE")
      case `PANGO_ATTR_SCALE` => Some("PANGO_ATTR_SCALE")
      case `PANGO_ATTR_FALLBACK` => Some("PANGO_ATTR_FALLBACK")
      case `PANGO_ATTR_LETTER_SPACING` => Some("PANGO_ATTR_LETTER_SPACING")
      case `PANGO_ATTR_UNDERLINE_COLOR` => Some("PANGO_ATTR_UNDERLINE_COLOR")
      case `PANGO_ATTR_STRIKETHROUGH_COLOR` => Some("PANGO_ATTR_STRIKETHROUGH_COLOR")
      case `PANGO_ATTR_ABSOLUTE_SIZE` => Some("PANGO_ATTR_ABSOLUTE_SIZE")
      case `PANGO_ATTR_GRAVITY` => Some("PANGO_ATTR_GRAVITY")
      case `PANGO_ATTR_GRAVITY_HINT` => Some("PANGO_ATTR_GRAVITY_HINT")
      case `PANGO_ATTR_FONT_FEATURES` => Some("PANGO_ATTR_FONT_FEATURES")
      case `PANGO_ATTR_FOREGROUND_ALPHA` => Some("PANGO_ATTR_FOREGROUND_ALPHA")
      case `PANGO_ATTR_BACKGROUND_ALPHA` => Some("PANGO_ATTR_BACKGROUND_ALPHA")
      case `PANGO_ATTR_ALLOW_BREAKS` => Some("PANGO_ATTR_ALLOW_BREAKS")
      case `PANGO_ATTR_SHOW` => Some("PANGO_ATTR_SHOW")
      case `PANGO_ATTR_INSERT_HYPHENS` => Some("PANGO_ATTR_INSERT_HYPHENS")
      case `PANGO_ATTR_OVERLINE` => Some("PANGO_ATTR_OVERLINE")
      case `PANGO_ATTR_OVERLINE_COLOR` => Some("PANGO_ATTR_OVERLINE_COLOR")
      case `PANGO_ATTR_LINE_HEIGHT` => Some("PANGO_ATTR_LINE_HEIGHT")
      case `PANGO_ATTR_ABSOLUTE_LINE_HEIGHT` => Some("PANGO_ATTR_ABSOLUTE_LINE_HEIGHT")
      case `PANGO_ATTR_TEXT_TRANSFORM` => Some("PANGO_ATTR_TEXT_TRANSFORM")
      case `PANGO_ATTR_WORD` => Some("PANGO_ATTR_WORD")
      case `PANGO_ATTR_SENTENCE` => Some("PANGO_ATTR_SENTENCE")
      case `PANGO_ATTR_BASELINE_SHIFT` => Some("PANGO_ATTR_BASELINE_SHIFT")
      case `PANGO_ATTR_FONT_SCALE` => Some("PANGO_ATTR_FONT_SCALE")
      case _ => _root_.scala.None
  extension (a: PangoAttrType)
    inline def &(b: PangoAttrType): PangoAttrType = a & b
    inline def |(b: PangoAttrType): PangoAttrType = a | b
    inline def is(b: PangoAttrType): Boolean = (a & b) == b