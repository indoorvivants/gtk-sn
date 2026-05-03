package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GRand_slistautoptr = Ptr[GSList]
object GRand_slistautoptr:
  given _tag: Tag[GRand_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GRand_slistautoptr = o
  extension (v: GRand_slistautoptr)
    inline def value: Ptr[GSList] = v