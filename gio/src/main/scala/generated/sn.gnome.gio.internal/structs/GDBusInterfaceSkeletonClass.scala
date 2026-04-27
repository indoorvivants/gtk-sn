package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceSkeletonClass: _class: The parent class. _info: Returns a #GDBusInterfaceInfo. See g_dbus_interface_skeleton_get_info() for details. _vtable: Returns a #GDBusInterfaceVTable. See g_dbus_interface_skeleton_get_vtable() for details. _properties: Returns a #GVariant with all properties. See g_dbus_interface_skeleton_get_properties(). : Emits outstanding changes, if any. See g_dbus_interface_skeleton_flush(). _authorize_method: Signal class handler for the #GDBusInterfaceSkeleton::g-authorize-method signal.
*/
opaque type GDBusInterfaceSkeletonClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]]

object GDBusInterfaceSkeletonClass:
  given _tag: Tag[GDBusInterfaceSkeletonClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._0, Nat._4](Tag.Nat3, Tag.Nat0, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDBusInterfaceSkeletonClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def get_info: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]]]
      inline def get_info_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]]] = value
      inline def get_vtable: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]] = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]]]
      inline def get_vtable_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]]] = value
      inline def get_properties: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]]
      inline def get_properties_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = !struct.at(offsets(3)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]]] = value
      inline def flush: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit] = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]]]
      inline def flush_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]): Unit = !struct.at(offsets(4)).asInstanceOf[Ptr[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]]] = value
      inline def vfunc_padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def vfunc_padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(5)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
      inline def g_authorize_method: CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean] = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]]]
      inline def g_authorize_method_=(value: CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]): Unit = !struct.at(offsets(6)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]]] = value
      inline def signal_padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]]
      inline def signal_padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = !struct.at(offsets(7)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]] = value
    end extension
  
  // Allocates GDBusInterfaceSkeletonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDBusInterfaceSkeletonClass] = scala.scalanative.unsafe.alloc[GDBusInterfaceSkeletonClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_info : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]], get_vtable : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]], get_properties : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]], flush : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit], vfunc_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8], g_authorize_method : CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], signal_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GDBusInterfaceSkeletonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_info = get_info
    (!____ptr).get_vtable = get_vtable
    (!____ptr).get_properties = get_properties
    (!____ptr).flush = flush
    (!____ptr).vfunc_padding = vfunc_padding
    (!____ptr).g_authorize_method = g_authorize_method
    (!____ptr).signal_padding = signal_padding
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](8)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]].toInt)
    res(2) = align(res(1) + sizeof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]].toInt)
    res(3) = align(res(2) + sizeof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt)
    res(4) = align(res(3) + sizeof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]].toInt, alignmentof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]].toInt)
    res(5) = align(res(4) + sizeof[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res(6) = align(res(5) + sizeof[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]].toInt, alignmentof[CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]].toInt)
    res(7) = align(res(6) + sizeof[CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets