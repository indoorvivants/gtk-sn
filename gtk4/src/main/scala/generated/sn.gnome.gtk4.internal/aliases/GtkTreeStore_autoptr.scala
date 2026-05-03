package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeStore_autoptr = Ptr[GtkTreeStore]
object GtkTreeStore_autoptr:
  given _tag: Tag[GtkTreeStore_autoptr] = Tag.Ptr[GtkTreeStore](GtkTreeStore._tag)
  inline def apply(inline o: Ptr[GtkTreeStore]): GtkTreeStore_autoptr = o
  extension (v: GtkTreeStore_autoptr)
    inline def value: Ptr[GtkTreeStore] = v