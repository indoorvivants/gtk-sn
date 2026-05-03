package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_from_name_func_t: : #hb_font_t to work upon _data: user data pointer : The length of the name queried : (out): The glyph ID retrieved _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_from_name_func_t = CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
object hb_font_get_glyph_from_name_func_t:
  given _tag: Tag[hb_font_get_glyph_from_name_func_t] = Tag.materializeCFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_get_glyph_from_name_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t]): hb_font_get_glyph_from_name_func_t = o
  extension (v: hb_font_get_glyph_from_name_func_t)
    inline def value: CFuncPtr6[Ptr[hb_font_t], Ptr[Byte], CString, CInt, Ptr[hb_codepoint_t], Ptr[Byte], hb_bool_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)