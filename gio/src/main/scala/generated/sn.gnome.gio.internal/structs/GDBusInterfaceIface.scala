package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceIface: _iface: The parent interface. _info: Returns a #GDBusInterfaceInfo. See g_dbus_interface_get_info(). _object: Gets the enclosing #GDBusObject. See g_dbus_interface_get_object().
*/
opaque type GDBusInterfaceIface = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GDBusInterfaceIface:
  given _tag: Tag[GDBusInterfaceIface] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusInterfaceIface)
      inline def parent_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def parent_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def get_info: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]]]
      inline def get_info_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]]] = value
      inline def get_object: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]]
      inline def get_object_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]] = value
      inline def set_object: CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]]]
      inline def set_object_=(value: CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]]] = value
      inline def dup_object: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]]
      inline def dup_object_=(value: CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]]] = value
    end extension
  
  // Allocates GDBusInterfaceIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusInterfaceIface] = scala.scalanative.unsafe.alloc[GDBusInterfaceIface](1)
  def apply(parent_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_info : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]], get_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]], set_object : CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit], dup_object : CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]])(using Zone): Ptr[GDBusInterfaceIface] =
    val ____ptr = apply()
    (!____ptr).parent_iface = parent_iface
    (!____ptr).get_info = get_info
    (!____ptr).get_object = get_object
    (!____ptr).set_object = set_object
    (!____ptr).dup_object = dup_object
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](5)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusInterfaceInfo]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr2[Ptr[GDBusInterface], Ptr[GDBusObject], Unit]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterface], Ptr[GDBusObject]]].toInt)
    res
  end offsets