package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindowControlsClass_autoptr = Ptr[GtkWindowControlsClass]
object GtkWindowControlsClass_autoptr:
  given _tag: Tag[GtkWindowControlsClass_autoptr] = Tag.Ptr[GtkWindowControlsClass](GtkWindowControlsClass._tag)
  inline def apply(inline o: Ptr[GtkWindowControlsClass]): GtkWindowControlsClass_autoptr = o
  extension (v: GtkWindowControlsClass_autoptr)
    inline def value: Ptr[GtkWindowControlsClass] = v