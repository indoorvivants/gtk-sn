package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_hint_style_t: _HINT_STYLE_DEFAULT: Use the default hint style for font backend and target device, since 1.0 _HINT_STYLE_NONE: Do not hint outlines, since 1.0 _HINT_STYLE_SLIGHT: Hint outlines slightly to improve contrast while retaining good fidelity to the original shapes, since 1.0 _HINT_STYLE_MEDIUM: Hint outlines with medium strength giving a compromise between fidelity to the original shapes and contrast, since 1.0 _HINT_STYLE_FULL: Hint outlines to maximize contrast, since 1.0
*/
type cairo_hint_style_t = _cairo_hint_style
object cairo_hint_style_t:
  given _tag: Tag[cairo_hint_style_t] = _cairo_hint_style._tag
  inline def apply(inline o: _cairo_hint_style): cairo_hint_style_t = o
  extension (v: cairo_hint_style_t)
    inline def value: _cairo_hint_style = v