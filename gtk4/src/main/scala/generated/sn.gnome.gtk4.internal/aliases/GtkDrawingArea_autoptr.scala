package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkDrawingArea_autoptr = Ptr[GtkDrawingArea]
object GtkDrawingArea_autoptr:
  given _tag: Tag[GtkDrawingArea_autoptr] = Tag.Ptr[GtkDrawingArea](GtkDrawingArea._tag)
  inline def apply(inline o: Ptr[GtkDrawingArea]): GtkDrawingArea_autoptr = o
  extension (v: GtkDrawingArea_autoptr)
    inline def value: Ptr[GtkDrawingArea] = v