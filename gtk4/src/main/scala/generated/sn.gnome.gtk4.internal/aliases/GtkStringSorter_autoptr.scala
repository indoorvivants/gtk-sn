package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringSorter_autoptr = Ptr[GtkStringSorter]
object GtkStringSorter_autoptr:
  given _tag: Tag[GtkStringSorter_autoptr] = Tag.Ptr[GtkStringSorter](GtkStringSorter._tag)
  inline def apply(inline o: Ptr[GtkStringSorter]): GtkStringSorter_autoptr = o
  extension (v: GtkStringSorter_autoptr)
    inline def value: Ptr[GtkStringSorter] = v