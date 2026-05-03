package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeIter_autoptr = Ptr[GtkTreeIter]
object GtkTreeIter_autoptr:
  given _tag: Tag[GtkTreeIter_autoptr] = Tag.Ptr[GtkTreeIter](GtkTreeIter._tag)
  inline def apply(inline o: Ptr[GtkTreeIter]): GtkTreeIter_autoptr = o
  extension (v: GtkTreeIter_autoptr)
    inline def value: Ptr[GtkTreeIter] = v