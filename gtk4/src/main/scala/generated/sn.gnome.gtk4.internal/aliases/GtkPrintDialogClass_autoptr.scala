package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintDialogClass_autoptr = Ptr[GtkPrintDialogClass]
object GtkPrintDialogClass_autoptr:
  given _tag: Tag[GtkPrintDialogClass_autoptr] = Tag.Ptr[GtkPrintDialogClass](GtkPrintDialogClass._tag)
  inline def apply(inline o: Ptr[GtkPrintDialogClass]): GtkPrintDialogClass_autoptr = o
  extension (v: GtkPrintDialogClass_autoptr)
    inline def value: Ptr[GtkPrintDialogClass] = v