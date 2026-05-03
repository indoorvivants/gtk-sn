package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkActionableInterface = CStruct5[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]

object GtkActionableInterface:
  given _tag: Tag[GtkActionableInterface] = Tag.materializeCStruct5Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GtkActionable], CString], CFuncPtr2[Ptr[GtkActionable], CString, Unit], CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant]], CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkActionableInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_action_name : CFuncPtr1[Ptr[GtkActionable], CString] = struct._2
      inline def get_action_name_=(value: CFuncPtr1[Ptr[GtkActionable], CString]): Unit = (!struct.at2 = value)
      inline def set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit] = struct._3
      inline def set_action_name_=(value: CFuncPtr2[Ptr[GtkActionable], CString, Unit]): Unit = (!struct.at3 = value)
      inline def get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant]] = struct._4
      inline def get_action_target_value_=(value: CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant]]): Unit = (!struct.at4 = value)
      inline def set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._5
      inline def set_action_target_value_=(value: CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates GtkActionableInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkActionableInterface] = scala.scalanative.unsafe.alloc[GtkActionableInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_action_name : CFuncPtr1[Ptr[GtkActionable], CString], set_action_name : CFuncPtr2[Ptr[GtkActionable], CString, Unit], get_action_target_value : CFuncPtr1[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant]], set_action_target_value : CFuncPtr2[Ptr[GtkActionable], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit])(using Zone): Ptr[GtkActionableInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_action_name = get_action_name
    (!____ptr).set_action_name = set_action_name
    (!____ptr).get_action_target_value = get_action_target_value
    (!____ptr).set_action_target_value = set_action_target_value
    ____ptr