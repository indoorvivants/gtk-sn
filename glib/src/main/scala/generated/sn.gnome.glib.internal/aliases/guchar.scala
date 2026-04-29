package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type guchar = CUnsignedChar
object guchar:
  given _tag: Tag[guchar] = Tag.UByte
  inline def apply(inline o: CUnsignedChar): guchar = o
  extension (v: guchar)
    inline def value: CUnsignedChar = v