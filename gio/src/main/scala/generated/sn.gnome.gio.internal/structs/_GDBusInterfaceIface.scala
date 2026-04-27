package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceIface: _iface: The parent interface. _info: Returns a #GDBusInterfaceInfo. See g_dbus_interface_get_info(). _object: Gets the enclosing #GDBusObject. See g_dbus_interface_get_object().
*/
opaque type _GDBusInterfaceIface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusInterface], Ptr[Byte]], CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]], CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit], CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]

object _GDBusInterfaceIface:
  given _tag: Tag[_GDBusInterfaceIface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GDBusInterface], Ptr[Byte]], CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]], CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit], CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusInterfaceIface)
      inline def parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_info : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]]
      inline def get_info_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[GDBusInterface], Ptr[Byte]]])
      inline def get_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]] = struct._3
      inline def get_object_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]): Unit = (!struct.at3 = value)
      inline def set_object : CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit] = struct._4
      inline def set_object_=(value: CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]): Unit = (!struct.at4 = value)
      inline def dup_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]] = struct._5
      inline def dup_object_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GDBusInterfaceIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusInterfaceIface] = scala.scalanative.unsafe.alloc[_GDBusInterfaceIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_info : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]], get_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]], set_object : CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit], dup_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]])(using Zone): Ptr[_GDBusInterfaceIface] =
    val ____ptr = apply()
    (!____ptr).parent_iface = parent_iface
    (!____ptr).get_info = get_info
    (!____ptr).get_object = get_object
    (!____ptr).set_object = set_object
    (!____ptr).dup_object = dup_object
    ____ptr