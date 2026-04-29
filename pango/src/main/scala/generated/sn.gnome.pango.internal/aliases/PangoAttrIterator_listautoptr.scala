package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type PangoAttrIterator_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object PangoAttrIterator_listautoptr:
  given _tag: Tag[PangoAttrIterator_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): PangoAttrIterator_listautoptr = o
  extension (v: PangoAttrIterator_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v