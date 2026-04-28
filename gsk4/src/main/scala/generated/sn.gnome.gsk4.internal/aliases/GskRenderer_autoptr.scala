package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskRenderer_autoptr = Ptr[GskRenderer]
object GskRenderer_autoptr:
  given _tag: Tag[GskRenderer_autoptr] = Tag.Ptr[GskRenderer](GskRenderer._tag)
  inline def apply(inline o: Ptr[GskRenderer]): GskRenderer_autoptr = o
  extension (v: GskRenderer_autoptr)
    inline def value: Ptr[GskRenderer] = v