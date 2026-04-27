package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCenterLayout_autoptr = Ptr[GtkCenterLayout]
object GtkCenterLayout_autoptr:
  given _tag: Tag[GtkCenterLayout_autoptr] = Tag.Ptr[GtkCenterLayout](GtkCenterLayout._tag)
  inline def apply(inline o: Ptr[GtkCenterLayout]): GtkCenterLayout_autoptr = o
  extension (v: GtkCenterLayout_autoptr)
    inline def value: Ptr[GtkCenterLayout] = v