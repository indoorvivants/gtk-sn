package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTreeListRow_autoptr = Ptr[GtkTreeListRow]
object GtkTreeListRow_autoptr:
  given _tag: Tag[GtkTreeListRow_autoptr] = Tag.Ptr[GtkTreeListRow](GtkTreeListRow._tag)
  inline def apply(inline o: Ptr[GtkTreeListRow]): GtkTreeListRow_autoptr = o
  extension (v: GtkTreeListRow_autoptr)
    inline def value: Ptr[GtkTreeListRow] = v