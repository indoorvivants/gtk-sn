package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererSpin_autoptr = Ptr[GtkCellRendererSpin]
object GtkCellRendererSpin_autoptr:
  given _tag: Tag[GtkCellRendererSpin_autoptr] = Tag.Ptr[GtkCellRendererSpin](GtkCellRendererSpin._tag)
  inline def apply(inline o: Ptr[GtkCellRendererSpin]): GtkCellRendererSpin_autoptr = o
  extension (v: GtkCellRendererSpin_autoptr)
    inline def value: Ptr[GtkCellRendererSpin] = v