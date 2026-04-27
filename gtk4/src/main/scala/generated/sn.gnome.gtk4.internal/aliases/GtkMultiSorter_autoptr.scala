package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMultiSorter_autoptr = Ptr[GtkMultiSorter]
object GtkMultiSorter_autoptr:
  given _tag: Tag[GtkMultiSorter_autoptr] = Tag.Ptr[GtkMultiSorter](GtkMultiSorter._tag)
  inline def apply(inline o: Ptr[GtkMultiSorter]): GtkMultiSorter_autoptr = o
  extension (v: GtkMultiSorter_autoptr)
    inline def value: Ptr[GtkMultiSorter] = v