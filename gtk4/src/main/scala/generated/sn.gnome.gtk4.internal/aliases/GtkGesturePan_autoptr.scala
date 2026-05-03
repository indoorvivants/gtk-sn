package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGesturePan_autoptr = Ptr[GtkGesturePan]
object GtkGesturePan_autoptr:
  given _tag: Tag[GtkGesturePan_autoptr] = Tag.Ptr[GtkGesturePan](GtkGesturePan._tag)
  inline def apply(inline o: Ptr[GtkGesturePan]): GtkGesturePan_autoptr = o
  extension (v: GtkGesturePan_autoptr)
    inline def value: Ptr[GtkGesturePan] = v