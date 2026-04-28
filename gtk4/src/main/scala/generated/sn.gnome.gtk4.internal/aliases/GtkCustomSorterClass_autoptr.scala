package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCustomSorterClass_autoptr = Ptr[GtkCustomSorterClass]
object GtkCustomSorterClass_autoptr:
  given _tag: Tag[GtkCustomSorterClass_autoptr] = Tag.Ptr[GtkCustomSorterClass](GtkCustomSorterClass._tag)
  inline def apply(inline o: Ptr[GtkCustomSorterClass]): GtkCustomSorterClass_autoptr = o
  extension (v: GtkCustomSorterClass_autoptr)
    inline def value: Ptr[GtkCustomSorterClass] = v