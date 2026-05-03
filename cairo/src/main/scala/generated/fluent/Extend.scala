package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_extend_t

enum Extend(val raw: cairo_extend_t):
  case NONE extends Extend(cairo_extend_t.CAIRO_EXTEND_NONE)
  case REPEAT extends Extend(cairo_extend_t.CAIRO_EXTEND_REPEAT)
  case REFLECT extends Extend(cairo_extend_t.CAIRO_EXTEND_REFLECT)
  case PAD extends Extend(cairo_extend_t.CAIRO_EXTEND_PAD)
end Extend

object Extend:
  def fromRaw(raw: cairo_extend_t): Extend =
    raw match
      case cairo_extend_t.CAIRO_EXTEND_NONE    => Extend.NONE
      case cairo_extend_t.CAIRO_EXTEND_REPEAT  => Extend.REPEAT
      case cairo_extend_t.CAIRO_EXTEND_REFLECT => Extend.REFLECT
      case cairo_extend_t.CAIRO_EXTEND_PAD     => Extend.PAD
  end fromRaw
end Extend
