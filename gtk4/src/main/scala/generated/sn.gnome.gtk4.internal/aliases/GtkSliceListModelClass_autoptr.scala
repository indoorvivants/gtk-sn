package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSliceListModelClass_autoptr = Ptr[GtkSliceListModelClass]
object GtkSliceListModelClass_autoptr:
  given _tag: Tag[GtkSliceListModelClass_autoptr] = Tag.Ptr[GtkSliceListModelClass](GtkSliceListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSliceListModelClass]): GtkSliceListModelClass_autoptr = o
  extension (v: GtkSliceListModelClass_autoptr)
    inline def value: Ptr[GtkSliceListModelClass] = v