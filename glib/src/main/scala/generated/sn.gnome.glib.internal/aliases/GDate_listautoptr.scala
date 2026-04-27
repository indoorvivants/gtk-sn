package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDate_listautoptr = Ptr[GList]
object GDate_listautoptr:
  given _tag: Tag[GDate_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GDate_listautoptr = o
  extension (v: GDate_listautoptr)
    inline def value: Ptr[GList] = v