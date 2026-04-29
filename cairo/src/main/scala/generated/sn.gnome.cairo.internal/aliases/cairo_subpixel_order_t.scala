package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_subpixel_order_t: _SUBPIXEL_ORDER_DEFAULT: Use the default subpixel order for for the target device, since 1.0 _SUBPIXEL_ORDER_RGB: Subpixel elements are arranged horizontally with red at the left, since 1.0 _SUBPIXEL_ORDER_BGR: Subpixel elements are arranged horizontally with blue at the left, since 1.0 _SUBPIXEL_ORDER_VRGB: Subpixel elements are arranged vertically with red at the top, since 1.0 _SUBPIXEL_ORDER_VBGR: Subpixel elements are arranged vertically with blue at the top, since 1.0
*/
type cairo_subpixel_order_t = _cairo_subpixel_order
object cairo_subpixel_order_t:
  given _tag: Tag[cairo_subpixel_order_t] = _cairo_subpixel_order._tag
  inline def apply(inline o: _cairo_subpixel_order): cairo_subpixel_order_t = o
  extension (v: cairo_subpixel_order_t)
    inline def value: _cairo_subpixel_order = v