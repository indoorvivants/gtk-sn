package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListItemClass_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListItemClass_listautoptr:
  given _tag: Tag[GtkListItemClass_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListItemClass_listautoptr = o
  extension (v: GtkListItemClass_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v