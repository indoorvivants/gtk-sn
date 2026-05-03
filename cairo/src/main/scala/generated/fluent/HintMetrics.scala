package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_hint_metrics_t

enum HintMetrics(val raw: cairo_hint_metrics_t):
  case DEFAULT
      extends HintMetrics(cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT)
  case OFF extends HintMetrics(cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF)
  case ON extends HintMetrics(cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON)
end HintMetrics

object HintMetrics:
  def fromRaw(raw: cairo_hint_metrics_t): HintMetrics =
    raw match
      case cairo_hint_metrics_t.CAIRO_HINT_METRICS_DEFAULT =>
        HintMetrics.DEFAULT
      case cairo_hint_metrics_t.CAIRO_HINT_METRICS_OFF => HintMetrics.OFF
      case cairo_hint_metrics_t.CAIRO_HINT_METRICS_ON  => HintMetrics.ON
  end fromRaw
end HintMetrics
