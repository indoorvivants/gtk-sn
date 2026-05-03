package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerIface: _iface: The parent interface. _object_path: Virtual function for g_dbus_object_manager_get_object_path(). _objects: Virtual function for g_dbus_object_manager_get_objects(). _object: Virtual function for g_dbus_object_manager_get_object(). _interface: Virtual function for g_dbus_object_manager_get_interface(). _added: Signal handler for the #GDBusObjectManager::object-added signal. _removed: Signal handler for the #GDBusObjectManager::object-removed signal.
*/
opaque type _GDBusObjectManagerIface = CStruct9[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GDBusObjectManager], Ptr[Byte]], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]

object _GDBusObjectManagerIface:
  given _tag: Tag[_GDBusObjectManagerIface] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]], CFuncPtr1[Ptr[GDBusObjectManager], Ptr[Byte]], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit], CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusObjectManagerIface)
      inline def parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_object_path : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]] = struct._2
      inline def get_object_path_=(value: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = (!struct.at2 = value)
      inline def get_objects : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]] = struct._3.asInstanceOf[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]]
      inline def get_objects_=(value: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[Byte]]])
      inline def get_object : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]] = struct._4
      inline def get_object_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]): Unit = (!struct.at4 = value)
      inline def get_interface : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]] = struct._5
      inline def get_interface_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]): Unit = (!struct.at5 = value)
      inline def object_added : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit] = struct._6
      inline def object_added_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]): Unit = (!struct.at6 = value)
      inline def object_removed : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit] = struct._7
      inline def object_removed_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]): Unit = (!struct.at7 = value)
      inline def interface_added : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = struct._8
      inline def interface_added_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = (!struct.at8 = value)
      inline def interface_removed : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = struct._9
      inline def interface_removed_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GDBusObjectManagerIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusObjectManagerIface] = scala.scalanative.unsafe.alloc[_GDBusObjectManagerIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_object_path : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_objects : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]], get_object : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]], get_interface : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], object_added : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], object_removed : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], interface_added : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit], interface_removed : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit])(using Zone): Ptr[_GDBusObjectManagerIface] =
    val ____ptr = apply()
    (!____ptr).parent_iface = parent_iface
    (!____ptr).get_object_path = get_object_path
    (!____ptr).get_objects = get_objects
    (!____ptr).get_object = get_object
    (!____ptr).get_interface = get_interface
    (!____ptr).object_added = object_added
    (!____ptr).object_removed = object_removed
    (!____ptr).interface_added = interface_added
    (!____ptr).interface_removed = interface_removed
    ____ptr