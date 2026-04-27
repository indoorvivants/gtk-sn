package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellLayout_autoptr = Ptr[GtkCellLayout]
object GtkCellLayout_autoptr:
  given _tag: Tag[GtkCellLayout_autoptr] = Tag.Ptr[GtkCellLayout](GtkCellLayout._tag)
  inline def apply(inline o: Ptr[GtkCellLayout]): GtkCellLayout_autoptr = o
  extension (v: GtkCellLayout_autoptr)
    inline def value: Ptr[GtkCellLayout] = v