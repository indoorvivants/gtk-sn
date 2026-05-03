package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFilterListModel_autoptr = Ptr[GtkFilterListModel]
object GtkFilterListModel_autoptr:
  given _tag: Tag[GtkFilterListModel_autoptr] = Tag.Ptr[GtkFilterListModel](GtkFilterListModel._tag)
  inline def apply(inline o: Ptr[GtkFilterListModel]): GtkFilterListModel_autoptr = o
  extension (v: GtkFilterListModel_autoptr)
    inline def value: Ptr[GtkFilterListModel] = v