package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_antialias_t

enum Antialias(val raw: cairo_antialias_t):
  case DEFAULT extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_DEFAULT)
  case NONE extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_NONE)
  case GRAY extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_GRAY)
  case SUBPIXEL extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_SUBPIXEL)
  case FAST extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_FAST)
  case GOOD extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_GOOD)
  case BEST extends Antialias(cairo_antialias_t.CAIRO_ANTIALIAS_BEST)
end Antialias

object Antialias:
  def fromRaw(raw: cairo_antialias_t): Antialias =
    raw match
      case cairo_antialias_t.CAIRO_ANTIALIAS_DEFAULT  => Antialias.DEFAULT
      case cairo_antialias_t.CAIRO_ANTIALIAS_NONE     => Antialias.NONE
      case cairo_antialias_t.CAIRO_ANTIALIAS_GRAY     => Antialias.GRAY
      case cairo_antialias_t.CAIRO_ANTIALIAS_SUBPIXEL => Antialias.SUBPIXEL
      case cairo_antialias_t.CAIRO_ANTIALIAS_FAST     => Antialias.FAST
      case cairo_antialias_t.CAIRO_ANTIALIAS_GOOD     => Antialias.GOOD
      case cairo_antialias_t.CAIRO_ANTIALIAS_BEST     => Antialias.BEST
  end fromRaw
end Antialias
