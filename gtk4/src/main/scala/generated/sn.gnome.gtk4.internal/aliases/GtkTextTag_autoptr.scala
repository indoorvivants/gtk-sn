package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextTag_autoptr = Ptr[GtkTextTag]
object GtkTextTag_autoptr:
  given _tag: Tag[GtkTextTag_autoptr] = Tag.Ptr[GtkTextTag](GtkTextTag._tag)
  inline def apply(inline o: Ptr[GtkTextTag]): GtkTextTag_autoptr = o
  extension (v: GtkTextTag_autoptr)
    inline def value: Ptr[GtkTextTag] = v