package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GKeyFile_listautoptr = Ptr[GList]
object GKeyFile_listautoptr:
  given _tag: Tag[GKeyFile_listautoptr] = Tag.Ptr[GList](GList._tag)
  inline def apply(inline o: Ptr[GList]): GKeyFile_listautoptr = o
  extension (v: GKeyFile_listautoptr)
    inline def value: Ptr[GList] = v