package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontChooser_autoptr = Ptr[GtkFontChooser]
object GtkFontChooser_autoptr:
  given _tag: Tag[GtkFontChooser_autoptr] = Tag.Ptr[GtkFontChooser](GtkFontChooser._tag)
  inline def apply(inline o: Ptr[GtkFontChooser]): GtkFontChooser_autoptr = o
  extension (v: GtkFontChooser_autoptr)
    inline def value: Ptr[GtkFontChooser] = v