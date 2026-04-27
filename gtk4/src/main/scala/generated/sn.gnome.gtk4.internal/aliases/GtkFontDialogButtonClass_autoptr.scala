package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontDialogButtonClass_autoptr = Ptr[GtkFontDialogButtonClass]
object GtkFontDialogButtonClass_autoptr:
  given _tag: Tag[GtkFontDialogButtonClass_autoptr] = Tag.Ptr[GtkFontDialogButtonClass](GtkFontDialogButtonClass._tag)
  inline def apply(inline o: Ptr[GtkFontDialogButtonClass]): GtkFontDialogButtonClass_autoptr = o
  extension (v: GtkFontDialogButtonClass_autoptr)
    inline def value: Ptr[GtkFontDialogButtonClass] = v