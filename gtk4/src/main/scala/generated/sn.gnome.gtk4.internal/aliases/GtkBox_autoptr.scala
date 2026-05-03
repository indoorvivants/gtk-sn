package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkBox_autoptr = Ptr[GtkBox]
object GtkBox_autoptr:
  given _tag: Tag[GtkBox_autoptr] = Tag.Ptr[GtkBox](GtkBox._tag)
  inline def apply(inline o: Ptr[GtkBox]): GtkBox_autoptr = o
  extension (v: GtkBox_autoptr)
    inline def value: Ptr[GtkBox] = v