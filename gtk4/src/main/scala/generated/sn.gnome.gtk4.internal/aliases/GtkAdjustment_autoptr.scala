package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAdjustment_autoptr = Ptr[GtkAdjustment]
object GtkAdjustment_autoptr:
  given _tag: Tag[GtkAdjustment_autoptr] = Tag.Ptr[GtkAdjustment](GtkAdjustment._tag)
  inline def apply(inline o: Ptr[GtkAdjustment]): GtkAdjustment_autoptr = o
  extension (v: GtkAdjustment_autoptr)
    inline def value: Ptr[GtkAdjustment] = v