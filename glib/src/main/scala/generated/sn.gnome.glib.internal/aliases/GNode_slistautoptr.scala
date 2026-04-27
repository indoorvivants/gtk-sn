package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNode_slistautoptr = Ptr[GSList]
object GNode_slistautoptr:
  given _tag: Tag[GNode_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GNode_slistautoptr = o
  extension (v: GNode_slistautoptr)
    inline def value: Ptr[GSList] = v