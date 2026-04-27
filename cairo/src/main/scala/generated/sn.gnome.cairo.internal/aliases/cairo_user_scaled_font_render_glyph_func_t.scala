package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_user_scaled_font_render_glyph_func_t: _font: user scaled-font : glyph code to render : cairo context to draw to, in font space : glyph extents to fill in, in font space
*/
opaque type cairo_user_scaled_font_render_glyph_func_t = CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
object cairo_user_scaled_font_render_glyph_func_t:
  given _tag: Tag[cairo_user_scaled_font_render_glyph_func_t] = Tag.materializeCFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_user_scaled_font_render_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t]): cairo_user_scaled_font_render_glyph_func_t = o
  extension (v: cairo_user_scaled_font_render_glyph_func_t)
    inline def value: CFuncPtr4[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[cairo_t], Ptr[cairo_text_extents_t], cairo_status_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)