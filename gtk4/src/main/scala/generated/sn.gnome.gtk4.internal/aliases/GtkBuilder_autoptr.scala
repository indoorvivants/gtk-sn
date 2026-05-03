package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBuilder_autoptr = Ptr[GtkBuilder]
object GtkBuilder_autoptr:
  given _tag: Tag[GtkBuilder_autoptr] = Tag.Ptr[GtkBuilder](GtkBuilder._tag)
  inline def apply(inline o: Ptr[GtkBuilder]): GtkBuilder_autoptr = o
  extension (v: GtkBuilder_autoptr)
    inline def value: Ptr[GtkBuilder] = v