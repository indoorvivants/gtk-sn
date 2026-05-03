package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_paint_extend_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The values of this enumeration determine how color values outside the
  * minimum and maximum defined offset on a #hb_color_line_t are determined.
  *
  * See the OpenType spec
  * [COLR](https://learn.microsoft.com/en-us/typography/opentype/spec/colr)
  * section for details.
  */
enum paint_extend_t(val raw: hb_paint_extend_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Outside the defined interval, the color of the closest color stop is used.
    */
  case PAD extends paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_PAD)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The color line is repeated over repeated multiples of the defined interval
    */
  case REPEAT extends paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_REPEAT)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * The color line is repeated over repeated intervals, as for the repeat
    * mode. However, in each repeated interval, the ordering of color stops is
    * the reverse of the adjacent interval.
    */
  case REFLECT extends paint_extend_t(hb_paint_extend_t.HB_PAINT_EXTEND_REFLECT)
end paint_extend_t

object paint_extend_t:
  def fromRaw(raw: hb_paint_extend_t): paint_extend_t =
    raw match
      case hb_paint_extend_t.HB_PAINT_EXTEND_PAD     => paint_extend_t.PAD
      case hb_paint_extend_t.HB_PAINT_EXTEND_REPEAT  => paint_extend_t.REPEAT
      case hb_paint_extend_t.HB_PAINT_EXTEND_REFLECT => paint_extend_t.REFLECT
  end fromRaw
end paint_extend_t
