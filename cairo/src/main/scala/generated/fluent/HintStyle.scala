package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_hint_style_t

enum HintStyle(val raw: cairo_hint_style_t):
  case DEFAULT extends HintStyle(cairo_hint_style_t.CAIRO_HINT_STYLE_DEFAULT)
  case NONE extends HintStyle(cairo_hint_style_t.CAIRO_HINT_STYLE_NONE)
  case SLIGHT extends HintStyle(cairo_hint_style_t.CAIRO_HINT_STYLE_SLIGHT)
  case MEDIUM extends HintStyle(cairo_hint_style_t.CAIRO_HINT_STYLE_MEDIUM)
  case FULL extends HintStyle(cairo_hint_style_t.CAIRO_HINT_STYLE_FULL)
end HintStyle

object HintStyle:
  def fromRaw(raw: cairo_hint_style_t): HintStyle =
    raw match
      case cairo_hint_style_t.CAIRO_HINT_STYLE_DEFAULT => HintStyle.DEFAULT
      case cairo_hint_style_t.CAIRO_HINT_STYLE_NONE    => HintStyle.NONE
      case cairo_hint_style_t.CAIRO_HINT_STYLE_SLIGHT  => HintStyle.SLIGHT
      case cairo_hint_style_t.CAIRO_HINT_STYLE_MEDIUM  => HintStyle.MEDIUM
      case cairo_hint_style_t.CAIRO_HINT_STYLE_FULL    => HintStyle.FULL
  end fromRaw
end HintStyle
