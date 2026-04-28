package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSingleSelectionClass_autoptr = Ptr[GtkSingleSelectionClass]
object GtkSingleSelectionClass_autoptr:
  given _tag: Tag[GtkSingleSelectionClass_autoptr] = Tag.Ptr[GtkSingleSelectionClass](GtkSingleSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkSingleSelectionClass]): GtkSingleSelectionClass_autoptr = o
  extension (v: GtkSingleSelectionClass_autoptr)
    inline def value: Ptr[GtkSingleSelectionClass] = v