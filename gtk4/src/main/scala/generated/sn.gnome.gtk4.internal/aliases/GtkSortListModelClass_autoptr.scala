package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSortListModelClass_autoptr = Ptr[GtkSortListModelClass]
object GtkSortListModelClass_autoptr:
  given _tag: Tag[GtkSortListModelClass_autoptr] = Tag.Ptr[GtkSortListModelClass](GtkSortListModelClass._tag)
  inline def apply(inline o: Ptr[GtkSortListModelClass]): GtkSortListModelClass_autoptr = o
  extension (v: GtkSortListModelClass_autoptr)
    inline def value: Ptr[GtkSortListModelClass] = v