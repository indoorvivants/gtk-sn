package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStyleContext_autoptr = Ptr[GtkStyleContext]
object GtkStyleContext_autoptr:
  given _tag: Tag[GtkStyleContext_autoptr] = Tag.Ptr[GtkStyleContext](GtkStyleContext._tag)
  inline def apply(inline o: Ptr[GtkStyleContext]): GtkStyleContext_autoptr = o
  extension (v: GtkStyleContext_autoptr)
    inline def value: Ptr[GtkStyleContext] = v