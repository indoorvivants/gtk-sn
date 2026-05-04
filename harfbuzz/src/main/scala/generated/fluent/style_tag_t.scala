package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_style_tag_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * Defined by [OpenType Design-Variation Axis Tag
  * Registry](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg).
  */
enum Style_tag_t(val raw: hb_style_tag_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to vary between non-italic and italic. A value of 0 can be
    * interpreted as "Roman" (non-italic); a value of 1 can be interpreted as
    * (fully) italic.
    */
  case ITALIC extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_ITALIC)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to vary design to suit different text sizes. Non-zero. Values can be
    * interpreted as text size, in points.
    */
  case OPTICAL_SIZE
      extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_OPTICAL_SIZE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to vary between upright and slanted text. Values must be greater than
    * -90 and less than +90. Values can be interpreted as the angle, in
    * counter-clockwise degrees, of oblique slant from whatever the designer
    * considers to be upright for that font design. Typical right-leaning Italic
    * fonts have a negative slant angle (typically around -12)
    */
  case SLANT_ANGLE extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_SLANT_ANGLE)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * same as @HB_STYLE_TAG_SLANT_ANGLE expression as ratio. Typical
    * right-leaning Italic fonts have a positive slant ratio (typically around
    * 0.2)
    */
  case SLANT_RATIO extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_SLANT_RATIO)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to vary width of text from narrower to wider. Non-zero. Values can be
    * interpreted as a percentage of whatever the font designer considers
    * “normal width” for that font design.
    */
  case WIDTH extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_WIDTH)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Used to vary stroke thicknesses or other design details to give variation
    * from lighter to blacker. Values can be interpreted in direct comparison to
    * values for usWeightClass in the OS/2 table, or the CSS font-weight
    * property.
    */
  case WEIGHT extends Style_tag_t(hb_style_tag_t.HB_STYLE_TAG_WEIGHT)
end Style_tag_t

object Style_tag_t:
  def fromRaw(raw: hb_style_tag_t): Style_tag_t =
    raw match
      case hb_style_tag_t.HB_STYLE_TAG_ITALIC       => Style_tag_t.ITALIC
      case hb_style_tag_t.HB_STYLE_TAG_OPTICAL_SIZE => Style_tag_t.OPTICAL_SIZE
      case hb_style_tag_t.HB_STYLE_TAG_SLANT_ANGLE  => Style_tag_t.SLANT_ANGLE
      case hb_style_tag_t.HB_STYLE_TAG_SLANT_RATIO  => Style_tag_t.SLANT_RATIO
      case hb_style_tag_t.HB_STYLE_TAG_WIDTH        => Style_tag_t.WIDTH
      case hb_style_tag_t.HB_STYLE_TAG_WEIGHT       => Style_tag_t.WEIGHT
  end fromRaw
end Style_tag_t
