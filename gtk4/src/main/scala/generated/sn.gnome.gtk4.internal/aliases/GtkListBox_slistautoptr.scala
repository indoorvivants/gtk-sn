package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListBox_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkListBox_slistautoptr:
  given _tag: Tag[GtkListBox_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkListBox_slistautoptr = o
  extension (v: GtkListBox_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v