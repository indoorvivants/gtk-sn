package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkDisplay_autoptr = Ptr[GdkDisplay]
object GdkDisplay_autoptr:
  given _tag: Tag[GdkDisplay_autoptr] = Tag.Ptr[GdkDisplay](GdkDisplay._tag)
  inline def apply(inline o: Ptr[GdkDisplay]): GdkDisplay_autoptr = o
  extension (v: GdkDisplay_autoptr)
    inline def value: Ptr[GdkDisplay] = v