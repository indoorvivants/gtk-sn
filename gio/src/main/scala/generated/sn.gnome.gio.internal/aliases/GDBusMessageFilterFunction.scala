package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusMessageFilterFunction: : (transfer none): A #GDBusConnection. : (transfer full): A locked #GDBusMessage that the filter function takes ownership of. : %TRUE if it is a message received from the other peer, %FALSE if it is a message to be sent to the other peer. _data: User data passed when adding the filter.
*/
opaque type GDBusMessageFilterFunction = CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]
object GDBusMessageFilterFunction:
  given _tag: Tag[GDBusMessageFilterFunction] = Tag.materializeCFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDBusMessageFilterFunction = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]]): GDBusMessageFilterFunction = o
  extension (v: GDBusMessageFilterFunction)
    inline def value: CFuncPtr4[Ptr[GDBusConnection], Ptr[GDBusMessage], _root_.sn.gnome.glib.internal.gboolean, _root_.sn.gnome.glib.internal.gpointer, Ptr[GDBusMessage]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)