package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileDialogClass_autoptr = Ptr[GtkFileDialogClass]
object GtkFileDialogClass_autoptr:
  given _tag: Tag[GtkFileDialogClass_autoptr] = Tag.Ptr[GtkFileDialogClass](GtkFileDialogClass._tag)
  inline def apply(inline o: Ptr[GtkFileDialogClass]): GtkFileDialogClass_autoptr = o
  extension (v: GtkFileDialogClass_autoptr)
    inline def value: Ptr[GtkFileDialogClass] = v