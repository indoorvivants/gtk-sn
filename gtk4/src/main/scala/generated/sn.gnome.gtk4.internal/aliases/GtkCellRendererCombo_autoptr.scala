package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererCombo_autoptr = Ptr[GtkCellRendererCombo]
object GtkCellRendererCombo_autoptr:
  given _tag: Tag[GtkCellRendererCombo_autoptr] = Tag.Ptr[GtkCellRendererCombo](GtkCellRendererCombo._tag)
  inline def apply(inline o: Ptr[GtkCellRendererCombo]): GtkCellRendererCombo_autoptr = o
  extension (v: GtkCellRendererCombo_autoptr)
    inline def value: Ptr[GtkCellRendererCombo] = v