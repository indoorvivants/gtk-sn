package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkScrollbar_autoptr = Ptr[GtkScrollbar]
object GtkScrollbar_autoptr:
  given _tag: Tag[GtkScrollbar_autoptr] = Tag.Ptr[GtkScrollbar](GtkScrollbar._tag)
  inline def apply(inline o: Ptr[GtkScrollbar]): GtkScrollbar_autoptr = o
  extension (v: GtkScrollbar_autoptr)
    inline def value: Ptr[GtkScrollbar] = v