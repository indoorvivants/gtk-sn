package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusProxyTypeFunc: : A #GDBusObjectManagerClient. _path: The object path of the remote object.
*/
opaque type GDBusProxyTypeFunc = CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]
object GDBusProxyTypeFunc:
  given _tag: Tag[GDBusProxyTypeFunc] = Tag.materializeCFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusProxyTypeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType]): GDBusProxyTypeFunc = o
  extension (v: GDBusProxyTypeFunc)
    inline def value: CFuncPtr4[Ptr[GDBusObjectManagerClient], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.gobject.internal.GType] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)