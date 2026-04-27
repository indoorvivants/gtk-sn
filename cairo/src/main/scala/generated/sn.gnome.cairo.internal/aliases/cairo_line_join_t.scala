package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_line_join_t: _LINE_JOIN_MITER: use a sharp (angled) corner, see cairo_set_miter_limit() (Since 1.0) _LINE_JOIN_ROUND: use a rounded join, the center of the circle is the joint point (Since 1.0) _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point (Since 1.0)
*/
type cairo_line_join_t = _cairo_line_join
object cairo_line_join_t:
  given _tag: Tag[cairo_line_join_t] = _cairo_line_join._tag
  inline def apply(inline o: _cairo_line_join): cairo_line_join_t = o
  extension (v: cairo_line_join_t)
    inline def value: _cairo_line_join = v