package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type guint8 = CUnsignedChar
object guint8:
  given _tag: Tag[guint8] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guint8 = o
  extension (v: guint8)
    inline def value: CUnsignedChar = v