package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkWindow_autoptr = Ptr[GtkWindow]
object GtkWindow_autoptr:
  given _tag: Tag[GtkWindow_autoptr] = Tag.Ptr[GtkWindow](GtkWindow._tag)
  inline def apply(inline o: Ptr[GtkWindow]): GtkWindow_autoptr = o
  extension (v: GtkWindow_autoptr)
    inline def value: Ptr[GtkWindow] = v