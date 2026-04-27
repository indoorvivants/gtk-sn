package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMountOperation_slistautoptr = Ptr[_root_.sn.gnome.glib.internal.GSList]
object GtkMountOperation_slistautoptr:
  given _tag: Tag[GtkMountOperation_slistautoptr] = Tag.Ptr[_root_.sn.gnome.glib.internal.GSList](_root_.sn.gnome.glib.internal.GSList._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.GSList]): GtkMountOperation_slistautoptr = o
  extension (v: GtkMountOperation_slistautoptr)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.GSList] = v