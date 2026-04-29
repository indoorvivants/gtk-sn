package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoDirection: _DIRECTION_LTR: A strong left-to-right direction _DIRECTION_RTL: A strong right-to-left direction _DIRECTION_TTB_LTR: Deprecated value; treated the same as `PANGO_DIRECTION_RTL`. _DIRECTION_TTB_RTL: Deprecated value; treated the same as `PANGO_DIRECTION_LTR` _DIRECTION_WEAK_LTR: A weak left-to-right direction _DIRECTION_WEAK_RTL: A weak right-to-left direction _DIRECTION_NEUTRAL: No direction specified
*/
opaque type PangoDirection = CUnsignedInt
object PangoDirection extends _BindgenEnumCUnsignedInt[PangoDirection]:
  given _tag: Tag[PangoDirection] = Tag.UInt
  inline def define(inline a: Long): PangoDirection = a.toUInt
  val PANGO_DIRECTION_LTR = define(0)
  val PANGO_DIRECTION_RTL = define(1)
  val PANGO_DIRECTION_TTB_LTR = define(2)
  val PANGO_DIRECTION_TTB_RTL = define(3)
  val PANGO_DIRECTION_WEAK_LTR = define(4)
  val PANGO_DIRECTION_WEAK_RTL = define(5)
  val PANGO_DIRECTION_NEUTRAL = define(6)
  def getName(value: PangoDirection): Option[String] =
    value match
      case `PANGO_DIRECTION_LTR` => Some("PANGO_DIRECTION_LTR")
      case `PANGO_DIRECTION_RTL` => Some("PANGO_DIRECTION_RTL")
      case `PANGO_DIRECTION_TTB_LTR` => Some("PANGO_DIRECTION_TTB_LTR")
      case `PANGO_DIRECTION_TTB_RTL` => Some("PANGO_DIRECTION_TTB_RTL")
      case `PANGO_DIRECTION_WEAK_LTR` => Some("PANGO_DIRECTION_WEAK_LTR")
      case `PANGO_DIRECTION_WEAK_RTL` => Some("PANGO_DIRECTION_WEAK_RTL")
      case `PANGO_DIRECTION_NEUTRAL` => Some("PANGO_DIRECTION_NEUTRAL")
      case _ => _root_.scala.None
  extension (a: PangoDirection)
    inline def &(b: PangoDirection): PangoDirection = a & b
    inline def |(b: PangoDirection): PangoDirection = a | b
    inline def is(b: PangoDirection): Boolean = (a & b) == b