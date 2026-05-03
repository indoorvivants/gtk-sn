package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintDialog_autoptr = Ptr[GtkPrintDialog]
object GtkPrintDialog_autoptr:
  given _tag: Tag[GtkPrintDialog_autoptr] = Tag.Ptr[GtkPrintDialog](GtkPrintDialog._tag)
  inline def apply(inline o: Ptr[GtkPrintDialog]): GtkPrintDialog_autoptr = o
  extension (v: GtkPrintDialog_autoptr)
    inline def value: Ptr[GtkPrintDialog] = v