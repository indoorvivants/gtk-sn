package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0
*/
type cairo_font_slant_t = _cairo_font_slant
object cairo_font_slant_t:
  given _tag: Tag[cairo_font_slant_t] = _cairo_font_slant._tag
  inline def apply(inline o: _cairo_font_slant): cairo_font_slant_t = o
  extension (v: cairo_font_slant_t)
    inline def value: _cairo_font_slant = v