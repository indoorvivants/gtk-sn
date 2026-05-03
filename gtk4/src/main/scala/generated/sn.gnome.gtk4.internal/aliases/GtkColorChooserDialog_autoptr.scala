package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorChooserDialog_autoptr = Ptr[GtkColorChooserDialog]
object GtkColorChooserDialog_autoptr:
  given _tag: Tag[GtkColorChooserDialog_autoptr] = Tag.Ptr[GtkColorChooserDialog](GtkColorChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkColorChooserDialog]): GtkColorChooserDialog_autoptr = o
  extension (v: GtkColorChooserDialog_autoptr)
    inline def value: Ptr[GtkColorChooserDialog] = v