package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkEntry_autoptr = Ptr[GtkEntry]
object GtkEntry_autoptr:
  given _tag: Tag[GtkEntry_autoptr] = Tag.Ptr[GtkEntry](GtkEntry._tag)
  inline def apply(inline o: Ptr[GtkEntry]): GtkEntry_autoptr = o
  extension (v: GtkEntry_autoptr)
    inline def value: Ptr[GtkEntry] = v