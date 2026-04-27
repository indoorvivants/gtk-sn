package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkComboBoxText_autoptr = Ptr[GtkComboBoxText]
object GtkComboBoxText_autoptr:
  given _tag: Tag[GtkComboBoxText_autoptr] = Tag.Ptr[GtkComboBoxText](GtkComboBoxText._tag)
  inline def apply(inline o: Ptr[GtkComboBoxText]): GtkComboBoxText_autoptr = o
  extension (v: GtkComboBoxText_autoptr)
    inline def value: Ptr[GtkComboBoxText] = v