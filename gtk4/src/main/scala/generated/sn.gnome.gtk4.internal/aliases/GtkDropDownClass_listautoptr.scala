package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDropDownClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDropDownClass_listautoptr:
  given _tag: Tag[GtkDropDownClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDropDownClass_listautoptr = o
  extension (v: GtkDropDownClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v