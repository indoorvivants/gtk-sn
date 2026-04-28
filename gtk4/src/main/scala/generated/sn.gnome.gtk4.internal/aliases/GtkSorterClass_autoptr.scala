package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSorterClass_autoptr = Ptr[GtkSorterClass]
object GtkSorterClass_autoptr:
  given _tag: Tag[GtkSorterClass_autoptr] = Tag.Ptr[GtkSorterClass](GtkSorterClass._tag)
  inline def apply(inline o: Ptr[GtkSorterClass]): GtkSorterClass_autoptr = o
  extension (v: GtkSorterClass_autoptr)
    inline def value: Ptr[GtkSorterClass] = v