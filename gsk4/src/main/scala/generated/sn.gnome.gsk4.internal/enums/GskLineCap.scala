package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskLineCap: _LINE_CAP_BUTT: Start and stop the line exactly at the start and end point _LINE_CAP_ROUND: Use a round ending, the center of the circle is the start or end point _LINE_CAP_SQUARE: use squared ending, the center of the square is the start or end point
*/
opaque type GskLineCap = CUnsignedInt
object GskLineCap extends _BindgenEnumCUnsignedInt[GskLineCap]:
  given _tag: Tag[GskLineCap] = Tag.UInt
  inline def define(inline a: Long): GskLineCap = a.toUInt
  val GSK_LINE_CAP_BUTT = define(0)
  val GSK_LINE_CAP_ROUND = define(1)
  val GSK_LINE_CAP_SQUARE = define(2)
  def getName(value: GskLineCap): Option[String] =
    value match
      case `GSK_LINE_CAP_BUTT` => Some("GSK_LINE_CAP_BUTT")
      case `GSK_LINE_CAP_ROUND` => Some("GSK_LINE_CAP_ROUND")
      case `GSK_LINE_CAP_SQUARE` => Some("GSK_LINE_CAP_SQUARE")
      case _ => _root_.scala.None
  extension (a: GskLineCap)
    inline def &(b: GskLineCap): GskLineCap = a & b
    inline def |(b: GskLineCap): GskLineCap = a | b
    inline def is(b: GskLineCap): Boolean = (a & b) == b