package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringSorterClass_autoptr = Ptr[GtkStringSorterClass]
object GtkStringSorterClass_autoptr:
  given _tag: Tag[GtkStringSorterClass_autoptr] = Tag.Ptr[GtkStringSorterClass](GtkStringSorterClass._tag)
  inline def apply(inline o: Ptr[GtkStringSorterClass]): GtkStringSorterClass_autoptr = o
  extension (v: GtkStringSorterClass_autoptr)
    inline def value: Ptr[GtkStringSorterClass] = v