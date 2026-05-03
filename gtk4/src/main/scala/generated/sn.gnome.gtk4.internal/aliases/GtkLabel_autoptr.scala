package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLabel_autoptr = Ptr[GtkLabel]
object GtkLabel_autoptr:
  given _tag: Tag[GtkLabel_autoptr] = Tag.Ptr[GtkLabel](GtkLabel._tag)
  inline def apply(inline o: Ptr[GtkLabel]): GtkLabel_autoptr = o
  extension (v: GtkLabel_autoptr)
    inline def value: Ptr[GtkLabel] = v