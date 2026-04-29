package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateTime_slistautoptr = Ptr[GSList]
object GDateTime_slistautoptr:
  given _tag: Tag[GDateTime_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GDateTime_slistautoptr = o
  extension (v: GDateTime_slistautoptr)
    inline def value: Ptr[GSList] = v