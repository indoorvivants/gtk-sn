package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAppChooserDialog_autoptr = Ptr[GtkAppChooserDialog]
object GtkAppChooserDialog_autoptr:
  given _tag: Tag[GtkAppChooserDialog_autoptr] = Tag.Ptr[GtkAppChooserDialog](GtkAppChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkAppChooserDialog]): GtkAppChooserDialog_autoptr = o
  extension (v: GtkAppChooserDialog_autoptr)
    inline def value: Ptr[GtkAppChooserDialog] = v