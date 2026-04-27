package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type float32x2_t = CStruct2[float32_t, float32_t]
object float32x2_t:
  given _tag: Tag[float32x2_t] = Tag.materializeCStruct2Tag[float32_t, float32_t]
  inline def apply(inline o: CStruct2[float32_t, float32_t]): float32x2_t = o
  extension (v: float32x2_t)
    inline def value: CStruct2[float32_t, float32_t] = v