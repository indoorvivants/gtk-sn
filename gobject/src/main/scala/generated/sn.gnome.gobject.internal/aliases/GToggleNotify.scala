package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GToggleNotify:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GToggleNotify = CFuncPtr3[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], _root_.sn.gnome.glib.internal.gboolean, Unit]
object GToggleNotify:
  given _tag: Tag[GToggleNotify] = Tag.materializeCFuncPtr3[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], _root_.sn.gnome.glib.internal.gboolean, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GToggleNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], _root_.sn.gnome.glib.internal.gboolean, Unit]): GToggleNotify = o
  extension (v: GToggleNotify)
    inline def value: CFuncPtr3[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], _root_.sn.gnome.glib.internal.gboolean, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)