package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontDialogClass_autoptr = Ptr[GtkFontDialogClass]
object GtkFontDialogClass_autoptr:
  given _tag: Tag[GtkFontDialogClass_autoptr] = Tag.Ptr[GtkFontDialogClass](GtkFontDialogClass._tag)
  inline def apply(inline o: Ptr[GtkFontDialogClass]): GtkFontDialogClass_autoptr = o
  extension (v: GtkFontDialogClass_autoptr)
    inline def value: Ptr[GtkFontDialogClass] = v