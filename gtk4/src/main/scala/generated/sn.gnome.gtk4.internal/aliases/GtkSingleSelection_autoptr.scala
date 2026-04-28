package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSingleSelection_autoptr = Ptr[GtkSingleSelection]
object GtkSingleSelection_autoptr:
  given _tag: Tag[GtkSingleSelection_autoptr] = Tag.Ptr[GtkSingleSelection](GtkSingleSelection._tag)
  inline def apply(inline o: Ptr[GtkSingleSelection]): GtkSingleSelection_autoptr = o
  extension (v: GtkSingleSelection_autoptr)
    inline def value: Ptr[GtkSingleSelection] = v