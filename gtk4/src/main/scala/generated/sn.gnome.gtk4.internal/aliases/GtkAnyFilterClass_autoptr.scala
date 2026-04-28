package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkAnyFilterClass_autoptr = Ptr[GtkAnyFilterClass]
object GtkAnyFilterClass_autoptr:
  given _tag: Tag[GtkAnyFilterClass_autoptr] = Tag.Ptr[GtkAnyFilterClass](GtkAnyFilterClass._tag)
  inline def apply(inline o: Ptr[GtkAnyFilterClass]): GtkAnyFilterClass_autoptr = o
  extension (v: GtkAnyFilterClass_autoptr)
    inline def value: Ptr[GtkAnyFilterClass] = v