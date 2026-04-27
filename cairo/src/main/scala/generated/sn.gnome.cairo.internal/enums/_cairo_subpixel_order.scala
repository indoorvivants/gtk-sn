package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_subpixel_order_t: _SUBPIXEL_ORDER_DEFAULT: Use the default subpixel order for for the target device, since 1.0 _SUBPIXEL_ORDER_RGB: Subpixel elements are arranged horizontally with red at the left, since 1.0 _SUBPIXEL_ORDER_BGR: Subpixel elements are arranged horizontally with blue at the left, since 1.0 _SUBPIXEL_ORDER_VRGB: Subpixel elements are arranged vertically with red at the top, since 1.0 _SUBPIXEL_ORDER_VBGR: Subpixel elements are arranged vertically with blue at the top, since 1.0
*/
opaque type _cairo_subpixel_order = CUnsignedInt
object _cairo_subpixel_order extends _BindgenEnumCUnsignedInt[_cairo_subpixel_order]:
  given _tag: Tag[_cairo_subpixel_order] = Tag.UInt
  inline def define(inline a: Long): _cairo_subpixel_order = a.toUInt
  val CAIRO_SUBPIXEL_ORDER_DEFAULT = define(0)
  val CAIRO_SUBPIXEL_ORDER_RGB = define(1)
  val CAIRO_SUBPIXEL_ORDER_BGR = define(2)
  val CAIRO_SUBPIXEL_ORDER_VRGB = define(3)
  val CAIRO_SUBPIXEL_ORDER_VBGR = define(4)
  def getName(value: _cairo_subpixel_order): Option[String] =
    value match
      case `CAIRO_SUBPIXEL_ORDER_DEFAULT` => Some("CAIRO_SUBPIXEL_ORDER_DEFAULT")
      case `CAIRO_SUBPIXEL_ORDER_RGB` => Some("CAIRO_SUBPIXEL_ORDER_RGB")
      case `CAIRO_SUBPIXEL_ORDER_BGR` => Some("CAIRO_SUBPIXEL_ORDER_BGR")
      case `CAIRO_SUBPIXEL_ORDER_VRGB` => Some("CAIRO_SUBPIXEL_ORDER_VRGB")
      case `CAIRO_SUBPIXEL_ORDER_VBGR` => Some("CAIRO_SUBPIXEL_ORDER_VBGR")
      case _ => _root_.scala.None
  extension (a: _cairo_subpixel_order)
    inline def &(b: _cairo_subpixel_order): _cairo_subpixel_order = a & b
    inline def |(b: _cairo_subpixel_order): _cairo_subpixel_order = a | b
    inline def is(b: _cairo_subpixel_order): Boolean = (a & b) == b