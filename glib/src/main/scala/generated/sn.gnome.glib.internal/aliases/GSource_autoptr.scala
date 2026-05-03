package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSource_autoptr = Ptr[GSource]
object GSource_autoptr:
  given _tag: Tag[GSource_autoptr] = Tag.Ptr[GSource](GSource._tag)
  inline def apply(inline o: Ptr[GSource]): GSource_autoptr = o
  extension (v: GSource_autoptr)
    inline def value: Ptr[GSource] = v