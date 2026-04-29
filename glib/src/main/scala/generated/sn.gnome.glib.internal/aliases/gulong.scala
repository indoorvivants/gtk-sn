package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gulong = CUnsignedLongInt
object gulong:
  given _tag: Tag[gulong] = Tag.USize
  inline def apply(inline o: CUnsignedLongInt): gulong = o
  extension (v: gulong)
    inline def value: CUnsignedLongInt = v