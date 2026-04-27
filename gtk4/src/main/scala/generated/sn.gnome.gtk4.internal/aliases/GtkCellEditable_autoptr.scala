package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellEditable_autoptr = Ptr[GtkCellEditable]
object GtkCellEditable_autoptr:
  given _tag: Tag[GtkCellEditable_autoptr] = Tag.Ptr[GtkCellEditable](GtkCellEditable._tag)
  inline def apply(inline o: Ptr[GtkCellEditable]): GtkCellEditable_autoptr = o
  extension (v: GtkCellEditable_autoptr)
    inline def value: Ptr[GtkCellEditable] = v