package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAccessibleRange_autoptr = Ptr[GtkAccessibleRange]
object GtkAccessibleRange_autoptr:
  given _tag: Tag[GtkAccessibleRange_autoptr] = Tag.Ptr[GtkAccessibleRange](GtkAccessibleRange._tag)
  inline def apply(inline o: Ptr[GtkAccessibleRange]): GtkAccessibleRange_autoptr = o
  extension (v: GtkAccessibleRange_autoptr)
    inline def value: Ptr[GtkAccessibleRange] = v