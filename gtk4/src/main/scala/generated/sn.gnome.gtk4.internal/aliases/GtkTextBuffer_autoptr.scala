package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextBuffer_autoptr = Ptr[GtkTextBuffer]
object GtkTextBuffer_autoptr:
  given _tag: Tag[GtkTextBuffer_autoptr] = Tag.Ptr[GtkTextBuffer](GtkTextBuffer._tag)
  inline def apply(inline o: Ptr[GtkTextBuffer]): GtkTextBuffer_autoptr = o
  extension (v: GtkTextBuffer_autoptr)
    inline def value: Ptr[GtkTextBuffer] = v