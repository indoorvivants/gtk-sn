package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMapListModelClass_autoptr = Ptr[GtkMapListModelClass]
object GtkMapListModelClass_autoptr:
  given _tag: Tag[GtkMapListModelClass_autoptr] = Tag.Ptr[GtkMapListModelClass](GtkMapListModelClass._tag)
  inline def apply(inline o: Ptr[GtkMapListModelClass]): GtkMapListModelClass_autoptr = o
  extension (v: GtkMapListModelClass_autoptr)
    inline def value: Ptr[GtkMapListModelClass] = v