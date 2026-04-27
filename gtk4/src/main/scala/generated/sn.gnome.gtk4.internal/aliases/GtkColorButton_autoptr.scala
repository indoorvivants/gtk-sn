package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorButton_autoptr = Ptr[GtkColorButton]
object GtkColorButton_autoptr:
  given _tag: Tag[GtkColorButton_autoptr] = Tag.Ptr[GtkColorButton](GtkColorButton._tag)
  inline def apply(inline o: Ptr[GtkColorButton]): GtkColorButton_autoptr = o
  extension (v: GtkColorButton_autoptr)
    inline def value: Ptr[GtkColorButton] = v