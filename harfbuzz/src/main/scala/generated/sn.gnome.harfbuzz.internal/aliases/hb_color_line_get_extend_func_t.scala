package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_color_line_get_extend_func_t: _line: a #hb_color_line_t object _line_data: the data accompanying _line _data: the data accompanying this method
*/
opaque type hb_color_line_get_extend_func_t = CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]
object hb_color_line_get_extend_func_t:
  given _tag: Tag[hb_color_line_get_extend_func_t] = Tag.materializeCFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_color_line_get_extend_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t]): hb_color_line_get_extend_func_t = o
  extension (v: hb_color_line_get_extend_func_t)
    inline def value: CFuncPtr3[Ptr[hb_color_line_t], Ptr[Byte], Ptr[Byte], hb_paint_extend_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)