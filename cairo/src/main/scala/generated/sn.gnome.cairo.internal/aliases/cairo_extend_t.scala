package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_extend_t: _EXTEND_NONE: pixels outside of the source pattern are fully transparent (Since 1.0) _EXTEND_REPEAT: the pattern is tiled by repeating (Since 1.0) _EXTEND_REFLECT: the pattern is tiled by reflecting at the edges (Since 1.0; but only implemented for surface patterns since 1.6) _EXTEND_PAD: pixels outside of the pattern copy the closest pixel from the source (Since 1.2; but only implemented for surface patterns since 1.6)
*/
type cairo_extend_t = _cairo_extend
object cairo_extend_t:
  given _tag: Tag[cairo_extend_t] = _cairo_extend._tag
  inline def apply(inline o: _cairo_extend): cairo_extend_t = o
  extension (v: cairo_extend_t)
    inline def value: _cairo_extend = v