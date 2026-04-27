package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type goffset = gint64
object goffset:
  given _tag: Tag[goffset] = gint64._tag
  inline def apply(inline o: gint64): goffset = o
  extension (v: goffset)
    inline def value: gint64 = v