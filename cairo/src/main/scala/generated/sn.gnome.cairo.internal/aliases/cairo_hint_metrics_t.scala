package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_hint_metrics_t: _HINT_METRICS_DEFAULT: Hint metrics in the default manner for the font backend and target device, since 1.0 _HINT_METRICS_OFF: Do not hint font metrics, since 1.0 _HINT_METRICS_ON: Hint font metrics, since 1.0
*/
type cairo_hint_metrics_t = _cairo_hint_metrics
object cairo_hint_metrics_t:
  given _tag: Tag[cairo_hint_metrics_t] = _cairo_hint_metrics._tag
  inline def apply(inline o: _cairo_hint_metrics): cairo_hint_metrics_t = o
  extension (v: cairo_hint_metrics_t)
    inline def value: _cairo_hint_metrics = v