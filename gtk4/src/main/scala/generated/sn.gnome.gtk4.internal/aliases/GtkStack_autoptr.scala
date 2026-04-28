package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStack_autoptr = Ptr[GtkStack]
object GtkStack_autoptr:
  given _tag: Tag[GtkStack_autoptr] = Tag.Ptr[GtkStack](GtkStack._tag)
  inline def apply(inline o: Ptr[GtkStack]): GtkStack_autoptr = o
  extension (v: GtkStack_autoptr)
    inline def value: Ptr[GtkStack] = v