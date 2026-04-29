package sn.gnome.cairo.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * cairo_bool_t:
*/
opaque type cairo_bool_t = CInt
object cairo_bool_t:
  given _tag: Tag[cairo_bool_t] = Tag.Int
  inline def apply(inline o: CInt): cairo_bool_t = o
  extension (v: cairo_bool_t)
    inline def value: CInt = v