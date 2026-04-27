package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_tag_t:
*/
type hb_tag_t = uint32_t
object hb_tag_t:
  given _tag: Tag[hb_tag_t] = uint32_t._tag
  inline def apply(inline o: uint32_t): hb_tag_t = o
  extension (v: hb_tag_t)
    inline def value: uint32_t = v