package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEveryFilter_autoptr = Ptr[GtkEveryFilter]
object GtkEveryFilter_autoptr:
  given _tag: Tag[GtkEveryFilter_autoptr] = Tag.Ptr[GtkEveryFilter](GtkEveryFilter._tag)
  inline def apply(inline o: Ptr[GtkEveryFilter]): GtkEveryFilter_autoptr = o
  extension (v: GtkEveryFilter_autoptr)
    inline def value: Ptr[GtkEveryFilter] = v