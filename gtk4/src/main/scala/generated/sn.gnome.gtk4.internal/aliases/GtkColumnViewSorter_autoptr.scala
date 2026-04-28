package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColumnViewSorter_autoptr = Ptr[GtkColumnViewSorter]
object GtkColumnViewSorter_autoptr:
  given _tag: Tag[GtkColumnViewSorter_autoptr] = Tag.Ptr[GtkColumnViewSorter](GtkColumnViewSorter._tag)
  inline def apply(inline o: Ptr[GtkColumnViewSorter]): GtkColumnViewSorter_autoptr = o
  extension (v: GtkColumnViewSorter_autoptr)
    inline def value: Ptr[GtkColumnViewSorter] = v