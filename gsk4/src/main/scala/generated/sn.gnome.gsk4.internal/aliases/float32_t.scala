package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type float32_t = Float
object float32_t:
  given _tag: Tag[float32_t] = Tag.Float
  inline def apply(inline o: Float): float32_t = o
  extension (v: float32_t)
    inline def value: Float = v