package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGestureSingle_autoptr = Ptr[GtkGestureSingle]
object GtkGestureSingle_autoptr:
  given _tag: Tag[GtkGestureSingle_autoptr] = Tag.Ptr[GtkGestureSingle](GtkGestureSingle._tag)
  inline def apply(inline o: Ptr[GtkGestureSingle]): GtkGestureSingle_autoptr = o
  extension (v: GtkGestureSingle_autoptr)
    inline def value: Ptr[GtkGestureSingle] = v