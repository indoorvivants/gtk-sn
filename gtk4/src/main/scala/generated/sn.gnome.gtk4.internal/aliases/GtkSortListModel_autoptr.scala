package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSortListModel_autoptr = Ptr[GtkSortListModel]
object GtkSortListModel_autoptr:
  given _tag: Tag[GtkSortListModel_autoptr] = Tag.Ptr[GtkSortListModel](GtkSortListModel._tag)
  inline def apply(inline o: Ptr[GtkSortListModel]): GtkSortListModel_autoptr = o
  extension (v: GtkSortListModel_autoptr)
    inline def value: Ptr[GtkSortListModel] = v