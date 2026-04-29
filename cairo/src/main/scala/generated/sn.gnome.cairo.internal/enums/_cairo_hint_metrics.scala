package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_hint_metrics_t: _HINT_METRICS_DEFAULT: Hint metrics in the default manner for the font backend and target device, since 1.0 _HINT_METRICS_OFF: Do not hint font metrics, since 1.0 _HINT_METRICS_ON: Hint font metrics, since 1.0
*/
opaque type _cairo_hint_metrics = CUnsignedInt
object _cairo_hint_metrics extends _BindgenEnumCUnsignedInt[_cairo_hint_metrics]:
  given _tag: Tag[_cairo_hint_metrics] = Tag.UInt
  inline def define(inline a: Long): _cairo_hint_metrics = a.toUInt
  val CAIRO_HINT_METRICS_DEFAULT = define(0)
  val CAIRO_HINT_METRICS_OFF = define(1)
  val CAIRO_HINT_METRICS_ON = define(2)
  def getName(value: _cairo_hint_metrics): Option[String] =
    value match
      case `CAIRO_HINT_METRICS_DEFAULT` => Some("CAIRO_HINT_METRICS_DEFAULT")
      case `CAIRO_HINT_METRICS_OFF` => Some("CAIRO_HINT_METRICS_OFF")
      case `CAIRO_HINT_METRICS_ON` => Some("CAIRO_HINT_METRICS_ON")
      case _ => _root_.scala.None
  extension (a: _cairo_hint_metrics)
    inline def &(b: _cairo_hint_metrics): _cairo_hint_metrics = a & b
    inline def |(b: _cairo_hint_metrics): _cairo_hint_metrics = a | b
    inline def is(b: _cairo_hint_metrics): Boolean = (a & b) == b