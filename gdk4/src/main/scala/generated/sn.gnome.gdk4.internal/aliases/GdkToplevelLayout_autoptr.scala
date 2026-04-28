package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkToplevelLayout_autoptr = Ptr[GdkToplevelLayout]
object GdkToplevelLayout_autoptr:
  given _tag: Tag[GdkToplevelLayout_autoptr] = Tag.Ptr[GdkToplevelLayout](GdkToplevelLayout._tag)
  inline def apply(inline o: Ptr[GdkToplevelLayout]): GdkToplevelLayout_autoptr = o
  extension (v: GdkToplevelLayout_autoptr)
    inline def value: Ptr[GdkToplevelLayout] = v