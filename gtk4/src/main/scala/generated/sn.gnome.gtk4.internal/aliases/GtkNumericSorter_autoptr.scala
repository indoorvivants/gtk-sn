package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNumericSorter_autoptr = Ptr[GtkNumericSorter]
object GtkNumericSorter_autoptr:
  given _tag: Tag[GtkNumericSorter_autoptr] = Tag.Ptr[GtkNumericSorter](GtkNumericSorter._tag)
  inline def apply(inline o: Ptr[GtkNumericSorter]): GtkNumericSorter_autoptr = o
  extension (v: GtkNumericSorter_autoptr)
    inline def value: Ptr[GtkNumericSorter] = v