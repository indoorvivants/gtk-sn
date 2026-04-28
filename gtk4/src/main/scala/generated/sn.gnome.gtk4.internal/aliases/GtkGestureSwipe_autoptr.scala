package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureSwipe_autoptr = Ptr[GtkGestureSwipe]
object GtkGestureSwipe_autoptr:
  given _tag: Tag[GtkGestureSwipe_autoptr] = Tag.Ptr[GtkGestureSwipe](GtkGestureSwipe._tag)
  inline def apply(inline o: Ptr[GtkGestureSwipe]): GtkGestureSwipe_autoptr = o
  extension (v: GtkGestureSwipe_autoptr)
    inline def value: Ptr[GtkGestureSwipe] = v