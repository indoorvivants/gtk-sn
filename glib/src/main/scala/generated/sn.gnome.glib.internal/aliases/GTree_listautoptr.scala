package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTree_listautoptr = Ptr[GList]
object GTree_listautoptr:
  given _tag: Tag[GTree_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GTree_listautoptr = o
  extension (v: GTree_listautoptr)
    inline def value: Ptr[GList] = v