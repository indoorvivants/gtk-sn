package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorDialogButtonClass_autoptr = Ptr[GtkColorDialogButtonClass]
object GtkColorDialogButtonClass_autoptr:
  given _tag: Tag[GtkColorDialogButtonClass_autoptr] = Tag.Ptr[GtkColorDialogButtonClass](GtkColorDialogButtonClass._tag)
  inline def apply(inline o: Ptr[GtkColorDialogButtonClass]): GtkColorDialogButtonClass_autoptr = o
  extension (v: GtkColorDialogButtonClass_autoptr)
    inline def value: Ptr[GtkColorDialogButtonClass] = v