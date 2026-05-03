package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_user_scaled_font_unicode_to_glyph_func_t: _font: the scaled-font being created : input unicode character code-point _index: output glyph index
*/
opaque type cairo_user_scaled_font_unicode_to_glyph_func_t = CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
object cairo_user_scaled_font_unicode_to_glyph_func_t:
  given _tag: Tag[cairo_user_scaled_font_unicode_to_glyph_func_t] = Tag.materializeCFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_user_scaled_font_unicode_to_glyph_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t]): cairo_user_scaled_font_unicode_to_glyph_func_t = o
  extension (v: cairo_user_scaled_font_unicode_to_glyph_func_t)
    inline def value: CFuncPtr3[Ptr[cairo_scaled_font_t], CUnsignedLongInt, Ptr[CUnsignedLongInt], cairo_status_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)