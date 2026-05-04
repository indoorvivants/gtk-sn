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
enum Direction_t(val raw: hb_direction_t):
  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Initial, unset direction.
    */
  case INVALID extends Direction_t(hb_direction_t.HB_DIRECTION_INVALID)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set horizontally from left to right.
    */
  case LTR extends Direction_t(hb_direction_t.HB_DIRECTION_LTR)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set horizontally from right to left.
    */
  case RTL extends Direction_t(hb_direction_t.HB_DIRECTION_RTL)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set vertically from top to bottom.
    */
  case TTB extends Direction_t(hb_direction_t.HB_DIRECTION_TTB)

  /** COMMENT FOR THE ORIGINAL C DEFINITION
    *
    * Text is set vertically from bottom to top.
    */
  case BTT extends Direction_t(hb_direction_t.HB_DIRECTION_BTT)
end Direction_t

object Direction_t:
  def fromRaw(raw: hb_direction_t): Direction_t =
    raw match
      case hb_direction_t.HB_DIRECTION_INVALID => Direction_t.INVALID
      case hb_direction_t.HB_DIRECTION_LTR     => Direction_t.LTR
      case hb_direction_t.HB_DIRECTION_RTL     => Direction_t.RTL
      case hb_direction_t.HB_DIRECTION_TTB     => Direction_t.TTB
      case hb_direction_t.HB_DIRECTION_BTT     => Direction_t.BTT
  end fromRaw
end Direction_t
