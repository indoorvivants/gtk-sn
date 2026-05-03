package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAnyFilter_autoptr = Ptr[GtkAnyFilter]
object GtkAnyFilter_autoptr:
  given _tag: Tag[GtkAnyFilter_autoptr] = Tag.Ptr[GtkAnyFilter](GtkAnyFilter._tag)
  inline def apply(inline o: Ptr[GtkAnyFilter]): GtkAnyFilter_autoptr = o
  extension (v: GtkAnyFilter_autoptr)
    inline def value: Ptr[GtkAnyFilter] = v