package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_paint_linear_gradient_func_t: : paint functions object _data: The data accompanying the paint functions in hb_font_paint_glyph() _line: Color information for the gradient : X coordinate of the first point : Y coordinate of the first point : X coordinate of the second point : Y coordinate of the second point : X coordinate of the third point : Y coordinate of the third point _data: User data pointer passed to hb_paint_funcs_set_linear_gradient_func()
*/
opaque type hb_paint_linear_gradient_func_t = CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
object hb_paint_linear_gradient_func_t:
  given _tag: Tag[hb_paint_linear_gradient_func_t] = Tag.materializeCFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_paint_linear_gradient_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit]): hb_paint_linear_gradient_func_t = o
  extension (v: hb_paint_linear_gradient_func_t)
    inline def value: CFuncPtr10[Ptr[hb_paint_funcs_t], Ptr[Byte], Ptr[hb_color_line_t], Float, Float, Float, Float, Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)