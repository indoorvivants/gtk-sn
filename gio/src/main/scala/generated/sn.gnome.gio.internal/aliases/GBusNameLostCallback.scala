package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusNameLostCallback: : The #GDBusConnection on which to acquire the name or %NULL if the connection was disconnected. _data: User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
*/
opaque type GBusNameLostCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameLostCallback:
  given _tag: Tag[GBusNameLostCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBusNameLostCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameLostCallback = o
  extension (v: GBusNameLostCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)