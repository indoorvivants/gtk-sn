package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureDrag_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkGestureDrag_slistautoptr:
  given _tag: Tag[GtkGestureDrag_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkGestureDrag_slistautoptr = o
  extension (v: GtkGestureDrag_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v