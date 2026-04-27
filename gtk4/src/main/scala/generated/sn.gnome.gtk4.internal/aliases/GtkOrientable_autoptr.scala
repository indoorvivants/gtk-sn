package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkOrientable_autoptr = Ptr[GtkOrientable]
object GtkOrientable_autoptr:
  given _tag: Tag[GtkOrientable_autoptr] = Tag.Ptr[GtkOrientable](GtkOrientable._tag)
  inline def apply(inline o: Ptr[GtkOrientable]): GtkOrientable_autoptr = o
  extension (v: GtkOrientable_autoptr)
    inline def value: Ptr[GtkOrientable] = v