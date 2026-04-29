package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GAsyncQueue_slistautoptr = Ptr[GSList]
object GAsyncQueue_slistautoptr:
  given _tag: Tag[GAsyncQueue_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GAsyncQueue_slistautoptr = o
  extension (v: GAsyncQueue_slistautoptr)
    inline def value: Ptr[GSList] = v