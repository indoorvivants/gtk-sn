package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkGridLayoutClass_autoptr = Ptr[GtkGridLayoutClass]
object GtkGridLayoutClass_autoptr:
  given _tag: Tag[GtkGridLayoutClass_autoptr] = Tag.Ptr[GtkGridLayoutClass](GtkGridLayoutClass._tag)
  inline def apply(inline o: Ptr[GtkGridLayoutClass]): GtkGridLayoutClass_autoptr = o
  extension (v: GtkGridLayoutClass_autoptr)
    inline def value: Ptr[GtkGridLayoutClass] = v