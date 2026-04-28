package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkVideo_autoptr = Ptr[GtkVideo]
object GtkVideo_autoptr:
  given _tag: Tag[GtkVideo_autoptr] = Tag.Ptr[GtkVideo](GtkVideo._tag)
  inline def apply(inline o: Ptr[GtkVideo]): GtkVideo_autoptr = o
  extension (v: GtkVideo_autoptr)
    inline def value: Ptr[GtkVideo] = v