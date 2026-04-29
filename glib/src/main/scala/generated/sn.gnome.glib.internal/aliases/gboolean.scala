package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type gboolean = gint
object gboolean:
  given _tag: Tag[gboolean] = gint._tag
  inline def apply(inline o: gint): gboolean = o
  extension (v: gboolean)
    inline def value: gint = v