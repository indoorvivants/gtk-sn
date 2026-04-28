package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkFrameTimings_autoptr = Ptr[GdkFrameTimings]
object GdkFrameTimings_autoptr:
  given _tag: Tag[GdkFrameTimings_autoptr] = Tag.Ptr[GdkFrameTimings](GdkFrameTimings._tag)
  inline def apply(inline o: Ptr[GdkFrameTimings]): GdkFrameTimings_autoptr = o
  extension (v: GdkFrameTimings_autoptr)
    inline def value: Ptr[GdkFrameTimings] = v