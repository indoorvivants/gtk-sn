package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_paint_extend_t

/** The values of this enumeration determine how color values outside the
  * minimum and maximum defined offset on a #hb_color_line_t are determined.
  *
  * See the OpenType spec
  * [COLR](https://learn.microsoft.com/en-us/typography/opentype/spec/colr)
  * section for details.
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Paint_extend_t(val raw: hb_paint_extend_t):
  /** Outside the defined interval, the color of the closest color stop is used.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case PAD extends Paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_PAD)

  /** The color line is repeated over repeated multiples of the defined interval
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REPEAT extends Paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_REPEAT)

  /** The color line is repeated over repeated intervals, as for the repeat
    * mode. However, in each repeated interval, the ordering of color stops is
    * the reverse of the adjacent interval.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case REFLECT extends Paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_REFLECT)
end Paint_extend_t

object Paint_extend_t:
  def fromRaw(raw: hb_paint_extend_t): Paint_extend_t =
    raw match
      case hb_paint_extend_t.HB_PAINT_EXTEND_PAD     => Paint_extend_t.PAD
      case hb_paint_extend_t.HB_PAINT_EXTEND_REPEAT  => Paint_extend_t.REPEAT
      case hb_paint_extend_t.HB_PAINT_EXTEND_REFLECT => Paint_extend_t.REFLECT
  end fromRaw
end Paint_extend_t
