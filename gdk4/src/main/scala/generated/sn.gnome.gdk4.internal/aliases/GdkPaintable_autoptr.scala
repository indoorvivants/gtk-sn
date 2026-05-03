package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkPaintable_autoptr = Ptr[GdkPaintable]
object GdkPaintable_autoptr:
  given _tag: Tag[GdkPaintable_autoptr] = Tag.Ptr[GdkPaintable](GdkPaintable._tag)
  inline def apply(inline o: Ptr[GdkPaintable]): GdkPaintable_autoptr = o
  extension (v: GdkPaintable_autoptr)
    inline def value: Ptr[GdkPaintable] = v