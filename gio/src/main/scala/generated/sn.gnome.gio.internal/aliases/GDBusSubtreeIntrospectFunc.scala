package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSubtreeIntrospectFunc: : A #GDBusConnection. : The unique bus name of the remote caller. _path: The object path that was registered with g_dbus_connection_register_subtree(). : A node that is a child of _path (relative to _path) or %NULL for the root of the subtree. _data: The _data #gpointer passed to g_dbus_connection_register_subtree().
*/
opaque type GDBusSubtreeIntrospectFunc = CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
object GDBusSubtreeIntrospectFunc:
  given _tag: Tag[GDBusSubtreeIntrospectFunc] = Tag.materializeCFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusSubtreeIntrospectFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]]): GDBusSubtreeIntrospectFunc = o
  extension (v: GDBusSubtreeIntrospectFunc)
    inline def value: CFuncPtr5[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], _root_.sn.gnome.glib.internal.gpointer, Ptr[Ptr[GDBusInterfaceInfo]]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)