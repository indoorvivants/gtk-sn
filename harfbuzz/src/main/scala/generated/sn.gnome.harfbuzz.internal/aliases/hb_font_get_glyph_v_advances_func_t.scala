package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_font_get_glyph_v_advances_func_t:
*/
type hb_font_get_glyph_v_advances_func_t = hb_font_get_glyph_advances_func_t
object hb_font_get_glyph_v_advances_func_t:
  given _tag: Tag[hb_font_get_glyph_v_advances_func_t] = hb_font_get_glyph_advances_func_t._tag
  inline def apply(inline o: hb_font_get_glyph_advances_func_t): hb_font_get_glyph_v_advances_func_t = o
  extension (v: hb_font_get_glyph_v_advances_func_t)
    inline def value: hb_font_get_glyph_advances_func_t = v