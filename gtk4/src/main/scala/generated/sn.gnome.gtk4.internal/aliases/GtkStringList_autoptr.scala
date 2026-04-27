package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringList_autoptr = Ptr[GtkStringList]
object GtkStringList_autoptr:
  given _tag: Tag[GtkStringList_autoptr] = Tag.Ptr[GtkStringList](GtkStringList._tag)
  inline def apply(inline o: Ptr[GtkStringList]): GtkStringList_autoptr = o
  extension (v: GtkStringList_autoptr)
    inline def value: Ptr[GtkStringList] = v