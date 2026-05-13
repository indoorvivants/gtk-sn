package sn.gnome.cairo

import _root_.sn.gnome.cairo.internal.cairo_font_type_t

enum FontType(val raw: cairo_font_type_t):
  case TOY extends FontType(cairo_font_type_t.CAIRO_FONT_TYPE_TOY)
  case FT extends FontType(cairo_font_type_t.CAIRO_FONT_TYPE_FT)
  case WIN32 extends FontType(cairo_font_type_t.CAIRO_FONT_TYPE_WIN32)
  case QUARTZ extends FontType(cairo_font_type_t.CAIRO_FONT_TYPE_QUARTZ)
  case USER extends FontType(cairo_font_type_t.CAIRO_FONT_TYPE_USER)
end FontType

object FontType:
  def fromRaw(raw: cairo_font_type_t): FontType =
    raw match
      case cairo_font_type_t.CAIRO_FONT_TYPE_TOY    => FontType.TOY
      case cairo_font_type_t.CAIRO_FONT_TYPE_FT     => FontType.FT
      case cairo_font_type_t.CAIRO_FONT_TYPE_WIN32  => FontType.WIN32
      case cairo_font_type_t.CAIRO_FONT_TYPE_QUARTZ => FontType.QUARTZ
      case cairo_font_type_t.CAIRO_FONT_TYPE_USER   => FontType.USER
  end fromRaw
end FontType
