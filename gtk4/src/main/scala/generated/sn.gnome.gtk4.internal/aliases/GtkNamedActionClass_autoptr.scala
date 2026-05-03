package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNamedActionClass_autoptr = Ptr[GtkNamedActionClass]
object GtkNamedActionClass_autoptr:
  given _tag: Tag[GtkNamedActionClass_autoptr] = Tag.Ptr[GtkNamedActionClass](GtkNamedActionClass._tag)
  inline def apply(inline o: Ptr[GtkNamedActionClass]): GtkNamedActionClass_autoptr = o
  extension (v: GtkNamedActionClass_autoptr)
    inline def value: Ptr[GtkNamedActionClass] = v