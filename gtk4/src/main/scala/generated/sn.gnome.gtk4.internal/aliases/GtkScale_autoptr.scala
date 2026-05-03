package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkScale_autoptr = Ptr[GtkScale]
object GtkScale_autoptr:
  given _tag: Tag[GtkScale_autoptr] = Tag.Ptr[GtkScale](GtkScale._tag)
  inline def apply(inline o: Ptr[GtkScale]): GtkScale_autoptr = o
  extension (v: GtkScale_autoptr)
    inline def value: Ptr[GtkScale] = v