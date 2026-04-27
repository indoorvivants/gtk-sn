package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRenderer_autoptr = Ptr[GtkCellRenderer]
object GtkCellRenderer_autoptr:
  given _tag: Tag[GtkCellRenderer_autoptr] = Tag.Ptr[GtkCellRenderer](GtkCellRenderer._tag)
  inline def apply(inline o: Ptr[GtkCellRenderer]): GtkCellRenderer_autoptr = o
  extension (v: GtkCellRenderer_autoptr)
    inline def value: Ptr[GtkCellRenderer] = v