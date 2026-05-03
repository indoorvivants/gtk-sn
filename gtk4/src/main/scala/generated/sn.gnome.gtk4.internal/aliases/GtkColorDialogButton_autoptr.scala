package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorDialogButton_autoptr = Ptr[GtkColorDialogButton]
object GtkColorDialogButton_autoptr:
  given _tag: Tag[GtkColorDialogButton_autoptr] = Tag.Ptr[GtkColorDialogButton](GtkColorDialogButton._tag)
  inline def apply(inline o: Ptr[GtkColorDialogButton]): GtkColorDialogButton_autoptr = o
  extension (v: GtkColorDialogButton_autoptr)
    inline def value: Ptr[GtkColorDialogButton] = v