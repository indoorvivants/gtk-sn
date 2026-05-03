package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererProgress_autoptr = Ptr[GtkCellRendererProgress]
object GtkCellRendererProgress_autoptr:
  given _tag: Tag[GtkCellRendererProgress_autoptr] = Tag.Ptr[GtkCellRendererProgress](GtkCellRendererProgress._tag)
  inline def apply(inline o: Ptr[GtkCellRendererProgress]): GtkCellRendererProgress_autoptr = o
  extension (v: GtkCellRendererProgress_autoptr)
    inline def value: Ptr[GtkCellRendererProgress] = v