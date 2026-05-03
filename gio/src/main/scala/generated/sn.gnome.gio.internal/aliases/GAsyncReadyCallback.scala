package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAsyncReadyCallback: _object: (nullable): the object the asynchronous operation was started with. : a #GAsyncResult.
*/
opaque type GAsyncReadyCallback = CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GAsyncReadyCallback:
  given _tag: Tag[GAsyncReadyCallback] = Tag.materializeCFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GAsyncReadyCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit]): GAsyncReadyCallback = o
  extension (v: GAsyncReadyCallback)
    inline def value: CFuncPtr3[Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)