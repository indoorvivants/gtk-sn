package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_line_cap_t: _LINE_CAP_BUTT: start(stop) the line exactly at the start(end) point (Since 1.0) _LINE_CAP_ROUND: use a round ending, the center of the circle is the end point (Since 1.0) _LINE_CAP_SQUARE: use squared ending, the center of the square is the end point (Since 1.0)
*/
type cairo_line_cap_t = _cairo_line_cap
object cairo_line_cap_t:
  given _tag: Tag[cairo_line_cap_t] = _cairo_line_cap._tag
  inline def apply(inline o: _cairo_line_cap): cairo_line_cap_t = o
  extension (v: cairo_line_cap_t)
    inline def value: _cairo_line_cap = v