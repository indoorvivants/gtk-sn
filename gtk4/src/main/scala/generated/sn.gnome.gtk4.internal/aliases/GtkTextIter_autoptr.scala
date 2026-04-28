package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextIter_autoptr = Ptr[GtkTextIter]
object GtkTextIter_autoptr:
  given _tag: Tag[GtkTextIter_autoptr] = Tag.Ptr[GtkTextIter](GtkTextIter._tag)
  inline def apply(inline o: Ptr[GtkTextIter]): GtkTextIter_autoptr = o
  extension (v: GtkTextIter_autoptr)
    inline def value: Ptr[GtkTextIter] = v