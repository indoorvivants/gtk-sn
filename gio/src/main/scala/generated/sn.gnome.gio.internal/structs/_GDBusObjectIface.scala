package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectIface: _iface: The parent interface. _object_path: Returns the object path. See g_dbus_object_get_object_path(). _interfaces: Returns all interfaces. See g_dbus_object_get_interfaces(). _interface: Returns an interface by name. See g_dbus_object_get_interface().
*/
opaque type _GDBusObjectIface = CStruct6[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GDBusObject], Ptr[Byte]], CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit], CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]

object _GDBusObjectIface:
  given _tag: Tag[_GDBusObjectIface] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GDBusObject], Ptr[Byte]], CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit], CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectIface)
      inline def parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_object_path : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._2
      inline def get_object_path_=(value: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at2 = value)
      inline def get_interfaces : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]] = struct._3.asInstanceOf[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]]
      inline def get_interfaces_=(value: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[GDBusObject], Ptr[Byte]]])
      inline def get_interface : CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]] = struct._4
      inline def get_interface_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]): Unit = (!struct.at4 = value)
      inline def interface_added : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = struct._5
      inline def interface_added_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = (!struct.at5 = value)
      inline def interface_removed : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = struct._6
      inline def interface_removed_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GDBusObjectIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectIface] = scala.scalanative.unsafe.alloc[_GDBusObjectIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_object_path : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_interfaces : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]], get_interface : CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], interface_added : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit], interface_removed : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit])(using Zone): Ptr[_GDBusObjectIface] =
    val ____ptr = apply()
    (!____ptr).parent_iface = parent_iface
    (!____ptr).get_object_path = get_object_path
    (!____ptr).get_interfaces = get_interfaces
    (!____ptr).get_interface = get_interface
    (!____ptr).interface_added = interface_added
    (!____ptr).interface_removed = interface_removed
    ____ptr