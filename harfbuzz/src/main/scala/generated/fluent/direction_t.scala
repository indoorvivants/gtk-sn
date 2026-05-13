package sn.gnome.harfbuzz

import _root_.sn.gnome.harfbuzz.internal.hb_direction_t

/** The direction of a text segment or buffer.
  *
  * A segment can also be tested for horizontal or vertical orientation
  * (irrespective of specific direction) with HB_DIRECTION_IS_HORIZONTAL() or
  * HB_DIRECTION_IS_VERTICAL().
  *
  * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS MIGHT
  * BE APPLICABLE TO SCALA
  */
enum Direction_t(val raw: hb_direction_t):
  /** Initial, unset direction.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case INVALID extends Direction_t(hb_direction_t.HB_DIRECTION_INVALID)

  /** Text is set horizontally from left to right.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case LTR extends Direction_t(hb_direction_t.HB_DIRECTION_LTR)

  /** Text is set horizontally from right to left.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case RTL extends Direction_t(hb_direction_t.HB_DIRECTION_RTL)

  /** Text is set vertically from top to bottom.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
    */
  case TTB extends Direction_t(hb_direction_t.HB_DIRECTION_TTB)

  /** Text is set vertically from bottom to top.
    *
    * NOTE: THIS IS A COMMENT FOR THE ORIGINAL C DEFINITION, NOT ALL DETAILS
    * MIGHT BE APPLICABLE TO SCALA
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
