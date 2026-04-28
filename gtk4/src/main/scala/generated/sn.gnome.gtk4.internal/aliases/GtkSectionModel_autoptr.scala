package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSectionModel_autoptr = Ptr[GtkSectionModel]
object GtkSectionModel_autoptr:
  given _tag: Tag[GtkSectionModel_autoptr] = Tag.Ptr[GtkSectionModel](GtkSectionModel._tag)
  inline def apply(inline o: Ptr[GtkSectionModel]): GtkSectionModel_autoptr = o
  extension (v: GtkSectionModel_autoptr)
    inline def value: Ptr[GtkSectionModel] = v