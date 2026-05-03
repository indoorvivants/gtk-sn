package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_dither_t: _DITHER_NONE: No dithering. _DITHER_DEFAULT: Default choice at cairo compile time. Currently NONE. _DITHER_FAST: Fastest dithering algorithm supported by the backend _DITHER_GOOD: An algorithm with smoother dithering than FAST _DITHER_BEST: Best algorithm available in the backend
*/
type cairo_dither_t = _cairo_dither
object cairo_dither_t:
  inline def apply(inline o: _cairo_dither): cairo_dither_t = o
  export _cairo_dither.{apply => _, *, given}