package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_position_t:
*/
type hb_position_t = int32_t
object hb_position_t:
  given _tag: Tag[hb_position_t] = int32_t._tag
  inline def apply(inline o: int32_t): hb_position_t = o
  extension (v: hb_position_t)
    inline def value: int32_t = v