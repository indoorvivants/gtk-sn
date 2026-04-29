package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_paint_extend_t: _PAINT_EXTEND_PAD: Outside the defined interval, the color of the closest color stop is used. _PAINT_EXTEND_REPEAT: The color line is repeated over repeated multiples of the defined interval _PAINT_EXTEND_REFLECT: The color line is repeated over repeated intervals, as for the repeat mode. However, in each repeated interval, the ordering of color stops is the reverse of the adjacent interval.
*/
opaque type hb_paint_extend_t = CUnsignedInt
object hb_paint_extend_t extends _BindgenEnumCUnsignedInt[hb_paint_extend_t]:
  given _tag: Tag[hb_paint_extend_t] = Tag.UInt
  inline def define(inline a: Long): hb_paint_extend_t = a.toUInt
  val HB_PAINT_EXTEND_PAD = define(0)
  val HB_PAINT_EXTEND_REPEAT = define(1)
  val HB_PAINT_EXTEND_REFLECT = define(2)
  def getName(value: hb_paint_extend_t): Option[String] =
    value match
      case `HB_PAINT_EXTEND_PAD` => Some("HB_PAINT_EXTEND_PAD")
      case `HB_PAINT_EXTEND_REPEAT` => Some("HB_PAINT_EXTEND_REPEAT")
      case `HB_PAINT_EXTEND_REFLECT` => Some("HB_PAINT_EXTEND_REFLECT")
      case _ => _root_.scala.None
  extension (a: hb_paint_extend_t)
    inline def &(b: hb_paint_extend_t): hb_paint_extend_t = a & b
    inline def |(b: hb_paint_extend_t): hb_paint_extend_t = a | b
    inline def is(b: hb_paint_extend_t): Boolean = (a & b) == b