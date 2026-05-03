package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gint = CInt
object gint:
  given _tag: Tag[gint] = Tag.Int
  inline def apply(inline o: CInt): gint = o
  extension (v: gint)
    inline def value: CInt = v