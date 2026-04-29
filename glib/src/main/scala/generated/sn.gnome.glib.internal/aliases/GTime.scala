package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GTime = gint32
object GTime:
  given _tag: Tag[GTime] = gint32._tag
  inline def apply(inline o: gint32): GTime = o
  extension (v: GTime)
    inline def value: gint32 = v