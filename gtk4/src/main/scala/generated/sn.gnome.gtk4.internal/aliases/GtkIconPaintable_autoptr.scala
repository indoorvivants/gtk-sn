package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIconPaintable_autoptr = Ptr[GtkIconPaintable]
object GtkIconPaintable_autoptr:
  given _tag: Tag[GtkIconPaintable_autoptr] = Tag.Ptr[GtkIconPaintable](GtkIconPaintable._tag)
  inline def apply(inline o: Ptr[GtkIconPaintable]): GtkIconPaintable_autoptr = o
  extension (v: GtkIconPaintable_autoptr)
    inline def value: Ptr[GtkIconPaintable] = v