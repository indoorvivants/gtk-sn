package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectIface: _iface: The parent interface. _object_path: Returns the object path. See g_dbus_object_get_object_path(). _interfaces: Returns all interfaces. See g_dbus_object_get_interfaces(). _interface: Returns an interface by name. See g_dbus_object_get_interface().
*/
opaque type GDBusObjectIface = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GDBusObjectIface:
  given _tag: Tag[GDBusObjectIface] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusObjectIface)
      inline def parent_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_object_path: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_object_path_=(value: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_interfaces: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_interfaces_=(value: CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def get_interface: CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]]]
      inline def get_interface_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]]] = value
      inline def interface_added: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]]
      inline def interface_added_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]] = value
      inline def interface_removed: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]]
      inline def interface_removed_=(value: CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]] = value
    end extension
  
  // Allocates GDBusObjectIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusObjectIface] = scala.scalanative.unsafe.alloc[GDBusObjectIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_object_path : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_interfaces : CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]], get_interface : CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], interface_added : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit], interface_removed : CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit])(using Zone): Ptr[GDBusObjectIface] =
    val ____ptr = apply()
    (!____ptr).parent_iface = parent_iface
    (!____ptr).get_object_path = get_object_path
    (!____ptr).get_interfaces = get_interfaces
    (!____ptr).get_interface = get_interface
    (!____ptr).interface_added = interface_added
    (!____ptr).interface_removed = interface_removed
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](6)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GDBusObject], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt)
    res
  end offsets