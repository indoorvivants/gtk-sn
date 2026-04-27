package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_advances_func_t: : #hb_font_t to work upon _data: user data pointer : The number of glyph IDs in the sequence queried _glyph: The first glyph ID to query _stride: The stride between successive glyph IDs _advance: (out): The first advance retrieved _stride: The stride between successive advances _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_advances_func_t = CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
object hb_font_get_glyph_advances_func_t:
  given _tag: Tag[hb_font_get_glyph_advances_func_t] = Tag.materializeCFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_get_glyph_advances_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit]): hb_font_get_glyph_advances_func_t = o
  extension (v: hb_font_get_glyph_advances_func_t)
    inline def value: CFuncPtr8[Ptr[hb_font_t], Ptr[Byte], CUnsignedInt, Ptr[hb_codepoint_t], CUnsignedInt, Ptr[hb_position_t], CUnsignedInt, Ptr[Byte], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)