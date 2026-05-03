package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeViewColumn_autoptr = Ptr[GtkTreeViewColumn]
object GtkTreeViewColumn_autoptr:
  given _tag: Tag[GtkTreeViewColumn_autoptr] = Tag.Ptr[GtkTreeViewColumn](GtkTreeViewColumn._tag)
  inline def apply(inline o: Ptr[GtkTreeViewColumn]): GtkTreeViewColumn_autoptr = o
  extension (v: GtkTreeViewColumn_autoptr)
    inline def value: Ptr[GtkTreeViewColumn] = v