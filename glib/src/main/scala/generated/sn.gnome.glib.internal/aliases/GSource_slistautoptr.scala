package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSource_slistautoptr = Ptr[GSList]
object GSource_slistautoptr:
  given _tag: Tag[GSource_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GSource_slistautoptr = o
  extension (v: GSource_slistautoptr)
    inline def value: Ptr[GSList] = v