package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GVariantIter_listautoptr = Ptr[GList]
object GVariantIter_listautoptr:
  given _tag: Tag[GVariantIter_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GVariantIter_listautoptr = o
  extension (v: GVariantIter_listautoptr)
    inline def value: Ptr[GList] = v