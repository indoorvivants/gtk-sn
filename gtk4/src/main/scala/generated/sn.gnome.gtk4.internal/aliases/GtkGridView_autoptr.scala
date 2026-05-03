package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridView_autoptr = Ptr[GtkGridView]
object GtkGridView_autoptr:
  given _tag: Tag[GtkGridView_autoptr] = Tag.Ptr[GtkGridView](GtkGridView._tag)
  inline def apply(inline o: Ptr[GtkGridView]): GtkGridView_autoptr = o
  extension (v: GtkGridView_autoptr)
    inline def value: Ptr[GtkGridView] = v