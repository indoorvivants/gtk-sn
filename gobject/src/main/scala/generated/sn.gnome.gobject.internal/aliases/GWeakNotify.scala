package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GWeakNotify:

 * [bindgen] header: /usr/include/glib-2.0/gobject/gobject.h
*/
opaque type GWeakNotify = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], Unit]
object GWeakNotify:
  given _tag: Tag[GWeakNotify] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GWeakNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], Unit]): GWeakNotify = o
  extension (v: GWeakNotify)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GObject], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)