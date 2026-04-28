package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNothingActionClass_autoptr = Ptr[GtkNothingActionClass]
object GtkNothingActionClass_autoptr:
  given _tag: Tag[GtkNothingActionClass_autoptr] = Tag.Ptr[GtkNothingActionClass](GtkNothingActionClass._tag)
  inline def apply(inline o: Ptr[GtkNothingActionClass]): GtkNothingActionClass_autoptr = o
  extension (v: GtkNothingActionClass_autoptr)
    inline def value: Ptr[GtkNothingActionClass] = v