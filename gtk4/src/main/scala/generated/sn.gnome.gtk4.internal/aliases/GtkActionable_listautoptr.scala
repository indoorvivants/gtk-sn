package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActionable_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkActionable_listautoptr:
  given _tag: Tag[GtkActionable_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkActionable_listautoptr = o
  extension (v: GtkActionable_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v