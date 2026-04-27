package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellAreaBox_autoptr = Ptr[GtkCellAreaBox]
object GtkCellAreaBox_autoptr:
  given _tag: Tag[GtkCellAreaBox_autoptr] = Tag.Ptr[GtkCellAreaBox](GtkCellAreaBox._tag)
  inline def apply(inline o: Ptr[GtkCellAreaBox]): GtkCellAreaBox_autoptr = o
  extension (v: GtkCellAreaBox_autoptr)
    inline def value: Ptr[GtkCellAreaBox] = v