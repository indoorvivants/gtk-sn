package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeModel_autoptr = Ptr[GtkTreeModel]
object GtkTreeModel_autoptr:
  given _tag: Tag[GtkTreeModel_autoptr] = Tag.Ptr[GtkTreeModel](GtkTreeModel._tag)
  inline def apply(inline o: Ptr[GtkTreeModel]): GtkTreeModel_autoptr = o
  extension (v: GtkTreeModel_autoptr)
    inline def value: Ptr[GtkTreeModel] = v