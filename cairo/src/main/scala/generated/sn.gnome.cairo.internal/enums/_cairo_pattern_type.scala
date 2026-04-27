package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_pattern_type_t: _PATTERN_TYPE_SOLID: The pattern is a solid (uniform) color. It may be opaque or translucent, since 1.2. _PATTERN_TYPE_SURFACE: The pattern is a based on a surface (an image), since 1.2. _PATTERN_TYPE_LINEAR: The pattern is a linear gradient, since 1.2. _PATTERN_TYPE_RADIAL: The pattern is a radial gradient, since 1.2. _PATTERN_TYPE_MESH: The pattern is a mesh, since 1.12. _PATTERN_TYPE_RASTER_SOURCE: The pattern is a user pattern providing raster data, since 1.12.
*/
opaque type _cairo_pattern_type = CUnsignedInt
object _cairo_pattern_type extends _BindgenEnumCUnsignedInt[_cairo_pattern_type]:
  given _tag: Tag[_cairo_pattern_type] = Tag.UInt
  inline def define(inline a: Long): _cairo_pattern_type = a.toUInt
  val CAIRO_PATTERN_TYPE_SOLID = define(0)
  val CAIRO_PATTERN_TYPE_SURFACE = define(1)
  val CAIRO_PATTERN_TYPE_LINEAR = define(2)
  val CAIRO_PATTERN_TYPE_RADIAL = define(3)
  val CAIRO_PATTERN_TYPE_MESH = define(4)
  val CAIRO_PATTERN_TYPE_RASTER_SOURCE = define(5)
  def getName(value: _cairo_pattern_type): Option[String] =
    value match
      case `CAIRO_PATTERN_TYPE_SOLID` => Some("CAIRO_PATTERN_TYPE_SOLID")
      case `CAIRO_PATTERN_TYPE_SURFACE` => Some("CAIRO_PATTERN_TYPE_SURFACE")
      case `CAIRO_PATTERN_TYPE_LINEAR` => Some("CAIRO_PATTERN_TYPE_LINEAR")
      case `CAIRO_PATTERN_TYPE_RADIAL` => Some("CAIRO_PATTERN_TYPE_RADIAL")
      case `CAIRO_PATTERN_TYPE_MESH` => Some("CAIRO_PATTERN_TYPE_MESH")
      case `CAIRO_PATTERN_TYPE_RASTER_SOURCE` => Some("CAIRO_PATTERN_TYPE_RASTER_SOURCE")
      case _ => _root_.scala.None
  extension (a: _cairo_pattern_type)
    inline def &(b: _cairo_pattern_type): _cairo_pattern_type = a & b
    inline def |(b: _cairo_pattern_type): _cairo_pattern_type = a | b
    inline def is(b: _cairo_pattern_type): Boolean = (a & b) == b