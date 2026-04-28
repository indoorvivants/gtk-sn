package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindowHandle_autoptr = Ptr[GtkWindowHandle]
object GtkWindowHandle_autoptr:
  given _tag: Tag[GtkWindowHandle_autoptr] = Tag.Ptr[GtkWindowHandle](GtkWindowHandle._tag)
  inline def apply(inline o: Ptr[GtkWindowHandle]): GtkWindowHandle_autoptr = o
  extension (v: GtkWindowHandle_autoptr)
    inline def value: Ptr[GtkWindowHandle] = v