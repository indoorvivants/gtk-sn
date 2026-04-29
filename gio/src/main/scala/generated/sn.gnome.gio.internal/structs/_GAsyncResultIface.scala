package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GAsyncResultIface: _iface: The parent interface. _user_data: Gets the user data passed to the callback. _source_object: Gets the source object that issued the asynchronous operation.
*/
opaque type _GAsyncResultIface = CStruct4[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer], CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]], CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]]

object _GAsyncResultIface:
  given _tag: Tag[_GAsyncResultIface] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer], CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]], CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GAsyncResultIface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def get_user_data : CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer] = struct._2
      inline def get_user_data_=(value: CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer]): Unit = (!struct.at2 = value)
      inline def get_source_object : CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]] = struct._3
      inline def get_source_object_=(value: CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]]): Unit = (!struct.at3 = value)
      inline def is_tagged : CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = struct._4
      inline def is_tagged_=(value: CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GAsyncResultIface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GAsyncResultIface] = scala.scalanative.unsafe.alloc[_GAsyncResultIface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, get_user_data : CFuncPtr1[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer], get_source_object : CFuncPtr1[Ptr[GAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject]], is_tagged : CFuncPtr2[Ptr[GAsyncResult], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean])(using Zone): Ptr[_GAsyncResultIface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).get_user_data = get_user_data
    (!____ptr).get_source_object = get_source_object
    (!____ptr).is_tagged = is_tagged
    ____ptr