package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoAttrList_autoptr = Ptr[PangoAttrList]
object PangoAttrList_autoptr:
  given _tag: Tag[PangoAttrList_autoptr] = Tag.Ptr[PangoAttrList](PangoAttrList._tag)
  inline def apply(inline o: Ptr[PangoAttrList]): PangoAttrList_autoptr = o
  extension (v: PangoAttrList_autoptr)
    inline def value: Ptr[PangoAttrList] = v