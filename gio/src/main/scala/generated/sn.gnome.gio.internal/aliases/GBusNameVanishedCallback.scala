package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBusNameVanishedCallback: : The #GDBusConnection the name is being watched on, or %NULL. _data: User data passed to g_bus_watch_name().
*/
opaque type GBusNameVanishedCallback = CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GBusNameVanishedCallback:
  given _tag: Tag[GBusNameVanishedCallback] = Tag.materializeCFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBusNameVanishedCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit]): GBusNameVanishedCallback = o
  extension (v: GBusNameVanishedCallback)
    inline def value: CFuncPtr3[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)