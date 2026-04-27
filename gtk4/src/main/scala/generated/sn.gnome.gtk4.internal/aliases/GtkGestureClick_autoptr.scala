package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureClick_autoptr = Ptr[GtkGestureClick]
object GtkGestureClick_autoptr:
  given _tag: Tag[GtkGestureClick_autoptr] = Tag.Ptr[GtkGestureClick](GtkGestureClick._tag)
  inline def apply(inline o: Ptr[GtkGestureClick]): GtkGestureClick_autoptr = o
  extension (v: GtkGestureClick_autoptr)
    inline def value: Ptr[GtkGestureClick] = v