package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAccessible_autoptr = Ptr[GtkAccessible]
object GtkAccessible_autoptr:
  given _tag: Tag[GtkAccessible_autoptr] = Tag.Ptr[GtkAccessible](GtkAccessible._tag)
  inline def apply(inline o: Ptr[GtkAccessible]): GtkAccessible_autoptr = o
  extension (v: GtkAccessible_autoptr)
    inline def value: Ptr[GtkAccessible] = v