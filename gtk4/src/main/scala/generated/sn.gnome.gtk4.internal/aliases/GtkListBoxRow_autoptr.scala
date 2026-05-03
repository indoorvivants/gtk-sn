package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListBoxRow_autoptr = Ptr[GtkListBoxRow]
object GtkListBoxRow_autoptr:
  given _tag: Tag[GtkListBoxRow_autoptr] = Tag.Ptr[GtkListBoxRow](GtkListBoxRow._tag)
  inline def apply(inline o: Ptr[GtkListBoxRow]): GtkListBoxRow_autoptr = o
  extension (v: GtkListBoxRow_autoptr)
    inline def value: Ptr[GtkListBoxRow] = v