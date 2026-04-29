package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_content_t: _CONTENT_COLOR: The surface will hold color content only. (Since 1.0) _CONTENT_ALPHA: The surface will hold alpha content only. (Since 1.0) _CONTENT_COLOR_ALPHA: The surface will hold color and alpha content. (Since 1.0)
*/
opaque type _cairo_content = CUnsignedInt
object _cairo_content extends _BindgenEnumCUnsignedInt[_cairo_content]:
  given _tag: Tag[_cairo_content] = Tag.UInt
  inline def define(inline a: Long): _cairo_content = a.toUInt
  val CAIRO_CONTENT_COLOR = define(4096)
  val CAIRO_CONTENT_ALPHA = define(8192)
  val CAIRO_CONTENT_COLOR_ALPHA = define(12288)
  def getName(value: _cairo_content): Option[String] =
    value match
      case `CAIRO_CONTENT_COLOR` => Some("CAIRO_CONTENT_COLOR")
      case `CAIRO_CONTENT_ALPHA` => Some("CAIRO_CONTENT_ALPHA")
      case `CAIRO_CONTENT_COLOR_ALPHA` => Some("CAIRO_CONTENT_COLOR_ALPHA")
      case _ => _root_.scala.None
  extension (a: _cairo_content)
    inline def &(b: _cairo_content): _cairo_content = a & b
    inline def |(b: _cairo_content): _cairo_content = a | b
    inline def is(b: _cairo_content): Boolean = (a & b) == b