package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMapListModel_autoptr = Ptr[GtkMapListModel]
object GtkMapListModel_autoptr:
  given _tag: Tag[GtkMapListModel_autoptr] = Tag.Ptr[GtkMapListModel](GtkMapListModel._tag)
  inline def apply(inline o: Ptr[GtkMapListModel]): GtkMapListModel_autoptr = o
  extension (v: GtkMapListModel_autoptr)
    inline def value: Ptr[GtkMapListModel] = v