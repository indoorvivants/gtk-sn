package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRevealer_autoptr = Ptr[GtkRevealer]
object GtkRevealer_autoptr:
  given _tag: Tag[GtkRevealer_autoptr] = Tag.Ptr[GtkRevealer](GtkRevealer._tag)
  inline def apply(inline o: Ptr[GtkRevealer]): GtkRevealer_autoptr = o
  extension (v: GtkRevealer_autoptr)
    inline def value: Ptr[GtkRevealer] = v