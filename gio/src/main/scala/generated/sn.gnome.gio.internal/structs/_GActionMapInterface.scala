package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GActionMapInterface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]], CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit], CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]

object _GActionMapInterface:
  given _tag: Tag[_GActionMapInterface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]], CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit], CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GActionMapInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def lookup_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]] = struct._2
      inline def lookup_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]]): Unit = (!struct.at2 = value)
      inline def add_action : CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit] = struct._3
      inline def add_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit]): Unit = (!struct.at3 = value)
      inline def remove_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit] = struct._4
      inline def remove_action_=(value: CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GActionMapInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GActionMapInterface] = scala.scalanative.unsafe.alloc[_GActionMapInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, lookup_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Ptr[GAction]], add_action : CFuncPtr2[Ptr[GActionMap], Ptr[GAction], Unit], remove_action : CFuncPtr2[Ptr[GActionMap], Ptr[_root_.sn.gnome.glib.internal.gchar], Unit])(using Zone): Ptr[_GActionMapInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).lookup_action = lookup_action
    (!____ptr).add_action = add_action
    (!____ptr).remove_action = remove_action
    ____ptr