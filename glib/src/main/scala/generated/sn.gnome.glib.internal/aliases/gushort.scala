package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gushort = CUnsignedShort
object gushort:
  given _tag: Tag[gushort] = Tag.UShort
  inline def apply(inline o: CUnsignedShort): gushort = o
  extension (v: gushort)
    inline def value: CUnsignedShort = v