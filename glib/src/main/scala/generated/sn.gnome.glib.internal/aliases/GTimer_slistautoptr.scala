package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTimer_slistautoptr = Ptr[GSList]
object GTimer_slistautoptr:
  given _tag: Tag[GTimer_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GTimer_slistautoptr = o
  extension (v: GTimer_slistautoptr)
    inline def value: Ptr[GSList] = v