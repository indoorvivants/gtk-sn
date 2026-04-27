package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_fill_rule_t: _FILL_RULE_WINDING: If the path crosses the ray from left-to-right, counts +1. If the path crosses the ray from right to left, counts -1. (Left and right are determined from the perspective of looking along the ray from the starting point.) If the total count is non-zero, the point will be filled. (Since 1.0) _FILL_RULE_EVEN_ODD: Counts the total number of intersections, without regard to the orientation of the contour. If the total number of intersections is odd, the point will be filled. (Since 1.0)
*/
type cairo_fill_rule_t = _cairo_fill_rule
object cairo_fill_rule_t:
  given _tag: Tag[cairo_fill_rule_t] = _cairo_fill_rule._tag
  inline def apply(inline o: _cairo_fill_rule): cairo_fill_rule_t = o
  extension (v: cairo_fill_rule_t)
    inline def value: _cairo_fill_rule = v