package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusErrorEntry: _code: An error code. _error_name: The D-Bus error name to associate with _code.
*/
opaque type _GDBusErrorEntry = CStruct2[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar]]

object _GDBusErrorEntry:
  given _tag: Tag[_GDBusErrorEntry] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gint, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusErrorEntry)
      inline def error_code : _root_.sn.gnome.glib.internal.gint = struct._1
      inline def error_code_=(value: _root_.sn.gnome.glib.internal.gint): Unit = (!struct.at1 = value)
      inline def dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar] = struct._2
      inline def dbus_error_name_=(value: Ptr[_root_.sn.gnome.glib.internal.gchar]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GDBusErrorEntry on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusErrorEntry] = scala.scalanative.unsafe.alloc[_GDBusErrorEntry](1)
  def apply(error_code : _root_.sn.gnome.glib.internal.gint, dbus_error_name : Ptr[_root_.sn.gnome.glib.internal.gchar])(using Zone): Ptr[_GDBusErrorEntry] =
    val ____ptr = apply()
    (!____ptr).error_code = error_code
    (!____ptr).dbus_error_name = dbus_error_name
    ____ptr