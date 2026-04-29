package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusNameAcquiredCallback: : The #GDBusConnection on which to acquired the name. _data: User data passed to g_bus_own_name() or g_bus_own_name_on_connection().
*/
opaque type GBusNameAcquiredCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameAcquiredCallback:
  given _tag: Tag[GBusNameAcquiredCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBusNameAcquiredCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameAcquiredCallback = o
  extension (v: GBusNameAcquiredCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)