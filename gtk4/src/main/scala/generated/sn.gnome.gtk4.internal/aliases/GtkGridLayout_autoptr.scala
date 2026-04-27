package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayout_autoptr = Ptr[GtkGridLayout]
object GtkGridLayout_autoptr:
  given _tag: Tag[GtkGridLayout_autoptr] = Tag.Ptr[GtkGridLayout](GtkGridLayout._tag)
  inline def apply(inline o: Ptr[GtkGridLayout]): GtkGridLayout_autoptr = o
  extension (v: GtkGridLayout_autoptr)
    inline def value: Ptr[GtkGridLayout] = v