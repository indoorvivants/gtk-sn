package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListStore_autoptr = Ptr[GtkListStore]
object GtkListStore_autoptr:
  given _tag: Tag[GtkListStore_autoptr] = Tag.Ptr[GtkListStore](GtkListStore._tag)
  inline def apply(inline o: Ptr[GtkListStore]): GtkListStore_autoptr = o
  extension (v: GtkListStore_autoptr)
    inline def value: Ptr[GtkListStore] = v