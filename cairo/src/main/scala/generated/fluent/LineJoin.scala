package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_line_join_t

enum LineJoin(val raw: cairo_line_join_t):
  case MITER extends LineJoin(cairo_line_join_t.CAIRO_LINE_JOIN_MITER)
  case ROUND extends LineJoin(cairo_line_join_t.CAIRO_LINE_JOIN_ROUND)
  case BEVEL extends LineJoin(cairo_line_join_t.CAIRO_LINE_JOIN_BEVEL)
end LineJoin

object LineJoin:
  def fromRaw(raw: cairo_line_join_t): LineJoin =
    raw match
      case cairo_line_join_t.CAIRO_LINE_JOIN_MITER => LineJoin.MITER
      case cairo_line_join_t.CAIRO_LINE_JOIN_ROUND => LineJoin.ROUND
      case cairo_line_join_t.CAIRO_LINE_JOIN_BEVEL => LineJoin.BEVEL
  end fromRaw
end LineJoin
