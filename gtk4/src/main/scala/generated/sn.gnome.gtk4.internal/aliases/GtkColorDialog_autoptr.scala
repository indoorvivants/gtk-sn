package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorDialog_autoptr = Ptr[GtkColorDialog]
object GtkColorDialog_autoptr:
  given _tag: Tag[GtkColorDialog_autoptr] = Tag.Ptr[GtkColorDialog](GtkColorDialog._tag)
  inline def apply(inline o: Ptr[GtkColorDialog]): GtkColorDialog_autoptr = o
  extension (v: GtkColorDialog_autoptr)
    inline def value: Ptr[GtkColorDialog] = v