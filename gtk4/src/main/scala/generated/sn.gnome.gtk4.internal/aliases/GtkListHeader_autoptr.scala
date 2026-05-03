package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkListHeader_autoptr = Ptr[GtkListHeader]
object GtkListHeader_autoptr:
  given _tag: Tag[GtkListHeader_autoptr] = Tag.Ptr[GtkListHeader](GtkListHeader._tag)
  inline def apply(inline o: Ptr[GtkListHeader]): GtkListHeader_autoptr = o
  extension (v: GtkListHeader_autoptr)
    inline def value: Ptr[GtkListHeader] = v