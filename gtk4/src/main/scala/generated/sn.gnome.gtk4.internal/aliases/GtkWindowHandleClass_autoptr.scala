package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindowHandleClass_autoptr = Ptr[GtkWindowHandleClass]
object GtkWindowHandleClass_autoptr:
  given _tag: Tag[GtkWindowHandleClass_autoptr] = Tag.Ptr[GtkWindowHandleClass](GtkWindowHandleClass._tag)
  inline def apply(inline o: Ptr[GtkWindowHandleClass]): GtkWindowHandleClass_autoptr = o
  extension (v: GtkWindowHandleClass_autoptr)
    inline def value: Ptr[GtkWindowHandleClass] = v