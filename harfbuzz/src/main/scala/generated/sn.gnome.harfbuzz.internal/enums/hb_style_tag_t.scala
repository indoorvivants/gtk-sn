package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_style_tag_t: _STYLE_TAG_ITALIC: Used to vary between non-italic and italic. A value of 0 can be interpreted as "Roman" (non-italic); a value of 1 can be interpreted as (fully) italic. _STYLE_TAG_OPTICAL_SIZE: Used to vary design to suit different text sizes. Non-zero. Values can be interpreted as text size, in points. _STYLE_TAG_SLANT_ANGLE: Used to vary between upright and slanted text. Values must be greater than -90 and less than +90. Values can be interpreted as the angle, in counter-clockwise degrees, of oblique slant from whatever the designer considers to be upright for that font design. Typical right-leaning Italic fonts have a negative slant angle (typically around -12) _STYLE_TAG_SLANT_RATIO: same as _STYLE_TAG_SLANT_ANGLE expression as ratio. Typical right-leaning Italic fonts have a positive slant ratio (typically around 0.2) _STYLE_TAG_WIDTH: Used to vary width of text from narrower to wider. Non-zero. Values can be interpreted as a percentage of whatever the font designer considers “normal width” for that font design. _STYLE_TAG_WEIGHT: Used to vary stroke thicknesses or other design details to give variation from lighter to blacker. Values can be interpreted in direct comparison to values for usWeightClass in the OS/2 table, or the CSS font-weight property.
*/
opaque type hb_style_tag_t = CUnsignedInt
object hb_style_tag_t extends _BindgenEnumCUnsignedInt[hb_style_tag_t]:
  given _tag: Tag[hb_style_tag_t] = Tag.UInt
  inline def define(inline a: Long): hb_style_tag_t = a.toUInt
  val HB_STYLE_TAG_ITALIC = define(1769234796)
  val HB_STYLE_TAG_OPTICAL_SIZE = define(1869640570)
  val HB_STYLE_TAG_SLANT_ANGLE = define(1936486004)
  val HB_STYLE_TAG_SLANT_RATIO = define(1399615092)
  val HB_STYLE_TAG_WIDTH = define(2003072104)
  val HB_STYLE_TAG_WEIGHT = define(2003265652)
  val _HB_STYLE_TAG_MAX_VALUE = define(2147483647)
  def getName(value: hb_style_tag_t): Option[String] =
    value match
      case `HB_STYLE_TAG_ITALIC` => Some("HB_STYLE_TAG_ITALIC")
      case `HB_STYLE_TAG_OPTICAL_SIZE` => Some("HB_STYLE_TAG_OPTICAL_SIZE")
      case `HB_STYLE_TAG_SLANT_ANGLE` => Some("HB_STYLE_TAG_SLANT_ANGLE")
      case `HB_STYLE_TAG_SLANT_RATIO` => Some("HB_STYLE_TAG_SLANT_RATIO")
      case `HB_STYLE_TAG_WIDTH` => Some("HB_STYLE_TAG_WIDTH")
      case `HB_STYLE_TAG_WEIGHT` => Some("HB_STYLE_TAG_WEIGHT")
      case `_HB_STYLE_TAG_MAX_VALUE` => Some("_HB_STYLE_TAG_MAX_VALUE")
      case _ => _root_.scala.None
  extension (a: hb_style_tag_t)
    inline def &(b: hb_style_tag_t): hb_style_tag_t = a & b
    inline def |(b: hb_style_tag_t): hb_style_tag_t = a | b
    inline def is(b: hb_style_tag_t): Boolean = (a & b) == b