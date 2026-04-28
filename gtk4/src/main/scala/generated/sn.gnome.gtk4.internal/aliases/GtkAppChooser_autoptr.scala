package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAppChooser_autoptr = Ptr[GtkAppChooser]
object GtkAppChooser_autoptr:
  given _tag: Tag[GtkAppChooser_autoptr] = Tag.Ptr[GtkAppChooser](GtkAppChooser._tag)
  inline def apply(inline o: Ptr[GtkAppChooser]): GtkAppChooser_autoptr = o
  extension (v: GtkAppChooser_autoptr)
    inline def value: Ptr[GtkAppChooser] = v