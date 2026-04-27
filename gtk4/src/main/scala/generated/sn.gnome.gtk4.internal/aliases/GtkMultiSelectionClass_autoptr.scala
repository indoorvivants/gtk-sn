package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMultiSelectionClass_autoptr = Ptr[GtkMultiSelectionClass]
object GtkMultiSelectionClass_autoptr:
  given _tag: Tag[GtkMultiSelectionClass_autoptr] = Tag.Ptr[GtkMultiSelectionClass](GtkMultiSelectionClass._tag)
  inline def apply(inline o: Ptr[GtkMultiSelectionClass]): GtkMultiSelectionClass_autoptr = o
  extension (v: GtkMultiSelectionClass_autoptr)
    inline def value: Ptr[GtkMultiSelectionClass] = v