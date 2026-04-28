package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellView_autoptr = Ptr[GtkCellView]
object GtkCellView_autoptr:
  given _tag: Tag[GtkCellView_autoptr] = Tag.Ptr[GtkCellView](GtkCellView._tag)
  inline def apply(inline o: Ptr[GtkCellView]): GtkCellView_autoptr = o
  extension (v: GtkCellView_autoptr)
    inline def value: Ptr[GtkCellView] = v