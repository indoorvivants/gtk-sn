package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomSorter_autoptr = Ptr[GtkCustomSorter]
object GtkCustomSorter_autoptr:
  given _tag: Tag[GtkCustomSorter_autoptr] = Tag.Ptr[GtkCustomSorter](GtkCustomSorter._tag)
  inline def apply(inline o: Ptr[GtkCustomSorter]): GtkCustomSorter_autoptr = o
  extension (v: GtkCustomSorter_autoptr)
    inline def value: Ptr[GtkCustomSorter] = v