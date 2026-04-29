package sn.gnome.harfbuzz.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * hb_bool_t:
*/
opaque type hb_bool_t = CInt
object hb_bool_t:
  given _tag: Tag[hb_bool_t] = Tag.Int
  inline def apply(inline o: CInt): hb_bool_t = o
  extension (v: hb_bool_t)
    inline def value: CInt = v