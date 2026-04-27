package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTimeSpan:
*/
type GTimeSpan = gint64
object GTimeSpan:
  given _tag: Tag[GTimeSpan] = gint64._tag
  inline def apply(inline o: gint64): GTimeSpan = o
  extension (v: GTimeSpan)
    inline def value: gint64 = v