package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeListRowSorterClass_autoptr = Ptr[GtkTreeListRowSorterClass]
object GtkTreeListRowSorterClass_autoptr:
  given _tag: Tag[GtkTreeListRowSorterClass_autoptr] = Tag.Ptr[GtkTreeListRowSorterClass](GtkTreeListRowSorterClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorterClass]): GtkTreeListRowSorterClass_autoptr = o
  extension (v: GtkTreeListRowSorterClass_autoptr)
    inline def value: Ptr[GtkTreeListRowSorterClass] = v