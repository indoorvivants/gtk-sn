package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureZoom_listautoptr = Ptr[_root_.sn.gnome.glib.internal.GList]
object GtkGestureZoom_listautoptr:
  given _tag: Tag[GtkGestureZoom_listautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GList](_root_.sn.gnome.glib.internal.GList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GList]): GtkGestureZoom_listautoptr = o
  extension (v: GtkGestureZoom_listautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GList] = v