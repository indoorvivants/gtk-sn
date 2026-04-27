package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFileChooserWidget_autoptr = Ptr[GtkFileChooserWidget]
object GtkFileChooserWidget_autoptr:
  given _tag: Tag[GtkFileChooserWidget_autoptr] = Tag.Ptr[GtkFileChooserWidget](GtkFileChooserWidget._tag)
  inline def apply(inline o: Ptr[GtkFileChooserWidget]): GtkFileChooserWidget_autoptr = o
  extension (v: GtkFileChooserWidget_autoptr)
    inline def value: Ptr[GtkFileChooserWidget] = v