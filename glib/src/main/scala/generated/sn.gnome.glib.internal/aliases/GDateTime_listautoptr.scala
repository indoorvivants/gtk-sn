package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDateTime_listautoptr = Ptr[GList]
object GDateTime_listautoptr:
  given _tag: Tag[GDateTime_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDateTime_listautoptr = o
  extension (v: GDateTime_listautoptr)
    inline def value: Ptr[GList] = v