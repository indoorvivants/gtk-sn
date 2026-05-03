package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNoSelectionClass_autoptr = Ptr[GtkNoSelectionClass]
object GtkNoSelectionClass_autoptr:
  given _tag: Tag[GtkNoSelectionClass_autoptr] = Tag.Ptr[GtkNoSelectionClass](GtkNoSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkNoSelectionClass]): GtkNoSelectionClass_autoptr = o
  extension (v: GtkNoSelectionClass_autoptr)
    inline def value: Ptr[GtkNoSelectionClass] = v