package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGesture_autoptr = Ptr[GtkGesture]
object GtkGesture_autoptr:
  given _tag: Tag[GtkGesture_autoptr] = Tag.Ptr[GtkGesture](GtkGesture._tag)
  inline def apply(inline o: Ptr[GtkGesture]): GtkGesture_autoptr = o
  extension (v: GtkGesture_autoptr)
    inline def value: Ptr[GtkGesture] = v