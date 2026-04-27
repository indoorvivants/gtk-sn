package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeSortable_autoptr = Ptr[GtkTreeSortable]
object GtkTreeSortable_autoptr:
  given _tag: Tag[GtkTreeSortable_autoptr] = Tag.Ptr[GtkTreeSortable](GtkTreeSortable._tag)
  inline def apply(inline o: Ptr[GtkTreeSortable]): GtkTreeSortable_autoptr = o
  extension (v: GtkTreeSortable_autoptr)
    inline def value: Ptr[GtkTreeSortable] = v