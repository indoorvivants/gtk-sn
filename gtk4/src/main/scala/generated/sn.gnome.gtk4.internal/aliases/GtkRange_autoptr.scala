package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkRange_autoptr = Ptr[GtkRange]
object GtkRange_autoptr:
  given _tag: Tag[GtkRange_autoptr] = Tag.Ptr[GtkRange](GtkRange._tag)
  inline def apply(inline o: Ptr[GtkRange]): GtkRange_autoptr = o
  extension (v: GtkRange_autoptr)
    inline def value: Ptr[GtkRange] = v