package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gint8 = CChar
object gint8:
  given _tag: Tag[gint8] = Tag.Byte
  inline def apply(inline o: CChar): gint8 = o
  extension (v: gint8)
    inline def value: CChar = v