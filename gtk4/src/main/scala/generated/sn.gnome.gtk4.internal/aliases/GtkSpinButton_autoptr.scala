package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSpinButton_autoptr = Ptr[GtkSpinButton]
object GtkSpinButton_autoptr:
  given _tag: Tag[GtkSpinButton_autoptr] = Tag.Ptr[GtkSpinButton](GtkSpinButton._tag)
  inline def apply(inline o: Ptr[GtkSpinButton]): GtkSpinButton_autoptr = o
  extension (v: GtkSpinButton_autoptr)
    inline def value: Ptr[GtkSpinButton] = v