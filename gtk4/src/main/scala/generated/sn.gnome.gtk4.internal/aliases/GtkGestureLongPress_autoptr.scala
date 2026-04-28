package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureLongPress_autoptr = Ptr[GtkGestureLongPress]
object GtkGestureLongPress_autoptr:
  given _tag: Tag[GtkGestureLongPress_autoptr] = Tag.Ptr[GtkGestureLongPress](GtkGestureLongPress._tag)
  inline def apply(inline o: Ptr[GtkGestureLongPress]): GtkGestureLongPress_autoptr = o
  extension (v: GtkGestureLongPress_autoptr)
    inline def value: Ptr[GtkGestureLongPress] = v