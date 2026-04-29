package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_filter_t: _FILTER_FAST: A high-performance filter, with quality similar to %CAIRO_FILTER_NEAREST (Since 1.0) _FILTER_GOOD: A reasonable-performance filter, with quality similar to %CAIRO_FILTER_BILINEAR (Since 1.0) _FILTER_BEST: The highest-quality available, performance may not be suitable for interactive use. (Since 1.0) _FILTER_NEAREST: Nearest-neighbor filtering (Since 1.0) _FILTER_BILINEAR: Linear interpolation in two dimensions (Since 1.0) _FILTER_GAUSSIAN: This filter value is currently unimplemented, and should not be used in current code. (Since 1.0)
*/
opaque type _cairo_filter = CUnsignedInt
object _cairo_filter extends _BindgenEnumCUnsignedInt[_cairo_filter]:
  given _tag: Tag[_cairo_filter] = Tag.UInt
  inline def define(inline a: Long): _cairo_filter = a.toUInt
  val CAIRO_FILTER_FAST = define(0)
  val CAIRO_FILTER_GOOD = define(1)
  val CAIRO_FILTER_BEST = define(2)
  val CAIRO_FILTER_NEAREST = define(3)
  val CAIRO_FILTER_BILINEAR = define(4)
  val CAIRO_FILTER_GAUSSIAN = define(5)
  def getName(value: _cairo_filter): Option[String] =
    value match
      case `CAIRO_FILTER_FAST` => Some("CAIRO_FILTER_FAST")
      case `CAIRO_FILTER_GOOD` => Some("CAIRO_FILTER_GOOD")
      case `CAIRO_FILTER_BEST` => Some("CAIRO_FILTER_BEST")
      case `CAIRO_FILTER_NEAREST` => Some("CAIRO_FILTER_NEAREST")
      case `CAIRO_FILTER_BILINEAR` => Some("CAIRO_FILTER_BILINEAR")
      case `CAIRO_FILTER_GAUSSIAN` => Some("CAIRO_FILTER_GAUSSIAN")
      case _ => _root_.scala.None
  extension (a: _cairo_filter)
    inline def &(b: _cairo_filter): _cairo_filter = a & b
    inline def |(b: _cairo_filter): _cairo_filter = a | b
    inline def is(b: _cairo_filter): Boolean = (a & b) == b