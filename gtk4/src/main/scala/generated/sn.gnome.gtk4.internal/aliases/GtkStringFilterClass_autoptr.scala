package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringFilterClass_autoptr = Ptr[GtkStringFilterClass]
object GtkStringFilterClass_autoptr:
  given _tag: Tag[GtkStringFilterClass_autoptr] = Tag.Ptr[GtkStringFilterClass](GtkStringFilterClass._tag)
  inline def apply(inline o: Ptr[GtkStringFilterClass]): GtkStringFilterClass_autoptr = o
  extension (v: GtkStringFilterClass_autoptr)
    inline def value: Ptr[GtkStringFilterClass] = v