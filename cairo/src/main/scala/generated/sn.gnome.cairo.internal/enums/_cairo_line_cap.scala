package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_line_cap_t: _LINE_CAP_BUTT: start(stop) the line exactly at the start(end) point (Since 1.0) _LINE_CAP_ROUND: use a round ending, the center of the circle is the end point (Since 1.0) _LINE_CAP_SQUARE: use squared ending, the center of the square is the end point (Since 1.0)
*/
opaque type _cairo_line_cap = CUnsignedInt
object _cairo_line_cap extends _BindgenEnumCUnsignedInt[_cairo_line_cap]:
  given _tag: Tag[_cairo_line_cap] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_cap = a.toUInt
  val CAIRO_LINE_CAP_BUTT = define(0)
  val CAIRO_LINE_CAP_ROUND = define(1)
  val CAIRO_LINE_CAP_SQUARE = define(2)
  def getName(value: _cairo_line_cap): Option[String] =
    value match
      case `CAIRO_LINE_CAP_BUTT` => Some("CAIRO_LINE_CAP_BUTT")
      case `CAIRO_LINE_CAP_ROUND` => Some("CAIRO_LINE_CAP_ROUND")
      case `CAIRO_LINE_CAP_SQUARE` => Some("CAIRO_LINE_CAP_SQUARE")
      case _ => _root_.scala.None
  extension (a: _cairo_line_cap)
    inline def &(b: _cairo_line_cap): _cairo_line_cap = a & b
    inline def |(b: _cairo_line_cap): _cairo_line_cap = a | b
    inline def is(b: _cairo_line_cap): Boolean = (a & b) == b