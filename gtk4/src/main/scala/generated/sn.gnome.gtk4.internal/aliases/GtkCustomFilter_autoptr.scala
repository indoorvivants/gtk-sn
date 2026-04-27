package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomFilter_autoptr = Ptr[GtkCustomFilter]
object GtkCustomFilter_autoptr:
  given _tag: Tag[GtkCustomFilter_autoptr] = Tag.Ptr[GtkCustomFilter](GtkCustomFilter._tag)
  inline def apply(inline o: Ptr[GtkCustomFilter]): GtkCustomFilter_autoptr = o
  extension (v: GtkCustomFilter_autoptr)
    inline def value: Ptr[GtkCustomFilter] = v