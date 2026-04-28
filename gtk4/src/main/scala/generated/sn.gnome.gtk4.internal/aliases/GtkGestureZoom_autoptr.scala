package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureZoom_autoptr = Ptr[GtkGestureZoom]
object GtkGestureZoom_autoptr:
  given _tag: Tag[GtkGestureZoom_autoptr] = Tag.Ptr[GtkGestureZoom](GtkGestureZoom._tag)
  inline def apply(inline o: Ptr[GtkGestureZoom]): GtkGestureZoom_autoptr = o
  extension (v: GtkGestureZoom_autoptr)
    inline def value: Ptr[GtkGestureZoom] = v