package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeListRowClass_autoptr = Ptr[GtkTreeListRowClass]
object GtkTreeListRowClass_autoptr:
  given _tag: Tag[GtkTreeListRowClass_autoptr] = Tag.Ptr[GtkTreeListRowClass](GtkTreeListRowClass._tag)
  inline def apply(inline o: Ptr[GtkTreeListRowClass]): GtkTreeListRowClass_autoptr = o
  extension (v: GtkTreeListRowClass_autoptr)
    inline def value: Ptr[GtkTreeListRowClass] = v