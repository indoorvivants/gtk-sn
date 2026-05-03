package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureRotate_autoptr = Ptr[GtkGestureRotate]
object GtkGestureRotate_autoptr:
  given _tag: Tag[GtkGestureRotate_autoptr] = Tag.Ptr[GtkGestureRotate](GtkGestureRotate._tag)
  inline def apply(inline o: Ptr[GtkGestureRotate]): GtkGestureRotate_autoptr = o
  extension (v: GtkGestureRotate_autoptr)
    inline def value: Ptr[GtkGestureRotate] = v