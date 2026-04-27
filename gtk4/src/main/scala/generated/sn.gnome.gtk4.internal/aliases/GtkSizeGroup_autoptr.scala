package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSizeGroup_autoptr = Ptr[GtkSizeGroup]
object GtkSizeGroup_autoptr:
  given _tag: Tag[GtkSizeGroup_autoptr] = Tag.Ptr[GtkSizeGroup](GtkSizeGroup._tag)
  inline def apply(inline o: Ptr[GtkSizeGroup]): GtkSizeGroup_autoptr = o
  extension (v: GtkSizeGroup_autoptr)
    inline def value: Ptr[GtkSizeGroup] = v