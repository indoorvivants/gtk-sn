package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkButton_autoptr = Ptr[GtkButton]
object GtkButton_autoptr:
  given _tag: Tag[GtkButton_autoptr] = Tag.Ptr[GtkButton](GtkButton._tag)
  inline def apply(inline o: Ptr[GtkButton]): GtkButton_autoptr = o
  extension (v: GtkButton_autoptr)
    inline def value: Ptr[GtkButton] = v