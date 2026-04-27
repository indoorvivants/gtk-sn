package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_extend_t: _EXTEND_NONE: pixels outside of the source pattern are fully transparent (Since 1.0) _EXTEND_REPEAT: the pattern is tiled by repeating (Since 1.0) _EXTEND_REFLECT: the pattern is tiled by reflecting at the edges (Since 1.0; but only implemented for surface patterns since 1.6) _EXTEND_PAD: pixels outside of the pattern copy the closest pixel from the source (Since 1.2; but only implemented for surface patterns since 1.6)
*/
opaque type _cairo_extend = CUnsignedInt
object _cairo_extend extends _BindgenEnumCUnsignedInt[_cairo_extend]:
  given _tag: Tag[_cairo_extend] = Tag.UInt
  inline def define(inline a: Long): _cairo_extend = a.toUInt
  val CAIRO_EXTEND_NONE = define(0)
  val CAIRO_EXTEND_REPEAT = define(1)
  val CAIRO_EXTEND_REFLECT = define(2)
  val CAIRO_EXTEND_PAD = define(3)
  def getName(value: _cairo_extend): Option[String] =
    value match
      case `CAIRO_EXTEND_NONE` => Some("CAIRO_EXTEND_NONE")
      case `CAIRO_EXTEND_REPEAT` => Some("CAIRO_EXTEND_REPEAT")
      case `CAIRO_EXTEND_REFLECT` => Some("CAIRO_EXTEND_REFLECT")
      case `CAIRO_EXTEND_PAD` => Some("CAIRO_EXTEND_PAD")
      case _ => _root_.scala.None
  extension (a: _cairo_extend)
    inline def &(b: _cairo_extend): _cairo_extend = a & b
    inline def |(b: _cairo_extend): _cairo_extend = a | b
    inline def is(b: _cairo_extend): Boolean = (a & b) == b