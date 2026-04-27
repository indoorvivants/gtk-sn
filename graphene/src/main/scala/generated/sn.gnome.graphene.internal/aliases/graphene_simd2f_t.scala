package sn.gnome.graphene.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type graphene_simd2f_t = float32x2_t
object graphene_simd2f_t:
  given _tag: Tag[graphene_simd2f_t] = float32x2_t._tag
  inline def apply(inline o: float32x2_t): graphene_simd2f_t = o
  extension (v: graphene_simd2f_t)
    inline def value: float32x2_t = v