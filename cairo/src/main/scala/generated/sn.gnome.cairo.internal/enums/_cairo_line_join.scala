package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_line_join_t: _LINE_JOIN_MITER: use a sharp (angled) corner, see cairo_set_miter_limit() (Since 1.0) _LINE_JOIN_ROUND: use a rounded join, the center of the circle is the joint point (Since 1.0) _LINE_JOIN_BEVEL: use a cut-off join, the join is cut off at half the line width from the joint point (Since 1.0)
*/
opaque type _cairo_line_join = CUnsignedInt
object _cairo_line_join extends _BindgenEnumCUnsignedInt[_cairo_line_join]:
  given _tag: Tag[_cairo_line_join] = Tag.UInt
  inline def define(inline a: Long): _cairo_line_join = a.toUInt
  val CAIRO_LINE_JOIN_MITER = define(0)
  val CAIRO_LINE_JOIN_ROUND = define(1)
  val CAIRO_LINE_JOIN_BEVEL = define(2)
  def getName(value: _cairo_line_join): Option[String] =
    value match
      case `CAIRO_LINE_JOIN_MITER` => Some("CAIRO_LINE_JOIN_MITER")
      case `CAIRO_LINE_JOIN_ROUND` => Some("CAIRO_LINE_JOIN_ROUND")
      case `CAIRO_LINE_JOIN_BEVEL` => Some("CAIRO_LINE_JOIN_BEVEL")
      case _ => _root_.scala.None
  extension (a: _cairo_line_join)
    inline def &(b: _cairo_line_join): _cairo_line_join = a & b
    inline def |(b: _cairo_line_join): _cairo_line_join = a | b
    inline def is(b: _cairo_line_join): Boolean = (a & b) == b