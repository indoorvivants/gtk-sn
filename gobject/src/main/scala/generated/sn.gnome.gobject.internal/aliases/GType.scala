package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

type GType = _root_.sn.gnome.glib.internal.gsize
object GType:
  given _tag: Tag[GType] = _root_.sn.gnome.glib.internal.gsize._tag
  inline def apply(inline o: _root_.sn.gnome.glib.internal.gsize): GType = o
  extension (v: GType)
    inline def value: _root_.sn.gnome.glib.internal.gsize = v