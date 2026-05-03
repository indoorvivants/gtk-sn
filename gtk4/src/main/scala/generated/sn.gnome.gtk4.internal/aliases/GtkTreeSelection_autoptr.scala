package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeSelection_autoptr = Ptr[GtkTreeSelection]
object GtkTreeSelection_autoptr:
  given _tag: Tag[GtkTreeSelection_autoptr] = Tag.Ptr[GtkTreeSelection](GtkTreeSelection._tag)
  inline def apply(inline o: Ptr[GtkTreeSelection]): GtkTreeSelection_autoptr = o
  extension (v: GtkTreeSelection_autoptr)
    inline def value: Ptr[GtkTreeSelection] = v