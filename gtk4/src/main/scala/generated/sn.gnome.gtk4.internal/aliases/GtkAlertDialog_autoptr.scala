package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAlertDialog_autoptr = Ptr[GtkAlertDialog]
object GtkAlertDialog_autoptr:
  given _tag: Tag[GtkAlertDialog_autoptr] = Tag.Ptr[GtkAlertDialog](GtkAlertDialog._tag)
  inline def apply(inline o: Ptr[GtkAlertDialog]): GtkAlertDialog_autoptr = o
  extension (v: GtkAlertDialog_autoptr)
    inline def value: Ptr[GtkAlertDialog] = v