package sn.gnome.harfbuzz.fluent

import _root_.sn.gnome.harfbuzz.internal.hb_direction_t

/** COMMENT FOR THE ORIGINAL C DEFINITION
  *
  * The direction of a text segment or buffer.
  *
  * A segment can also be tested for horizontal or vertical orientation
  * (irrespective of specific direction) with HB_DIRECTION_IS_HORIZONTAL() or
  * HB_DIRECTION_IS_VERTICAL().
  */
enum direction_t(val raw: hb_direction_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initial, unset direction.
    */
  case INVALID extends direction_t(hb_direction_t.HB_DIRECTION_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set horizontally from left to right.
    */
  case LTR extends direction_t(hb_direction_t.HB_DIRECTION_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set horizontally from right to left.
    */
  case RTL extends direction_t(hb_direction_t.HB_DIRECTION_RTL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set vertically from top to bottom.
    */
  case TTB extends direction_t(hb_direction_t.HB_DIRECTION_TTB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set vertically from bottom to top.
    */
  case BTT extends direction_t(hb_direction_t.HB_DIRECTION_BTT)
end direction_t

object direction_t:
  def fromRaw(raw: hb_direction_t): direction_t =
    raw match
      case hb_direction_t.HB_DIRECTION_INVALID => direction_t.INVALID
      case hb_direction_t.HB_DIRECTION_LTR     => direction_t.LTR
      case hb_direction_t.HB_DIRECTION_RTL     => direction_t.RTL
      case hb_direction_t.HB_DIRECTION_TTB     => direction_t.TTB
      case hb_direction_t.HB_DIRECTION_BTT     => direction_t.BTT
  end fromRaw
end direction_t
