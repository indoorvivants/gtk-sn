package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontChooserDialog_autoptr = Ptr[GtkFontChooserDialog]
object GtkFontChooserDialog_autoptr:
  given _tag: Tag[GtkFontChooserDialog_autoptr] = Tag.Ptr[GtkFontChooserDialog](GtkFontChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFontChooserDialog]): GtkFontChooserDialog_autoptr = o
  extension (v: GtkFontChooserDialog_autoptr)
    inline def value: Ptr[GtkFontChooserDialog] = v