package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUri_slistautoptr = Ptr[GSList]
object GUri_slistautoptr:
  given _tag: Tag[GUri_slistautoptr] = Tag.Ptr[GSList](GSList._tag)
  inline def apply(inline o: Ptr[GSList]): GUri_slistautoptr = o
  extension (v: GUri_slistautoptr)
    inline def value: Ptr[GSList] = v