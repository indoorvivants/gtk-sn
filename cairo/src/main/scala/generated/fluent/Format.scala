package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_format_t

enum Format(val raw: cairo_format_t):
  case INVALID extends Format(cairo_format_t.CAIRO_FORMAT_INVALID)
  case ARGB32 extends Format(cairo_format_t.CAIRO_FORMAT_ARGB32)
  case RGB24 extends Format(cairo_format_t.CAIRO_FORMAT_RGB24)
  case A8 extends Format(cairo_format_t.CAIRO_FORMAT_A8)
  case A1 extends Format(cairo_format_t.CAIRO_FORMAT_A1)
  case RGB16_565 extends Format(cairo_format_t.CAIRO_FORMAT_RGB16_565)
  case RGB30 extends Format(cairo_format_t.CAIRO_FORMAT_RGB30)
end Format

object Format:
  def fromRaw(raw: cairo_format_t): Format =
    raw match
      case cairo_format_t.CAIRO_FORMAT_INVALID   => Format.INVALID
      case cairo_format_t.CAIRO_FORMAT_ARGB32    => Format.ARGB32
      case cairo_format_t.CAIRO_FORMAT_RGB24     => Format.RGB24
      case cairo_format_t.CAIRO_FORMAT_A8        => Format.A8
      case cairo_format_t.CAIRO_FORMAT_A1        => Format.A1
      case cairo_format_t.CAIRO_FORMAT_RGB16_565 => Format.RGB16_565
      case cairo_format_t.CAIRO_FORMAT_RGB30     => Format.RGB30
  end fromRaw
end Format
