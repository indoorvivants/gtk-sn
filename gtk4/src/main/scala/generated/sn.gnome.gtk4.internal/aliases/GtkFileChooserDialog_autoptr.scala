package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileChooserDialog_autoptr = Ptr[GtkFileChooserDialog]
object GtkFileChooserDialog_autoptr:
  given _tag: Tag[GtkFileChooserDialog_autoptr] = Tag.Ptr[GtkFileChooserDialog](GtkFileChooserDialog._tag)
  inline def apply(inline o: Ptr[GtkFileChooserDialog]): GtkFileChooserDialog_autoptr = o
  extension (v: GtkFileChooserDialog_autoptr)
    inline def value: Ptr[GtkFileChooserDialog] = v