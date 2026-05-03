package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskLineJoin: _LINE_JOIN_MITER: Use a sharp angled corner _LINE_JOIN_ROUND: Use a round join, the center of the circle is the join point _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point
*/
opaque type GskLineJoin = CUnsignedInt
object GskLineJoin extends _BindgenEnumCUnsignedInt[GskLineJoin]:
  given _tag: Tag[GskLineJoin] = Tag.UInt
  inline def define(inline a: Long): GskLineJoin = a.toUInt
  val GSK_LINE_JOIN_MITER = define(0)
  val GSK_LINE_JOIN_ROUND = define(1)
  val GSK_LINE_JOIN_BEVEL = define(2)
  def getName(value: GskLineJoin): Option[String] =
    value match
      case `GSK_LINE_JOIN_MITER` => Some("GSK_LINE_JOIN_MITER")
      case `GSK_LINE_JOIN_ROUND` => Some("GSK_LINE_JOIN_ROUND")
      case `GSK_LINE_JOIN_BEVEL` => Some("GSK_LINE_JOIN_BEVEL")
      case _ => _root_.scala.None
  extension (a: GskLineJoin)
    inline def &(b: GskLineJoin): GskLineJoin = a & b
    inline def |(b: GskLineJoin): GskLineJoin = a | b
    inline def is(b: GskLineJoin): Boolean = (a & b) == b