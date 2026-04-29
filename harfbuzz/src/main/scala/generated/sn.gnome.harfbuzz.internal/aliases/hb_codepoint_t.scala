package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_codepoint_t:
*/
type hb_codepoint_t = uint32_t
object hb_codepoint_t:
  given _tag: Tag[hb_codepoint_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_codepoint_t = o
  extension (v: hb_codepoint_t)
    inline def value: uint32_t = v