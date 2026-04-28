package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkColorChooser_autoptr = Ptr[GtkColorChooser]
object GtkColorChooser_autoptr:
  given _tag: Tag[GtkColorChooser_autoptr] = Tag.Ptr[GtkColorChooser](GtkColorChooser._tag)
  inline def apply(inline o: Ptr[GtkColorChooser]): GtkColorChooser_autoptr = o
  extension (v: GtkColorChooser_autoptr)
    inline def value: Ptr[GtkColorChooser] = v