package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gsize = CUnsignedLongInt
object gsize:
  given _tag: Tag[gsize] = Tag.USize
  inline def apply(inline o: CUnsignedLongInt): gsize = o
  extension (v: gsize)
    inline def value: CUnsignedLongInt = v