package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSliceListModel_autoptr = Ptr[GtkSliceListModel]
object GtkSliceListModel_autoptr:
  given _tag: Tag[GtkSliceListModel_autoptr] = Tag.Ptr[GtkSliceListModel](GtkSliceListModel._tag)
  inline def apply(inline o: Ptr[GtkSliceListModel]): GtkSliceListModel_autoptr = o
  extension (v: GtkSliceListModel_autoptr)
    inline def value: Ptr[GtkSliceListModel] = v