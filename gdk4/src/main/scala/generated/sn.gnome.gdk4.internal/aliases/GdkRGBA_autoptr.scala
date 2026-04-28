package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkRGBA_autoptr = Ptr[GdkRGBA]
object GdkRGBA_autoptr:
  given _tag: Tag[GdkRGBA_autoptr] = Tag.Ptr[GdkRGBA](GdkRGBA._tag)
  inline def apply(inline o: Ptr[GdkRGBA]): GdkRGBA_autoptr = o
  extension (v: GdkRGBA_autoptr)
    inline def value: Ptr[GdkRGBA] = v