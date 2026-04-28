package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSeparator_autoptr = Ptr[GtkSeparator]
object GtkSeparator_autoptr:
  given _tag: Tag[GtkSeparator_autoptr] = Tag.Ptr[GtkSeparator](GtkSeparator._tag)
  inline def apply(inline o: Ptr[GtkSeparator]): GtkSeparator_autoptr = o
  extension (v: GtkSeparator_autoptr)
    inline def value: Ptr[GtkSeparator] = v