package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLayoutManagerClass_autoptr = Ptr[GtkLayoutManagerClass]
object GtkLayoutManagerClass_autoptr:
  given _tag: Tag[GtkLayoutManagerClass_autoptr] = Tag.Ptr[GtkLayoutManagerClass](GtkLayoutManagerClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutManagerClass]): GtkLayoutManagerClass_autoptr = o
  extension (v: GtkLayoutManagerClass_autoptr)
    inline def value: Ptr[GtkLayoutManagerClass] = v