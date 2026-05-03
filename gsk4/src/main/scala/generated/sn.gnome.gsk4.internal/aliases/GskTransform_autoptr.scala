package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskTransform_autoptr = Ptr[GskTransform]
object GskTransform_autoptr:
  given _tag: Tag[GskTransform_autoptr] = Tag.Ptr[GskTransform](GskTransform._tag)
  inline def apply(inline o: Ptr[GskTransform]): GskTransform_autoptr = o
  extension (v: GskTransform_autoptr)
    inline def value: Ptr[GskTransform] = v