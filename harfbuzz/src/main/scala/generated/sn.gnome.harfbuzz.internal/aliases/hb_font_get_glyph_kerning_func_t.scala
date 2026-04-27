package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_kerning_func_t: : #hb_font_t to work upon _data: user data pointer _glyph: The glyph ID of the first glyph in the glyph pair _glyph: The glyph ID of the second glyph in the glyph pair _data: User data pointer passed by the caller
*/
opaque type hb_font_get_glyph_kerning_func_t = CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
object hb_font_get_glyph_kerning_func_t:
  given _tag: Tag[hb_font_get_glyph_kerning_func_t] = Tag.materializeCFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): hb_font_get_glyph_kerning_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t]): hb_font_get_glyph_kerning_func_t = o
  extension (v: hb_font_get_glyph_kerning_func_t)
    inline def value: CFuncPtr5[Ptr[hb_font_t], Ptr[Byte], hb_codepoint_t, hb_codepoint_t, Ptr[Byte], hb_position_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)