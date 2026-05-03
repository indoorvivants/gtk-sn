package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_dither_t: _DITHER_NONE: No dithering. _DITHER_DEFAULT: Default choice at cairo compile time. Currently NONE. _DITHER_FAST: Fastest dithering algorithm supported by the backend _DITHER_GOOD: An algorithm with smoother dithering than FAST _DITHER_BEST: Best algorithm available in the backend
*/
opaque type _cairo_dither = CUnsignedInt
object _cairo_dither extends _BindgenEnumCUnsignedInt[_cairo_dither]:
  given _tag: Tag[_cairo_dither] = Tag.UInt
  inline def define(inline a: Long): _cairo_dither = a.toUInt
  val CAIRO_DITHER_NONE = define(0)
  val CAIRO_DITHER_DEFAULT = define(1)
  val CAIRO_DITHER_FAST = define(2)
  val CAIRO_DITHER_GOOD = define(3)
  val CAIRO_DITHER_BEST = define(4)
  def getName(value: _cairo_dither): Option[String] =
    value match
      case `CAIRO_DITHER_NONE` => Some("CAIRO_DITHER_NONE")
      case `CAIRO_DITHER_DEFAULT` => Some("CAIRO_DITHER_DEFAULT")
      case `CAIRO_DITHER_FAST` => Some("CAIRO_DITHER_FAST")
      case `CAIRO_DITHER_GOOD` => Some("CAIRO_DITHER_GOOD")
      case `CAIRO_DITHER_BEST` => Some("CAIRO_DITHER_BEST")
      case _ => _root_.scala.None
  extension (a: _cairo_dither)
    inline def &(b: _cairo_dither): _cairo_dither = a & b
    inline def |(b: _cairo_dither): _cairo_dither = a | b
    inline def is(b: _cairo_dither): Boolean = (a & b) == b