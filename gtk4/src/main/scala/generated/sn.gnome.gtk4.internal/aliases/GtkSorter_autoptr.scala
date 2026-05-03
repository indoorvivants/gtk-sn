package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSorter_autoptr = Ptr[GtkSorter]
object GtkSorter_autoptr:
  given _tag: Tag[GtkSorter_autoptr] = Tag.Ptr[GtkSorter](GtkSorter._tag)
  inline def apply(inline o: Ptr[GtkSorter]): GtkSorter_autoptr = o
  extension (v: GtkSorter_autoptr)
    inline def value: Ptr[GtkSorter] = v