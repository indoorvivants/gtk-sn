package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringFilter_autoptr = Ptr[GtkStringFilter]
object GtkStringFilter_autoptr:
  given _tag: Tag[GtkStringFilter_autoptr] = Tag.Ptr[GtkStringFilter](GtkStringFilter._tag)
  inline def apply(inline o: Ptr[GtkStringFilter]): GtkStringFilter_autoptr = o
  extension (v: GtkStringFilter_autoptr)
    inline def value: Ptr[GtkStringFilter] = v