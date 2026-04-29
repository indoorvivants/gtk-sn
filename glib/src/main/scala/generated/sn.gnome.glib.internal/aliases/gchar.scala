package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type gchar = CChar
object gchar:
  given _tag: Tag[gchar] = Tag.Byte
  inline def apply(inline o: CChar): gchar = o
  extension (v: gchar)
    inline def value: CChar = v