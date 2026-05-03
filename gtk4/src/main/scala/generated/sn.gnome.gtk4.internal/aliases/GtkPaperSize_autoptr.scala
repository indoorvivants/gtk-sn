package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPaperSize_autoptr = Ptr[GtkPaperSize]
object GtkPaperSize_autoptr:
  given _tag: Tag[GtkPaperSize_autoptr] = Tag.Ptr[GtkPaperSize](GtkPaperSize._tag)
  inline def apply(inline o: Ptr[GtkPaperSize]): GtkPaperSize_autoptr = o
  extension (v: GtkPaperSize_autoptr)
    inline def value: Ptr[GtkPaperSize] = v