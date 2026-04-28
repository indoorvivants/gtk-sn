package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListItem_autoptr = Ptr[GtkListItem]
object GtkListItem_autoptr:
  given _tag: Tag[GtkListItem_autoptr] = Tag.Ptr[GtkListItem](GtkListItem._tag)
  inline def apply(inline o: Ptr[GtkListItem]): GtkListItem_autoptr = o
  extension (v: GtkListItem_autoptr)
    inline def value: Ptr[GtkListItem] = v