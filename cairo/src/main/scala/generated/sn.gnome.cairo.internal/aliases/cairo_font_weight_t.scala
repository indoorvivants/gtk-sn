package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_weight_t: _FONT_WEIGHT_NORMAL: Normal font weight, since 1.0 _FONT_WEIGHT_BOLD: Bold font weight, since 1.0
*/
type cairo_font_weight_t = _cairo_font_weight
object cairo_font_weight_t:
  given _tag: Tag[cairo_font_weight_t] = _cairo_font_weight._tag
  inline def apply(inline o: _cairo_font_weight): cairo_font_weight_t = o
  extension (v: cairo_font_weight_t)
    inline def value: _cairo_font_weight = v