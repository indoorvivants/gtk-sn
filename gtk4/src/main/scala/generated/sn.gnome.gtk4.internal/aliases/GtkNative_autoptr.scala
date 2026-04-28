package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkNative_autoptr = Ptr[GtkNative]
object GtkNative_autoptr:
  given _tag: Tag[GtkNative_autoptr] = Tag.Ptr[GtkNative](GtkNative._tag)
  inline def apply(inline o: Ptr[GtkNative]): GtkNative_autoptr = o
  extension (v: GtkNative_autoptr)
    inline def value: Ptr[GtkNative] = v