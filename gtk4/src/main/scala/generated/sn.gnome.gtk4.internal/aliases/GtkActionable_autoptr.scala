package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActionable_autoptr = Ptr[GtkActionable]
object GtkActionable_autoptr:
  given _tag: Tag[GtkActionable_autoptr] = Tag.Ptr[GtkActionable](GtkActionable._tag)
  inline def apply(inline o: Ptr[GtkActionable]): GtkActionable_autoptr = o
  extension (v: GtkActionable_autoptr)
    inline def value: Ptr[GtkActionable] = v