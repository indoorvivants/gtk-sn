package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskCorner: _CORNER_TOP_LEFT: The top left corner _CORNER_TOP_RIGHT: The top right corner _CORNER_BOTTOM_RIGHT: The bottom right corner _CORNER_BOTTOM_LEFT: The bottom left corner
*/
opaque type GskCorner = CUnsignedInt
object GskCorner extends _BindgenEnumCUnsignedInt[GskCorner]:
  given _tag: Tag[GskCorner] = Tag.UInt
  inline def define(inline a: Long): GskCorner = a.toUInt
  val GSK_CORNER_TOP_LEFT = define(0)
  val GSK_CORNER_TOP_RIGHT = define(1)
  val GSK_CORNER_BOTTOM_RIGHT = define(2)
  val GSK_CORNER_BOTTOM_LEFT = define(3)
  def getName(value: GskCorner): Option[String] =
    value match
      case `GSK_CORNER_TOP_LEFT` => Some("GSK_CORNER_TOP_LEFT")
      case `GSK_CORNER_TOP_RIGHT` => Some("GSK_CORNER_TOP_RIGHT")
      case `GSK_CORNER_BOTTOM_RIGHT` => Some("GSK_CORNER_BOTTOM_RIGHT")
      case `GSK_CORNER_BOTTOM_LEFT` => Some("GSK_CORNER_BOTTOM_LEFT")
      case _ => _root_.scala.None
  extension (a: GskCorner)
    inline def &(b: GskCorner): GskCorner = a & b
    inline def |(b: GskCorner): GskCorner = a | b
    inline def is(b: GskCorner): Boolean = (a & b) == b