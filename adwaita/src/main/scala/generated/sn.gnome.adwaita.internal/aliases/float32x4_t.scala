package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/clang/17.0.6/include/arm_neon.h
*/
opaque type float32x4_t = CStruct4[float32_t, float32_t, float32_t, float32_t]
object float32x4_t:
  given _tag: Tag[float32x4_t] = Tag.materializeCStruct4Tag[float32_t, float32_t, float32_t, float32_t]
  inline def apply(inline o: CStruct4[float32_t, float32_t, float32_t, float32_t]): float32x4_t = o
  extension (v: float32x4_t)
    inline def value: CStruct4[float32_t, float32_t, float32_t, float32_t] = v