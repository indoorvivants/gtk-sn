package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_font_weight_t

enum FontWeight(val raw: cairo_font_weight_t):
  case NORMAL extends FontWeight(cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL)
  case BOLD extends FontWeight(cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD)
end FontWeight

object FontWeight:
  def fromRaw(raw: cairo_font_weight_t): FontWeight =
    raw match
      case cairo_font_weight_t.CAIRO_FONT_WEIGHT_NORMAL => FontWeight.NORMAL
      case cairo_font_weight_t.CAIRO_FONT_WEIGHT_BOLD   => FontWeight.BOLD
  end fromRaw
end FontWeight
