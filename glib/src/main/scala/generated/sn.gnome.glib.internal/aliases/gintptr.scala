package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gintptr = CLongInt
object gintptr:
  given _tag: Tag[gintptr] = Tag.Size
  inline def apply(inline o: CLongInt): gintptr = o
  extension (v: gintptr)
    inline def value: CLongInt = v