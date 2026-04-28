package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListView_autoptr = Ptr[GtkListView]
object GtkListView_autoptr:
  given _tag: Tag[GtkListView_autoptr] = Tag.Ptr[GtkListView](GtkListView._tag)
  inline def apply(inline o: Ptr[GtkListView]): GtkListView_autoptr = o
  extension (v: GtkListView_autoptr)
    inline def value: Ptr[GtkListView] = v