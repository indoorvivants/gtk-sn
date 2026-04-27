package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureDrag_autoptr = Ptr[GtkGestureDrag]
object GtkGestureDrag_autoptr:
  given _tag: Tag[GtkGestureDrag_autoptr] = Tag.Ptr[GtkGestureDrag](GtkGestureDrag._tag)
  inline def apply(inline o: Ptr[GtkGestureDrag]): GtkGestureDrag_autoptr = o
  extension (v: GtkGestureDrag_autoptr)
    inline def value: Ptr[GtkGestureDrag] = v