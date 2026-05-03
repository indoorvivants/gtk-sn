package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFilterListModelClass_autoptr = Ptr[GtkFilterListModelClass]
object GtkFilterListModelClass_autoptr:
  given _tag: Tag[GtkFilterListModelClass_autoptr] = Tag.Ptr[GtkFilterListModelClass](GtkFilterListModelClass._tag)
  inline def apply(inline o: Ptr[GtkFilterListModelClass]): GtkFilterListModelClass_autoptr = o
  extension (v: GtkFilterListModelClass_autoptr)
    inline def value: Ptr[GtkFilterListModelClass] = v