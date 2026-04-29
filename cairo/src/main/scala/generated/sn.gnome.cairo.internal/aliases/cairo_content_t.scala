package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_content_t: _CONTENT_COLOR: The surface will hold color content only. (Since 1.0) _CONTENT_ALPHA: The surface will hold alpha content only. (Since 1.0) _CONTENT_COLOR_ALPHA: The surface will hold color and alpha content. (Since 1.0)
*/
type cairo_content_t = _cairo_content
object cairo_content_t:
  given _tag: Tag[cairo_content_t] = _cairo_content._tag
  inline def apply(inline o: _cairo_content): cairo_content_t = o
  extension (v: cairo_content_t)
    inline def value: _cairo_content = v