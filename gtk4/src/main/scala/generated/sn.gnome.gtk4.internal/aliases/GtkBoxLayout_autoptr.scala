package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBoxLayout_autoptr = Ptr[GtkBoxLayout]
object GtkBoxLayout_autoptr:
  given _tag: Tag[GtkBoxLayout_autoptr] = Tag.Ptr[GtkBoxLayout](GtkBoxLayout._tag)
  inline def apply(inline o: Ptr[GtkBoxLayout]): GtkBoxLayout_autoptr = o
  extension (v: GtkBoxLayout_autoptr)
    inline def value: Ptr[GtkBoxLayout] = v