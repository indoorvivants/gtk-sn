package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkIMContextSimple_autoptr = Ptr[GtkIMContextSimple]
object GtkIMContextSimple_autoptr:
  given _tag: Tag[GtkIMContextSimple_autoptr] = Tag.Ptr[GtkIMContextSimple](GtkIMContextSimple._tag)
  inline def apply(inline o: Ptr[GtkIMContextSimple]): GtkIMContextSimple_autoptr = o
  extension (v: GtkIMContextSimple_autoptr)
    inline def value: Ptr[GtkIMContextSimple] = v