package sn.gnome.gdk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GdkSeat_autoptr = Ptr[GdkSeat]
object GdkSeat_autoptr:
  given _tag: Tag[GdkSeat_autoptr] = Tag.Ptr[GdkSeat](GdkSeat._tag)
  inline def apply(inline o: Ptr[GdkSeat]): GdkSeat_autoptr = o
  extension (v: GdkSeat_autoptr)
    inline def value: Ptr[GdkSeat] = v