package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkFrameClock_autoptr = Ptr[GdkFrameClock]
object GdkFrameClock_autoptr:
  given _tag: Tag[GdkFrameClock_autoptr] = Tag.Ptr[GdkFrameClock](GdkFrameClock._tag)
  inline def apply(inline o: Ptr[GdkFrameClock]): GdkFrameClock_autoptr = o
  extension (v: GdkFrameClock_autoptr)
    inline def value: Ptr[GdkFrameClock] = v