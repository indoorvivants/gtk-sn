package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontChooserWidget_autoptr = Ptr[GtkFontChooserWidget]
object GtkFontChooserWidget_autoptr:
  given _tag: Tag[GtkFontChooserWidget_autoptr] = Tag.Ptr[GtkFontChooserWidget](GtkFontChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFontChooserWidget]): GtkFontChooserWidget_autoptr = o
  extension (v: GtkFontChooserWidget_autoptr)
    inline def value: Ptr[GtkFontChooserWidget] = v