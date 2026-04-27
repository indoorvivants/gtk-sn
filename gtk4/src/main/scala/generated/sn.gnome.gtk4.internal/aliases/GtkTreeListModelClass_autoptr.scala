package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeListModelClass_autoptr = Ptr[GtkTreeListModelClass]
object GtkTreeListModelClass_autoptr:
  given _tag: Tag[GtkTreeListModelClass_autoptr] = Tag.Ptr[GtkTreeListModelClass](GtkTreeListModelClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListModelClass]): GtkTreeListModelClass_autoptr = o
  extension (v: GtkTreeListModelClass_autoptr)
    inline def value: Ptr[GtkTreeListModelClass] = v