package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDrawingArea_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkDrawingArea_listautoptr:
  given _tag: Tag[GtkDrawingArea_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkDrawingArea_listautoptr = o
  extension (v: GtkDrawingArea_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v