package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkVideoClass_autoptr = Ptr[GtkVideoClass]
object GtkVideoClass_autoptr:
  given _tag: Tag[GtkVideoClass_autoptr] = Tag.Ptr[GtkVideoClass](GtkVideoClass._tag)
  inline def apply(inline o: Ptr[GtkVideoClass]): GtkVideoClass_autoptr = o
  extension (v: GtkVideoClass_autoptr)
    inline def value: Ptr[GtkVideoClass] = v