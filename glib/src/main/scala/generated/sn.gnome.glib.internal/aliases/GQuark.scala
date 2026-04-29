package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GQuark = guint32
object GQuark:
  given _tag: Tag[GQuark] = guint32._tag
  inline def apply(inline o: guint32): GQuark = o
  extension (v: GQuark)
    inline def value: guint32 = v