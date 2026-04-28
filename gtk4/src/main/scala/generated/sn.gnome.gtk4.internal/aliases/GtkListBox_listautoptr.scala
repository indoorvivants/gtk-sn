package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListBox_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkListBox_listautoptr:
  given _tag: Tag[GtkListBox_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkListBox_listautoptr = o
  extension (v: GtkListBox_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v