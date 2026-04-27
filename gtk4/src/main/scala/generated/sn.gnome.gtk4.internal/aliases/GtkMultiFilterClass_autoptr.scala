package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkMultiFilterClass_autoptr = Ptr[GtkMultiFilterClass]
object GtkMultiFilterClass_autoptr:
  given _tag: Tag[GtkMultiFilterClass_autoptr] = Tag.Ptr[GtkMultiFilterClass](GtkMultiFilterClass._tag)
  inline def apply(inline o: Ptr[GtkMultiFilterClass]): GtkMultiFilterClass_autoptr = o
  extension (v: GtkMultiFilterClass_autoptr)
    inline def value: Ptr[GtkMultiFilterClass] = v