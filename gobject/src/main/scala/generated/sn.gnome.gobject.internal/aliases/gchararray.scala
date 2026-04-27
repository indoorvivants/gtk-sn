package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * gchararray:
*/
opaque type gchararray = Ptr[_root_.sn.gnome.glib.internal.gchar]
object gchararray:
  given _tag: Tag[gchararray] = Tag.Ptr[_root_.sn.gnome.glib.internal.gchar](_root_.sn.gnome.glib.internal.gchar._tag)
  inline def apply(inline o: Ptr[_root_.sn.gnome.glib.internal.gchar]): gchararray = o
  extension (v: gchararray)
    inline def value: Ptr[_root_.sn.gnome.glib.internal.gchar] = v