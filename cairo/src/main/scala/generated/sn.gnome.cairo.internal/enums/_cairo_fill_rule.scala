package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_fill_rule_t: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. (Since 1.0) _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled. (Since 1.0)
*/
opaque type _cairo_fill_rule = CUnsignedInt
object _cairo_fill_rule extends _BindgenEnumCUnsignedInt[_cairo_fill_rule]:
  given _tag: Tag[_cairo_fill_rule] = Tag.UInt
  inline def define(inline a: Long): _cairo_fill_rule = a.toUInt
  val CAIRO_FILL_RULE_WINDING = define(0)
  val CAIRO_FILL_RULE_EVEN_ODD = define(1)
  def getName(value: _cairo_fill_rule): Option[String] =
    value match
      case `CAIRO_FILL_RULE_WINDING` => Some("CAIRO_FILL_RULE_WINDING")
      case `CAIRO_FILL_RULE_EVEN_ODD` => Some("CAIRO_FILL_RULE_EVEN_ODD")
      case _ => _root_.scala.None
  extension (a: _cairo_fill_rule)
    inline def &(b: _cairo_fill_rule): _cairo_fill_rule = a & b
    inline def |(b: _cairo_fill_rule): _cairo_fill_rule = a | b
    inline def is(b: _cairo_fill_rule): Boolean = (a & b) == b