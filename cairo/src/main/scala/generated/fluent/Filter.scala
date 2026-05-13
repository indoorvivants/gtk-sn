package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_filter_t

enum Filter(val raw: cairo_filter_t):
  case FAST extends Filter(cairo_filter_t.CAIRO_FILTER_FAST)
  case GOOD extends Filter(cairo_filter_t.CAIRO_FILTER_GOOD)
  case BEST extends Filter(cairo_filter_t.CAIRO_FILTER_BEST)
  case NEAREST extends Filter(cairo_filter_t.CAIRO_FILTER_NEAREST)
  case BILINEAR extends Filter(cairo_filter_t.CAIRO_FILTER_BILINEAR)
  case GAUSSIAN extends Filter(cairo_filter_t.CAIRO_FILTER_GAUSSIAN)
end Filter

object Filter:
  def fromRaw(raw: cairo_filter_t): Filter =
    raw match
      case cairo_filter_t.CAIRO_FILTER_FAST     => Filter.FAST
      case cairo_filter_t.CAIRO_FILTER_GOOD     => Filter.GOOD
      case cairo_filter_t.CAIRO_FILTER_BEST     => Filter.BEST
      case cairo_filter_t.CAIRO_FILTER_NEAREST  => Filter.NEAREST
      case cairo_filter_t.CAIRO_FILTER_BILINEAR => Filter.BILINEAR
      case cairo_filter_t.CAIRO_FILTER_GAUSSIAN => Filter.GAUSSIAN
  end fromRaw
end Filter
