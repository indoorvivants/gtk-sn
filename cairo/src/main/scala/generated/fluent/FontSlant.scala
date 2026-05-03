package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_font_slant_t

enum FontSlant(val raw: cairo_font_slant_t):
  case NORMAL extends FontSlant(cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL)
  case ITALIC extends FontSlant(cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC)
  case OBLIQUE extends FontSlant(cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE)
end FontSlant

object FontSlant:
  def fromRaw(raw: cairo_font_slant_t): FontSlant =
    raw match
      case cairo_font_slant_t.CAIRO_FONT_SLANT_NORMAL  => FontSlant.NORMAL
      case cairo_font_slant_t.CAIRO_FONT_SLANT_ITALIC  => FontSlant.ITALIC
      case cairo_font_slant_t.CAIRO_FONT_SLANT_OBLIQUE => FontSlant.OBLIQUE
  end fromRaw
end FontSlant
