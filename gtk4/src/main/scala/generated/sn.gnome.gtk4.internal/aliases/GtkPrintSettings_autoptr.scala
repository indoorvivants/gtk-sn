package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintSettings_autoptr = Ptr[GtkPrintSettings]
object GtkPrintSettings_autoptr:
  given _tag: Tag[GtkPrintSettings_autoptr] = Tag.Ptr[GtkPrintSettings](GtkPrintSettings._tag)
  inline def apply(inline o: Ptr[GtkPrintSettings]): GtkPrintSettings_autoptr = o
  extension (v: GtkPrintSettings_autoptr)
    inline def value: Ptr[GtkPrintSettings] = v