package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_hint_style_t: _HINT_STYLE_DEFAULT: Use the default hint style for font backend and target device, since 1.0 _HINT_STYLE_NONE: Do not hint outlines, since 1.0 _HINT_STYLE_SLIGHT: Hint outlines slightly to improve contrast while retaining good fidelity to the original shapes, since 1.0 _HINT_STYLE_MEDIUM: Hint outlines with medium strength giving a compromise between fidelity to the original shapes and contrast, since 1.0 _HINT_STYLE_FULL: Hint outlines to maximize contrast, since 1.0
*/
opaque type _cairo_hint_style = CUnsignedInt
object _cairo_hint_style extends _BindgenEnumCUnsignedInt[_cairo_hint_style]:
  given _tag: Tag[_cairo_hint_style] = Tag.UInt
  inline def define(inline a: Long): _cairo_hint_style = a.toUInt
  val CAIRO_HINT_STYLE_DEFAULT = define(0)
  val CAIRO_HINT_STYLE_NONE = define(1)
  val CAIRO_HINT_STYLE_SLIGHT = define(2)
  val CAIRO_HINT_STYLE_MEDIUM = define(3)
  val CAIRO_HINT_STYLE_FULL = define(4)
  def getName(value: _cairo_hint_style): Option[String] =
    value match
      case `CAIRO_HINT_STYLE_DEFAULT` => Some("CAIRO_HINT_STYLE_DEFAULT")
      case `CAIRO_HINT_STYLE_NONE` => Some("CAIRO_HINT_STYLE_NONE")
      case `CAIRO_HINT_STYLE_SLIGHT` => Some("CAIRO_HINT_STYLE_SLIGHT")
      case `CAIRO_HINT_STYLE_MEDIUM` => Some("CAIRO_HINT_STYLE_MEDIUM")
      case `CAIRO_HINT_STYLE_FULL` => Some("CAIRO_HINT_STYLE_FULL")
      case _ => _root_.scala.None
  extension (a: _cairo_hint_style)
    inline def &(b: _cairo_hint_style): _cairo_hint_style = a & b
    inline def |(b: _cairo_hint_style): _cairo_hint_style = a | b
    inline def is(b: _cairo_hint_style): Boolean = (a & b) == b