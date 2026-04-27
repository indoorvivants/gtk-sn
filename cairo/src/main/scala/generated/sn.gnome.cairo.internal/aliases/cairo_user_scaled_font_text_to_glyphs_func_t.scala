package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_user_scaled_font_text_to_glyphs_func_t: _font: the scaled-font being created : a string of text encoded in UTF-8 _len: length of in bytes : pointer to array of glyphs to fill, in font space : pointer to array of cluster mapping information to fill, or %NULL _flags: pointer to location to store cluster flags corresponding to the output
*/
opaque type cairo_user_scaled_font_text_to_glyphs_func_t = CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
object cairo_user_scaled_font_text_to_glyphs_func_t:
  given _tag: Tag[cairo_user_scaled_font_text_to_glyphs_func_t] = Tag.materializeCFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): cairo_user_scaled_font_text_to_glyphs_func_t = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t]): cairo_user_scaled_font_text_to_glyphs_func_t = o
  extension (v: cairo_user_scaled_font_text_to_glyphs_func_t)
    inline def value: CFuncPtr8[Ptr[cairo_scaled_font_t], CString, CInt, Ptr[Ptr[cairo_glyph_t]], Ptr[CInt], Ptr[Ptr[cairo_text_cluster_t]], Ptr[CInt], Ptr[cairo_text_cluster_flags_t], cairo_status_t] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)