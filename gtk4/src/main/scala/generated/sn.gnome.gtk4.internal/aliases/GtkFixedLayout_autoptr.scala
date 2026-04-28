package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFixedLayout_autoptr = Ptr[GtkFixedLayout]
object GtkFixedLayout_autoptr:
  given _tag: Tag[GtkFixedLayout_autoptr] = Tag.Ptr[GtkFixedLayout](GtkFixedLayout._tag)
  inline def apply(inline o: Ptr[GtkFixedLayout]): GtkFixedLayout_autoptr = o
  extension (v: GtkFixedLayout_autoptr)
    inline def value: Ptr[GtkFixedLayout] = v