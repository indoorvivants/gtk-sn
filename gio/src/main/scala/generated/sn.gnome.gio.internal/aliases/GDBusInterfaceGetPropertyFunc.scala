package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceGetPropertyFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that the method was invoked on. : Return location for error. _data: The _data #gpointer passed to g_dbus_connection_register_object().
*/
opaque type GDBusInterfaceGetPropertyFunc = CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
object GDBusInterfaceGetPropertyFunc:
  given _tag: Tag[GDBusInterfaceGetPropertyFunc] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusInterfaceGetPropertyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]]): GDBusInterfaceGetPropertyFunc = o
  extension (v: GDBusInterfaceGetPropertyFunc)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[Ptr[_root_.sn.gnome.glib.internal.GError]], _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.glib.internal.GVariant]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)