package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkApplication_autoptr = Ptr[GtkApplication]
object GtkApplication_autoptr:
  given _tag: Tag[GtkApplication_autoptr] = Tag.Ptr[GtkApplication](GtkApplication._tag)
  inline def apply(inline o: Ptr[GtkApplication]): GtkApplication_autoptr = o
  extension (v: GtkApplication_autoptr)
    inline def value: Ptr[GtkApplication] = v