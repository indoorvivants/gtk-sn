package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type guintptr = CUnsignedLongInt
object guintptr:
  given _tag: Tag[guintptr] = Tag.USize
  inline def apply(inline o: CUnsignedLongInt): guintptr = o
  extension (v: guintptr)
    inline def value: CUnsignedLongInt = v