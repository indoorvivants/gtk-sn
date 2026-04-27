package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_antialias_t: _ANTIALIAS_DEFAULT: Use the default antialiasing for the subsystem and target device, since 1.0 _ANTIALIAS_NONE: Use a bilevel alpha mask, since 1.0 _ANTIALIAS_GRAY: Perform single-color antialiasing (using shades of gray for black text on a white background, for example), since 1.0 _ANTIALIAS_SUBPIXEL: Perform antialiasing by taking advantage of the order of subpixel elements on devices such as LCD panels, since 1.0 _ANTIALIAS_FAST: Hint that the backend should perform some antialiasing but prefer speed over quality, since 1.12 _ANTIALIAS_GOOD: The backend should balance quality against performance, since 1.12 _ANTIALIAS_BEST: Hint that the backend should render at the highest quality, sacrificing speed if necessary, since 1.12
*/
type cairo_antialias_t = _cairo_antialias
object cairo_antialias_t:
  given _tag: Tag[cairo_antialias_t] = _cairo_antialias._tag
  inline def apply(inline o: _cairo_antialias): cairo_antialias_t = o
  extension (v: cairo_antialias_t)
    inline def value: _cairo_antialias = v