package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNativeDialog_autoptr = Ptr[GtkNativeDialog]
object GtkNativeDialog_autoptr:
  given _tag: Tag[GtkNativeDialog_autoptr] = Tag.Ptr[GtkNativeDialog](GtkNativeDialog._tag)
  inline def apply(inline o: Ptr[GtkNativeDialog]): GtkNativeDialog_autoptr = o
  extension (v: GtkNativeDialog_autoptr)
    inline def value: Ptr[GtkNativeDialog] = v