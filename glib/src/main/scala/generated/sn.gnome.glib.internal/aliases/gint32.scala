package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gint32 = CInt
object gint32:
  given _tag: Tag[gint32] = Tag.Int
  inline def apply(inline o: CInt): gint32 = o
  extension (v: gint32)
    inline def value: CInt = v