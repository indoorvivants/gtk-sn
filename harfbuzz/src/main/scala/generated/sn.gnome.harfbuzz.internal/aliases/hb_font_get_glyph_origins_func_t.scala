package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+1-0ab16a73-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_origins_func_t: : #hb_font_t to work upon _data: user data pointer _glyph: The first glyph ID to query : number of glyphs to query _stride: The stride between successive glyph IDs _x: (out): The first origin X coordinate retrieved _stride: The stride between successive origin X coordinates _y: (out): The first origin Y coordinate retrieved _stride: The stride between successive origin Y coordinates _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_origins_func_t = CFuncPtr10[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_origins_func_t:
  given _tag: Tag[hb_font_get_glyph_origins_func_t] = Tag.materializeCFuncPtr10[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_get_glyph_origins_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr10[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], hb_bool_t]): hb_font_get_glyph_origins_func_t = o
  extension (v: hb_font_get_glyph_origins_func_t)
    inline def value: CFuncPtr10[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)