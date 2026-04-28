package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayoutChildClass_autoptr = Ptr[GtkGridLayoutChildClass]
object GtkGridLayoutChildClass_autoptr:
  given _tag: Tag[GtkGridLayoutChildClass_autoptr] = Tag.Ptr[GtkGridLayoutChildClass](GtkGridLayoutChildClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutChildClass]): GtkGridLayoutChildClass_autoptr = o
  extension (v: GtkGridLayoutChildClass_autoptr)
    inline def value: Ptr[GtkGridLayoutChildClass] = v