package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomLayout_autoptr = Ptr[GtkCustomLayout]
object GtkCustomLayout_autoptr:
  given _tag: Tag[GtkCustomLayout_autoptr] = Tag.Ptr[GtkCustomLayout](GtkCustomLayout._tag)
  inline def apply(inline o: Ptr[GtkCustomLayout]): GtkCustomLayout_autoptr = o
  extension (v: GtkCustomLayout_autoptr)
    inline def value: Ptr[GtkCustomLayout] = v