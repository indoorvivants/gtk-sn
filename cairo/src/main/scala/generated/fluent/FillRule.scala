package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_fill_rule_t

enum FillRule(val raw: cairo_fill_rule_t):
  case WINDING extends FillRule(cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING)
  case EVEN_ODD extends FillRule(cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD)
end FillRule

object FillRule:
  def fromRaw(raw: cairo_fill_rule_t): FillRule =
    raw match
      case cairo_fill_rule_t.CAIRO_FILL_RULE_WINDING  => FillRule.WINDING
      case cairo_fill_rule_t.CAIRO_FILL_RULE_EVEN_ODD => FillRule.EVEN_ODD
  end fromRaw
end FillRule
