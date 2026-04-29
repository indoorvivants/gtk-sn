package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * gunichar:
*/
type gunichar = guint32
object gunichar:
  given _tag: Tag[gunichar] = guint32._tag
  inline def apply(inline o: guint32): gunichar = o
  extension (v: gunichar)
    inline def value: guint32 = v