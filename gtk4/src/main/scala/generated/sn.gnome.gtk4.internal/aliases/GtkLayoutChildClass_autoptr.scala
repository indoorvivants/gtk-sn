package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkLayoutChildClass_autoptr = Ptr[GtkLayoutChildClass]
object GtkLayoutChildClass_autoptr:
  given _tag: Tag[GtkLayoutChildClass_autoptr] = Tag.Ptr[GtkLayoutChildClass](GtkLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkLayoutChildClass]): GtkLayoutChildClass_autoptr = o
  extension (v: GtkLayoutChildClass_autoptr)
    inline def value: Ptr[GtkLayoutChildClass] = v