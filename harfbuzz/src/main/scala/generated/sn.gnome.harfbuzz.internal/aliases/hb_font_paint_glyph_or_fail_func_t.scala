package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+1-0ab16a73-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_paint_glyph_or_fail_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _funcs: The paint functions to use _data: The data accompanying the paint functions _index: The color palette to use : The foreground color _data: User data pointer passed by the caller
*/
opaque type hb_font_paint_glyph_or_fail_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], hb_bool_t]
object hb_font_paint_glyph_or_fail_func_t:
  given _tag: Tag[hb_font_paint_glyph_or_fail_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_paint_glyph_or_fail_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], hb_bool_t]): hb_font_paint_glyph_or_fail_func_t = o
  extension (v: hb_font_paint_glyph_or_fail_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, Ptr[hb_paint_funcs_t], Ptr[Byte], CUnsignedInt, hb_color_t, Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)