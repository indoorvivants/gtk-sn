package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_font_slant_t: _FONT_SLANT_NORMAL: Upright font style, since 1.0 _FONT_SLANT_ITALIC: Italic font style, since 1.0 _FONT_SLANT_OBLIQUE: Oblique font style, since 1.0
*/
type cairo_font_slant_t = _cairo_font_slant
object cairo_font_slant_t:
  inline def apply(inline o: _cairo_font_slant): cairo_font_slant_t = o
  export _cairo_font_slant.{apply => _, *, given}