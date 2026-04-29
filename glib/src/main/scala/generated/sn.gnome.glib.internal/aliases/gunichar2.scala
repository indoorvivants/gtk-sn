package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * gunichar2:
*/
type gunichar2 = guint16
object gunichar2:
  given _tag: Tag[gunichar2] = guint16._tag
  inline def apply(inline o: guint16): gunichar2 = o
  extension (v: gunichar2)
    inline def value: guint16 = v