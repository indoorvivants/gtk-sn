package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_draw_line_to_func_t: : draw functions object _data: The data accompanying the draw functions in hb_font_draw_glyph()
*/
opaque type hb_draw_line_to_func_t = CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
object hb_draw_line_to_func_t:
  given _tag: Tag[hb_draw_line_to_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_draw_line_to_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit]): hb_draw_line_to_func_t = o
  extension (v: hb_draw_line_to_func_t)
    inline def value: CFuncPtr6[Ptr[hb_draw_funcs_t], Ptr[Byte], Ptr[hb_draw_state_t], Float, Float, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)