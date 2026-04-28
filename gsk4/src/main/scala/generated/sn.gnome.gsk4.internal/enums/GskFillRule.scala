package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskFillRule: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled.
*/
opaque type GskFillRule = CUnsignedInt
object GskFillRule extends _BindgenEnumCUnsignedInt[GskFillRule]:
  given _tag: Tag[GskFillRule] = Tag.UInt
  inline def define(inline a: Long): GskFillRule = a.toUInt
  val GSK_FILL_RULE_WINDING = define(0)
  val GSK_FILL_RULE_EVEN_ODD = define(1)
  def getName(value: GskFillRule): Option[String] =
    value match
      case `GSK_FILL_RULE_WINDING` => Some("GSK_FILL_RULE_WINDING")
      case `GSK_FILL_RULE_EVEN_ODD` => Some("GSK_FILL_RULE_EVEN_ODD")
      case _ => _root_.scala.None
  extension (a: GskFillRule)
    inline def &(b: GskFillRule): GskFillRule = a & b
    inline def |(b: GskFillRule): GskFillRule = a | b
    inline def is(b: GskFillRule): Boolean = (a & b) == b