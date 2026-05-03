package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkToplevel_autoptr = Ptr[GdkToplevel]
object GdkToplevel_autoptr:
  given _tag: Tag[GdkToplevel_autoptr] = Tag.Ptr[GdkToplevel](GdkToplevel._tag)
  inline def apply(inline o: Ptr[GdkToplevel]): GdkToplevel_autoptr = o
  extension (v: GdkToplevel_autoptr)
    inline def value: Ptr[GdkToplevel] = v