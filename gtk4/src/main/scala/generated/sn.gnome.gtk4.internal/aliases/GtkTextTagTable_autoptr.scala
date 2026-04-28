package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkTextTagTable_autoptr = Ptr[GtkTextTagTable]
object GtkTextTagTable_autoptr:
  given _tag: Tag[GtkTextTagTable_autoptr] = Tag.Ptr[GtkTextTagTable](GtkTextTagTable._tag)
  inline def apply(inline o: Ptr[GtkTextTagTable]): GtkTextTagTable_autoptr = o
  extension (v: GtkTextTagTable_autoptr)
    inline def value: Ptr[GtkTextTagTable] = v