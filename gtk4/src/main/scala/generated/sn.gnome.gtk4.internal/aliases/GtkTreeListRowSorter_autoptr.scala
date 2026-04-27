package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeListRowSorter_autoptr = Ptr[GtkTreeListRowSorter]
object GtkTreeListRowSorter_autoptr:
  given _tag: Tag[GtkTreeListRowSorter_autoptr] = Tag.Ptr[GtkTreeListRowSorter](GtkTreeListRowSorter._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowSorter]): GtkTreeListRowSorter_autoptr = o
  extension (v: GtkTreeListRowSorter_autoptr)
    inline def value: Ptr[GtkTreeListRowSorter] = v