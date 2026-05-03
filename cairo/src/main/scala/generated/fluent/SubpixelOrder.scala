package sn.gnome.cairo.fluent

import _root_.sn.gnome.cairo.internal.cairo_subpixel_order_t

enum SubpixelOrder(val raw: cairo_subpixel_order_t):
  case DEFAULT
      extends SubpixelOrder(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_DEFAULT)
  case RGB
      extends SubpixelOrder(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_RGB)
  case BGR
      extends SubpixelOrder(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_BGR)
  case VRGB
      extends SubpixelOrder(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VRGB)
  case VBGR
      extends SubpixelOrder(cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VBGR)
end SubpixelOrder

object SubpixelOrder:
  def fromRaw(raw: cairo_subpixel_order_t): SubpixelOrder =
    raw match
      case cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_DEFAULT =>
        SubpixelOrder.DEFAULT
      case cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_RGB  => SubpixelOrder.RGB
      case cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_BGR  => SubpixelOrder.BGR
      case cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VRGB =>
        SubpixelOrder.VRGB
      case cairo_subpixel_order_t.CAIRO_SUBPIXEL_ORDER_VBGR =>
        SubpixelOrder.VBGR
  end fromRaw
end SubpixelOrder
