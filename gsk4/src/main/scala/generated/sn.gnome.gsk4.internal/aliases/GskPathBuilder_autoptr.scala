package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GskPathBuilder_autoptr = Ptr[GskPathBuilder]
object GskPathBuilder_autoptr:
  given _tag: Tag[GskPathBuilder_autoptr] = Tag.Ptr[GskPathBuilder](GskPathBuilder._tag)
  inline def apply(inline o: Ptr[GskPathBuilder]): GskPathBuilder_autoptr = o
  extension (v: GskPathBuilder_autoptr)
    inline def value: Ptr[GskPathBuilder] = v