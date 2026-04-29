package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GRemoteActionGroupInterface = CStruct3[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]

object _GRemoteActionGroupInterface:
  given _tag: Tag[_GRemoteActionGroupInterface] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GRemoteActionGroupInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def activate_action_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._2
      inline def activate_action_full_=(value: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at2 = value)
      inline def change_action_state_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._3
      inline def change_action_state_full_=(value: CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GRemoteActionGroupInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GRemoteActionGroupInterface] = scala.scalanative.unsafe.alloc[_GRemoteActionGroupInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, activate_action_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], change_action_state_full : CFuncPtr4[Ptr[GRemoteActionGroup], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[_root_.sn.gnome.glib.internal.GVariant], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit])(using Zone): Ptr[_GRemoteActionGroupInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).activate_action_full = activate_action_full
    (!____ptr).change_action_state_full = change_action_state_full
    ____ptr