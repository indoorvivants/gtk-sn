package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeDragDest_autoptr = Ptr[GtkTreeDragDest]
object GtkTreeDragDest_autoptr:
  given _tag: Tag[GtkTreeDragDest_autoptr] = Tag.Ptr[GtkTreeDragDest](GtkTreeDragDest._tag)
  inline def apply(inline o: Ptr[GtkTreeDragDest]): GtkTreeDragDest_autoptr = o
  extension (v: GtkTreeDragDest_autoptr)
    inline def value: Ptr[GtkTreeDragDest] = v