package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_filter_t: _FILTER_FAST: A high-performance filter, with quality similar to %CAIRO_FILTER_NEAREST (Since 1.0) _FILTER_GOOD: A reasonable-performance filter, with quality similar to %CAIRO_FILTER_BILINEAR (Since 1.0) _FILTER_BEST: The highest-quality available, performance may not be suitable for interactive use. (Since 1.0) _FILTER_NEAREST: Nearest-neighbor filtering (Since 1.0) _FILTER_BILINEAR: Linear interpolation in two dimensions (Since 1.0) _FILTER_GAUSSIAN: This filter value is currently unimplemented, and should not be used in current code. (Since 1.0)
*/
type cairo_filter_t = _cairo_filter
object cairo_filter_t:
  given _tag: Tag[cairo_filter_t] = _cairo_filter._tag
  inline def apply(inline o: _cairo_filter): cairo_filter_t = o
  extension (v: cairo_filter_t)
    inline def value: _cairo_filter = v