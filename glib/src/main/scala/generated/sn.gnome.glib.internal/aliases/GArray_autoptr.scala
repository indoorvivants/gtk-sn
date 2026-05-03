package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GArray_autoptr = Ptr[GArray]
object GArray_autoptr:
  given _tag: Tag[GArray_autoptr] = Tag.Ptr[GArray](GArray._tag)
  inline def apply(inline o: Ptr[GArray]): GArray_autoptr = o
  extension (v: GArray_autoptr)
    inline def value: Ptr[GArray] = v