package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFilterInputStream_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GFilterInputStream_listautoptr:
  given _tag: Tag[GFilterInputStream_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GFilterInputStream_listautoptr = o
  extension (v: GFilterInputStream_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v