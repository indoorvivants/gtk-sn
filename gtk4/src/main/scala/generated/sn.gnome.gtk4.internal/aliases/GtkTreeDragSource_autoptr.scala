package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeDragSource_autoptr = Ptr[GtkTreeDragSource]
object GtkTreeDragSource_autoptr:
  given _tag: Tag[GtkTreeDragSource_autoptr] = Tag.Ptr[GtkTreeDragSource](GtkTreeDragSource._tag)
  inline def apply(inline o: Ptr[GtkTreeDragSource]): GtkTreeDragSource_autoptr = o
  extension (v: GtkTreeDragSource_autoptr)
    inline def value: Ptr[GtkTreeDragSource] = v