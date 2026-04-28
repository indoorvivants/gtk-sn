package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStringObject_autoptr = Ptr[GtkStringObject]
object GtkStringObject_autoptr:
  given _tag: Tag[GtkStringObject_autoptr] = Tag.Ptr[GtkStringObject](GtkStringObject._tag)
  inline def apply(inline o: Ptr[GtkStringObject]): GtkStringObject_autoptr = o
  extension (v: GtkStringObject_autoptr)
    inline def value: Ptr[GtkStringObject] = v