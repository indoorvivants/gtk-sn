package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontButton_autoptr = Ptr[GtkFontButton]
object GtkFontButton_autoptr:
  given _tag: Tag[GtkFontButton_autoptr] = Tag.Ptr[GtkFontButton](GtkFontButton._tag)
  inline def apply(inline o: Ptr[GtkFontButton]): GtkFontButton_autoptr = o
  extension (v: GtkFontButton_autoptr)
    inline def value: Ptr[GtkFontButton] = v