package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkViewport_autoptr = Ptr[GtkViewport]
object GtkViewport_autoptr:
  given _tag: Tag[GtkViewport_autoptr] = Tag.Ptr[GtkViewport](GtkViewport._tag)
  inline def apply(inline o: Ptr[GtkViewport]): GtkViewport_autoptr = o
  extension (v: GtkViewport_autoptr)
    inline def value: Ptr[GtkViewport] = v