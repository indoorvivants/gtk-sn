package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSelectionFilterModelClass_autoptr = Ptr[GtkSelectionFilterModelClass]
object GtkSelectionFilterModelClass_autoptr:
  given _tag: Tag[GtkSelectionFilterModelClass_autoptr] = Tag.Ptr[GtkSelectionFilterModelClass](GtkSelectionFilterModelClass._tag)
  inline def apply(inline o: Ptr[GtkSelectionFilterModelClass]): GtkSelectionFilterModelClass_autoptr = o
  extension (v: GtkSelectionFilterModelClass_autoptr)
    inline def value: Ptr[GtkSelectionFilterModelClass] = v