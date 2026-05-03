package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantIter_autoptr = Ptr[GVariantIter]
object GVariantIter_autoptr:
  given _tag: Tag[GVariantIter_autoptr] = Tag.Ptr[GVariantIter](GVariantIter._tag)
  inline def apply(inline o: Ptr[GVariantIter]): GVariantIter_autoptr = o
  extension (v: GVariantIter_autoptr)
    inline def value: Ptr[GVariantIter] = v