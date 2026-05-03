package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOverlayLayout_autoptr = Ptr[GtkOverlayLayout]
object GtkOverlayLayout_autoptr:
  given _tag: Tag[GtkOverlayLayout_autoptr] = Tag.Ptr[GtkOverlayLayout](GtkOverlayLayout._tag)
  inline def apply(inline o: Ptr[GtkOverlayLayout]): GtkOverlayLayout_autoptr = o
  extension (v: GtkOverlayLayout_autoptr)
    inline def value: Ptr[GtkOverlayLayout] = v