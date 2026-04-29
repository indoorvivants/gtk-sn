package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GScanner_listautoptr = Ptr[GList]
object GScanner_listautoptr:
  given _tag: Tag[GScanner_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GScanner_listautoptr = o
  extension (v: GScanner_listautoptr)
    inline def value: Ptr[GList] = v