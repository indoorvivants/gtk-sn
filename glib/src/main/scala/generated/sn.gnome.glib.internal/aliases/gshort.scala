package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gshort = CShort
object gshort:
  given _tag: Tag[gshort] = Tag.Short
  inline def apply(inline o: CShort): gshort = o
  extension (v: gshort)
    inline def value: CShort = v