package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceMethodCallFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that the method was invoked on. : A #GVariant tuple with parameters. : (transfer full): A #GDBusMethodInvocation object that must be used to return a value or error. _data: The _data #gpointer passed to g_dbus_connection_register_object().
*/
opaque type GDBusInterfaceMethodCallFunc = CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GDBusInterfaceMethodCallFunc:
  given _tag: Tag[GDBusInterfaceMethodCallFunc] = Tag.materializeCFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusInterfaceMethodCallFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit]): GDBusInterfaceMethodCallFunc = o
  extension (v: GDBusInterfaceMethodCallFunc)
    inline def value: CFuncPtr8[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)