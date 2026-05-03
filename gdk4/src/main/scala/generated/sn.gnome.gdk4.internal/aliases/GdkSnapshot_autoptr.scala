package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkSnapshot_autoptr = Ptr[GdkSnapshot]
object GdkSnapshot_autoptr:
  given _tag: Tag[GdkSnapshot_autoptr] = Tag.Ptr[GdkSnapshot](GdkSnapshot._tag)
  inline def apply(inline o: Ptr[GdkSnapshot]): GdkSnapshot_autoptr = o
  extension (v: GdkSnapshot_autoptr)
    inline def value: Ptr[GdkSnapshot] = v