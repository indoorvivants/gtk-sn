package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellAreaContext_autoptr = Ptr[GtkCellAreaContext]
object GtkCellAreaContext_autoptr:
  given _tag: Tag[GtkCellAreaContext_autoptr] = Tag.Ptr[GtkCellAreaContext](GtkCellAreaContext._tag)
  inline def apply(inline o: Ptr[GtkCellAreaContext]): GtkCellAreaContext_autoptr = o
  extension (v: GtkCellAreaContext_autoptr)
    inline def value: Ptr[GtkCellAreaContext] = v