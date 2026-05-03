package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_line_cap_t

enum LineCap(val raw: cairo_line_cap_t):
  case BUTT extends LineCap(cairo_line_cap_t.CAIRO_LINE_CAP_BUTT)
  case ROUND extends LineCap(cairo_line_cap_t.CAIRO_LINE_CAP_ROUND)
  case SQUARE extends LineCap(cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE)
end LineCap

object LineCap:
  def fromRaw(raw: cairo_line_cap_t): LineCap =
    raw match
      case cairo_line_cap_t.CAIRO_LINE_CAP_BUTT   => LineCap.BUTT
      case cairo_line_cap_t.CAIRO_LINE_CAP_ROUND  => LineCap.ROUND
      case cairo_line_cap_t.CAIRO_LINE_CAP_SQUARE => LineCap.SQUARE
  end fromRaw
end LineCap
