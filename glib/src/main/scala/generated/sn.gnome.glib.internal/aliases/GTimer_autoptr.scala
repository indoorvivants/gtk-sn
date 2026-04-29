package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTimer_autoptr = Ptr[GTimer]
object GTimer_autoptr:
  given _tag: Tag[GTimer_autoptr] = Tag.Ptr[GTimer](GTimer._tag)
  inline def apply(inline o: Ptr[GTimer]): GTimer_autoptr = o
  extension (v: GTimer_autoptr)
    inline def value: Ptr[GTimer] = v