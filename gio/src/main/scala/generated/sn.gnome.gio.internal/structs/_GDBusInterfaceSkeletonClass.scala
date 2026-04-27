package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDBusInterfaceSkeletonClass: _class: The parent class. _info: Returns a #GDBusInterfaceInfo. See g_dbus_interface_skeleton_get_info() for details. _vtable: Returns a #GDBusInterfaceVTable. See g_dbus_interface_skeleton_get_vtable() for details. _properties: Returns a #GVariant with all properties. See g_dbus_interface_skeleton_get_properties(). : Emits outstanding changes, if any. See g_dbus_interface_skeleton_flush(). _authorize_method: Signal class handler for the #GDBusInterfaceSkeleton::g-authorize-method signal.
*/
opaque type _GDBusInterfaceSkeletonClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[Byte]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8], CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GDBusInterfaceSkeletonClass:
  given _tag: Tag[_GDBusInterfaceSkeletonClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[Byte]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8], CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GDBusInterfaceSkeletonClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_info : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]] = struct._2.asInstanceOf[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]]
      inline def get_info_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[Byte]]])
      inline def get_vtable : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]] = struct._3
      inline def get_vtable_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]]): Unit = (!struct.at3 = value)
      inline def get_properties : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._4
      inline def get_properties_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at4 = value)
      inline def flush : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit] = struct._5
      inline def flush_=(value: CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit]): Unit = (!struct.at5 = value)
      inline def vfunc_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._6
      inline def vfunc_padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at6 = value)
      inline def g_authorize_method : CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean] = struct._7
      inline def g_authorize_method_=(value: CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at7 = value)
      inline def signal_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._8
      inline def signal_padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GDBusInterfaceSkeletonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GDBusInterfaceSkeletonClass] = scala.scalanative.unsafe.alloc[_GDBusInterfaceSkeletonClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_info : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceInfo]], get_vtable : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusInterfaceVTable]], get_properties : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Ptr[_root_.sn.gnome.glib.internal.GVariant]], flush : CFuncPtr1[Ptr[GDBusInterfaceSkeleton], Unit], vfunc_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8], g_authorize_method : CFuncPtr2[Ptr[GDBusInterfaceSkeleton], Ptr[GDBusMethodInvocation], _root_.sn.gnome.glib.internal.gboolean], signal_padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GDBusInterfaceSkeletonClass] =
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