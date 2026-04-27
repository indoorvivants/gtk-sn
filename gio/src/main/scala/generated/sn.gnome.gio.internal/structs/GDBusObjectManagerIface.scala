package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusObjectManagerIface: _iface: The parent interface. _object_path: Virtual function for g_dbus_object_manager_get_object_path(). _objects: Virtual function for g_dbus_object_manager_get_objects(). _object: Virtual function for g_dbus_object_manager_get_object(). _interface: Virtual function for g_dbus_object_manager_get_interface(). _added: Signal handler for the #GDBusObjectManager::object-added signal. _removed: Signal handler for the #GDBusObjectManager::object-removed signal.
*/
opaque type GDBusObjectManagerIface = CArray[CChar, Nat.Digit2[Nat._8, Nat._0]]

object GDBusObjectManagerIface:
  given _tag: Tag[GDBusObjectManagerIface] = Tag.CArray[CChar, Nat.Digit2[Nat._8, Nat._0]](Tag.Byte, Tag.Digit2[Nat._8, Nat._0](Tag.Nat8, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusObjectManagerIface)
      inline def parent_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_object_path: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]]]
      inline def get_object_path_=(value: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]]] = value
      inline def get_objects: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]]]
      inline def get_objects_=(value: CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]]] = value
      inline def get_object: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]]]
      inline def get_object_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]]] = value
      inline def get_interface: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]]]
      inline def get_interface_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]]] = value
      inline def object_added: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit] = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]]]
      inline def object_added_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]]] = value
      inline def object_removed: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]]]
      inline def object_removed_=(value: CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]]] = value
      inline def interface_added: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]]
      inline def interface_added_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]] = value
      inline def interface_removed: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit] = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]]
      inline def interface_removed_=(value: CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]): Unit = !struct.at(offsets(8)).asInstanceOf[Ptr[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]]] = value
    end extension
  
  // Allocates GDBusObjectManagerIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusObjectManagerIface] = scala.scalanative.unsafe.alloc[GDBusObjectManagerIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_object_path : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]], get_objects : CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]], get_object : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]], get_interface : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]], object_added : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], object_removed : CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit], interface_added : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit], interface_removed : CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit])(using Zone): Ptr[GDBusObjectManagerIface] =
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
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](9)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.GList]]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusObject]]].toInt, alignmentof[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GDBusInterface]]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]].toInt)
    res(6) = align(res(5) + sizeof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[GDBusObjectManager], Ptr[GDBusObject], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt)
    res(8) = align(res(7) + sizeof[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt, alignmentof[CFuncPtr3[Ptr[GDBusObjectManager], Ptr[GDBusObject], Ptr[GDBusInterface], Unit]].toInt)
    res
  end offsets