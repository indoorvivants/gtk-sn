package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkATContext_autoptr = Ptr[GtkATContext]
object GtkATContext_autoptr:
  given _tag: Tag[GtkATContext_autoptr] = Tag.Ptr[GtkATContext](GtkATContext._tag)
  inline def apply(inline o: Ptr[GtkATContext]): GtkATContext_autoptr = o
  extension (v: GtkATContext_autoptr)
    inline def value: Ptr[GtkATContext] = v