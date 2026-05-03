package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSymbolicPaintable_autoptr = Ptr[GtkSymbolicPaintable]
object GtkSymbolicPaintable_autoptr:
  given _tag: Tag[GtkSymbolicPaintable_autoptr] = Tag.Ptr[GtkSymbolicPaintable](GtkSymbolicPaintable._tag)
  inline def apply(inline o: Ptr[GtkSymbolicPaintable]): GtkSymbolicPaintable_autoptr = o
  extension (v: GtkSymbolicPaintable_autoptr)
    inline def value: Ptr[GtkSymbolicPaintable] = v