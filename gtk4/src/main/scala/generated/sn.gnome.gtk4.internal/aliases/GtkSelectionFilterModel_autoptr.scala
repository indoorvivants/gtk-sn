package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSelectionFilterModel_autoptr = Ptr[GtkSelectionFilterModel]
object GtkSelectionFilterModel_autoptr:
  given _tag: Tag[GtkSelectionFilterModel_autoptr] = Tag.Ptr[GtkSelectionFilterModel](GtkSelectionFilterModel._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModel]): GtkSelectionFilterModel_autoptr = o
  extension (v: GtkSelectionFilterModel_autoptr)
    inline def value: Ptr[GtkSelectionFilterModel] = v