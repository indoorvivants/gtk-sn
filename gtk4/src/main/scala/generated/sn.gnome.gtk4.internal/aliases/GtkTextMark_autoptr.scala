package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextMark_autoptr = Ptr[GtkTextMark]
object GtkTextMark_autoptr:
  given _tag: Tag[GtkTextMark_autoptr] = Tag.Ptr[GtkTextMark](GtkTextMark._tag)
  inline def apply(inline o: Ptr[GtkTextMark]): GtkTextMark_autoptr = o
  extension (v: GtkTextMark_autoptr)
    inline def value: Ptr[GtkTextMark] = v