package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMultiSorterClass_autoptr = Ptr[GtkMultiSorterClass]
object GtkMultiSorterClass_autoptr:
  given _tag: Tag[GtkMultiSorterClass_autoptr] = Tag.Ptr[GtkMultiSorterClass](GtkMultiSorterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSorterClass]): GtkMultiSorterClass_autoptr = o
  extension (v: GtkMultiSorterClass_autoptr)
    inline def value: Ptr[GtkMultiSorterClass] = v