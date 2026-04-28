package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintContext_autoptr = Ptr[GtkPrintContext]
object GtkPrintContext_autoptr:
  given _tag: Tag[GtkPrintContext_autoptr] = Tag.Ptr[GtkPrintContext](GtkPrintContext._tag)
  inline def apply(inline o: Ptr[GtkPrintContext]): GtkPrintContext_autoptr = o
  extension (v: GtkPrintContext_autoptr)
    inline def value: Ptr[GtkPrintContext] = v