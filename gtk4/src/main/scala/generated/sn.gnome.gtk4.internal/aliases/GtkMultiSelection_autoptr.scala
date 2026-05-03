package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMultiSelection_autoptr = Ptr[GtkMultiSelection]
object GtkMultiSelection_autoptr:
  given _tag: Tag[GtkMultiSelection_autoptr] = Tag.Ptr[GtkMultiSelection](GtkMultiSelection._tag)
  inline def apply(inline o: Ptr[GtkMultiSelection]): GtkMultiSelection_autoptr = o
  extension (v: GtkMultiSelection_autoptr)
    inline def value: Ptr[GtkMultiSelection] = v