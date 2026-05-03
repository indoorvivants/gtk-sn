package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkImage_autoptr = Ptr[GtkImage]
object GtkImage_autoptr:
  given _tag: Tag[GtkImage_autoptr] = Tag.Ptr[GtkImage](GtkImage._tag)
  inline def apply(inline o: Ptr[GtkImage]): GtkImage_autoptr = o
  extension (v: GtkImage_autoptr)
    inline def value: Ptr[GtkImage] = v