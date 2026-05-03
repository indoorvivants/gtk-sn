package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoAttrList_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoAttrList_listautoptr:
  given _tag: Tag[PangoAttrList_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoAttrList_listautoptr = o
  extension (v: PangoAttrList_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v