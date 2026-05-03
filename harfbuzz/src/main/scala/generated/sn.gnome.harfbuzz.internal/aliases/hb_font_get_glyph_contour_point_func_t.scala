package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_contour_point_func_t: : #hb_font_t to work upon _data: user data pointer : The glyph ID to query _index: The contour-point index to query : (out): The X value retrieved for the contour point : (out): The Y value retrieved for the contour point _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_contour_point_func_t = CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_contour_point_func_t:
  given _tag: Tag[hb_font_get_glyph_contour_point_func_t] = Tag.materializeCFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_get_glyph_contour_point_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_contour_point_func_t = o
  extension (v: hb_font_get_glyph_contour_point_func_t)
    inline def value: CFuncPtr7[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, CUnsignedInt, Ptr[hb_position_t], Ptr[hb_position_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)