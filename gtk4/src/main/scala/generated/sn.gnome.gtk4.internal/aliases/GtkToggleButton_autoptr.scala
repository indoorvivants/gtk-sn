package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkToggleButton_autoptr = Ptr[GtkToggleButton]
object GtkToggleButton_autoptr:
  given _tag: Tag[GtkToggleButton_autoptr] = Tag.Ptr[GtkToggleButton](GtkToggleButton._tag)
  inline def apply(inline o: Ptr[GtkToggleButton]): GtkToggleButton_autoptr = o
  extension (v: GtkToggleButton_autoptr)
    inline def value: Ptr[GtkToggleButton] = v