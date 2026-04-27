package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusSignalCallback: : A #GDBusConnection. _name: (nullable): The unique bus name of the sender of the signal, or %NULL on a peer-to-peer D-Bus connection. _path: The object path that the signal was emitted on. _name: The name of the signal. : A #GVariant tuple with parameters for the signal. _data: User data passed when subscribing to the signal.
*/
opaque type GDBusSignalCallback = CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GDBusSignalCallback:
  given _tag: Tag[GDBusSignalCallback] = Tag.materializeCFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusSignalCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit]): GDBusSignalCallback = o
  extension (v: GDBusSignalCallback)
    inline def value: CFuncPtr7[Ptr[GDBusConnection], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)