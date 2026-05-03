package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBoolFilter_autoptr = Ptr[GtkBoolFilter]
object GtkBoolFilter_autoptr:
  given _tag: Tag[GtkBoolFilter_autoptr] = Tag.Ptr[GtkBoolFilter](GtkBoolFilter._tag)
  inline def apply(inline o: Ptr[GtkBoolFilter]): GtkBoolFilter_autoptr = o
  extension (v: GtkBoolFilter_autoptr)
    inline def value: Ptr[GtkBoolFilter] = v