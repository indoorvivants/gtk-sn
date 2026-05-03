package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCallbackActionClass_autoptr = Ptr[GtkCallbackActionClass]
object GtkCallbackActionClass_autoptr:
  given _tag: Tag[GtkCallbackActionClass_autoptr] = Tag.Ptr[GtkCallbackActionClass](GtkCallbackActionClass._tag)
  inline def apply(inline o: Ptr[GtkCallbackActionClass]): GtkCallbackActionClass_autoptr = o
  extension (v: GtkCallbackActionClass_autoptr)
    inline def value: Ptr[GtkCallbackActionClass] = v