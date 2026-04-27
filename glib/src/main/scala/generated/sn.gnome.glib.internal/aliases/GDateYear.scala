package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GDateYear = guint16
object GDateYear:
  given _tag: Tag[GDateYear] = guint16._tag
  inline def apply(inline o: guint16): GDateYear = o
  extension (v: GDateYear)
    inline def value: guint16 = v