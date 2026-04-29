package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_direction_t: _DIRECTION_INVALID: Initial, unset direction. _DIRECTION_LTR: Text is set horizontally from left to right. _DIRECTION_RTL: Text is set horizontally from right to left. _DIRECTION_TTB: Text is set vertically from top to bottom. _DIRECTION_BTT: Text is set vertically from bottom to top.
*/
opaque type hb_direction_t = CUnsignedInt
object hb_direction_t extends _BindgenEnumCUnsignedInt[hb_direction_t]:
  given _tag: Tag[hb_direction_t] = Tag.UInt
  inline def define(inline a: Long): hb_direction_t = a.toUInt
  val HB_DIRECTION_INVALID = define(0)
  val HB_DIRECTION_LTR = define(4)
  val HB_DIRECTION_RTL = define(5)
  val HB_DIRECTION_TTB = define(6)
  val HB_DIRECTION_BTT = define(7)
  def getName(value: hb_direction_t): Option[String] =
    value match
      case `HB_DIRECTION_INVALID` => Some("HB_DIRECTION_INVALID")
      case `HB_DIRECTION_LTR` => Some("HB_DIRECTION_LTR")
      case `HB_DIRECTION_RTL` => Some("HB_DIRECTION_RTL")
      case `HB_DIRECTION_TTB` => Some("HB_DIRECTION_TTB")
      case `HB_DIRECTION_BTT` => Some("HB_DIRECTION_BTT")
      case _ => _root_.scala.None
  extension (a: hb_direction_t)
    inline def &(b: hb_direction_t): hb_direction_t = a & b
    inline def |(b: hb_direction_t): hb_direction_t = a | b
    inline def is(b: hb_direction_t): Boolean = (a & b) == b