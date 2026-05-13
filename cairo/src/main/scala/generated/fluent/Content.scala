package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_content_t

enum Content(val raw: cairo_content_t):
  case COLOR extends Content(cairo_content_t.CAIRO_CONTENT_COLOR)
  case ALPHA extends Content(cairo_content_t.CAIRO_CONTENT_ALPHA)
  case COLOR_ALPHA extends Content(cairo_content_t.CAIRO_CONTENT_COLOR_ALPHA)
end Content

object Content:
  def fromRaw(raw: cairo_content_t): Content =
    raw match
      case cairo_content_t.CAIRO_CONTENT_COLOR       => Content.COLOR
      case cairo_content_t.CAIRO_CONTENT_ALPHA       => Content.ALPHA
      case cairo_content_t.CAIRO_CONTENT_COLOR_ALPHA => Content.COLOR_ALPHA
  end fromRaw
end Content
