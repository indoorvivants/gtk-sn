package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_region_overlap_t

enum RegionOverlap(val raw: cairo_region_overlap_t):
  case IN extends RegionOverlap(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_IN)
  case OUT
      extends RegionOverlap(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_OUT)
  case PART
      extends RegionOverlap(cairo_region_overlap_t.CAIRO_REGION_OVERLAP_PART)
end RegionOverlap

object RegionOverlap:
  def fromRaw(raw: cairo_region_overlap_t): RegionOverlap =
    raw match
      case cairo_region_overlap_t.CAIRO_REGION_OVERLAP_IN   => RegionOverlap.IN
      case cairo_region_overlap_t.CAIRO_REGION_OVERLAP_OUT  => RegionOverlap.OUT
      case cairo_region_overlap_t.CAIRO_REGION_OVERLAP_PART =>
        RegionOverlap.PART
  end fromRaw
end RegionOverlap
