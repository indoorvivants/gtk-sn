package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_antialias_t: _ANTIALIAS_DEFAULT: Use the default antialiasing for the subsystem and target device, since 1.0 _ANTIALIAS_NONE: Use a bilevel alpha mask, since 1.0 _ANTIALIAS_GRAY: Perform single-color antialiasing (using shades of gray for black text on a white background, for example), since 1.0 _ANTIALIAS_SUBPIXEL: Perform antialiasing by taking advantage of the order of subpixel elements on devices such as LCD panels, since 1.0 _ANTIALIAS_FAST: Hint that the backend should perform some antialiasing but prefer speed over quality, since 1.12 _ANTIALIAS_GOOD: The backend should balance quality against performance, since 1.12 _ANTIALIAS_BEST: Hint that the backend should render at the highest quality, sacrificing speed if necessary, since 1.12
*/
opaque type _cairo_antialias = CUnsignedInt
object _cairo_antialias extends _BindgenEnumCUnsignedInt[_cairo_antialias]:
  given _tag: Tag[_cairo_antialias] = Tag.UInt
  inline def define(inline a: Long): _cairo_antialias = a.toUInt
  val CAIRO_ANTIALIAS_DEFAULT = define(0)
  val CAIRO_ANTIALIAS_NONE = define(1)
  val CAIRO_ANTIALIAS_GRAY = define(2)
  val CAIRO_ANTIALIAS_SUBPIXEL = define(3)
  val CAIRO_ANTIALIAS_FAST = define(4)
  val CAIRO_ANTIALIAS_GOOD = define(5)
  val CAIRO_ANTIALIAS_BEST = define(6)
  def getName(value: _cairo_antialias): Option[String] =
    value match
      case `CAIRO_ANTIALIAS_DEFAULT` => Some("CAIRO_ANTIALIAS_DEFAULT")
      case `CAIRO_ANTIALIAS_NONE` => Some("CAIRO_ANTIALIAS_NONE")
      case `CAIRO_ANTIALIAS_GRAY` => Some("CAIRO_ANTIALIAS_GRAY")
      case `CAIRO_ANTIALIAS_SUBPIXEL` => Some("CAIRO_ANTIALIAS_SUBPIXEL")
      case `CAIRO_ANTIALIAS_FAST` => Some("CAIRO_ANTIALIAS_FAST")
      case `CAIRO_ANTIALIAS_GOOD` => Some("CAIRO_ANTIALIAS_GOOD")
      case `CAIRO_ANTIALIAS_BEST` => Some("CAIRO_ANTIALIAS_BEST")
      case _ => _root_.scala.None
  extension (a: _cairo_antialias)
    inline def &(b: _cairo_antialias): _cairo_antialias = a & b
    inline def |(b: _cairo_antialias): _cairo_antialias = a | b
    inline def is(b: _cairo_antialias): Boolean = (a & b) == b