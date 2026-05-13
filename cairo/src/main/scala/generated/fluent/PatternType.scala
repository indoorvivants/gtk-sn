package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_pattern_type_t

enum PatternType(val raw: cairo_pattern_type_t):
  case SOLID extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SOLID)
  case SURFACE
      extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SURFACE)
  case LINEAR
      extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_LINEAR)
  case RADIAL
      extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RADIAL)
  case MESH extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_MESH)
  case RASTER_SOURCE
      extends PatternType(cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RASTER_SOURCE)
end PatternType

object PatternType:
  def fromRaw(raw: cairo_pattern_type_t): PatternType =
    raw match
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SOLID   => PatternType.SOLID
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_SURFACE =>
        PatternType.SURFACE
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_LINEAR => PatternType.LINEAR
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RADIAL => PatternType.RADIAL
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_MESH   => PatternType.MESH
      case cairo_pattern_type_t.CAIRO_PATTERN_TYPE_RASTER_SOURCE =>
        PatternType.RASTER_SOURCE
  end fromRaw
end PatternType
