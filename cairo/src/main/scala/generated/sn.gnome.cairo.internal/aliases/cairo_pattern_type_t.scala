package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_pattern_type_t: _PATTERN_TYPE_SOLID: The pattern is a solid (uniform) color. It may be opaque or translucent, since 1.2. _PATTERN_TYPE_SURFACE: The pattern is a based on a surface (an image), since 1.2. _PATTERN_TYPE_LINEAR: The pattern is a linear gradient, since 1.2. _PATTERN_TYPE_RADIAL: The pattern is a radial gradient, since 1.2. _PATTERN_TYPE_MESH: The pattern is a mesh, since 1.12. _PATTERN_TYPE_RASTER_SOURCE: The pattern is a user pattern providing raster data, since 1.12.
*/
type cairo_pattern_type_t = _cairo_pattern_type
object cairo_pattern_type_t:
  given _tag: Tag[cairo_pattern_type_t] = _cairo_pattern_type._tag
  inline def apply(inline o: _cairo_pattern_type): cairo_pattern_type_t = o
  extension (v: cairo_pattern_type_t)
    inline def value: _cairo_pattern_type = v