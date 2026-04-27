package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GAppLaunchContextClass = CStruct9[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString], CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GAppLaunchContextClass:
  given _tag: Tag[_GAppLaunchContextClass] = Tag.materializeCStruct9Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString], CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GAppLaunchContextClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def get_display : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString] = struct._2.asInstanceOf[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]
      inline def get_display_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]): Unit = (!struct.at2 = value.asInstanceOf[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString]])
      inline def get_startup_notify_id : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString] = struct._3.asInstanceOf[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]]
      inline def get_startup_notify_id_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString]): Unit = (!struct.at3 = value.asInstanceOf[CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[Byte], CString]])
      inline def launch_failed : CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit] = struct._4
      inline def launch_failed_=(value: CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit]): Unit = (!struct.at4 = value)
      inline def launched : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._5
      inline def launched_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at5 = value)
      inline def launch_started : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = struct._6
      inline def launch_started_=(value: CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): Unit = (!struct.at6 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._9
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at9 = value)
    end extension
  
  // Allocates _GAppLaunchContextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GAppLaunchContextClass] = scala.scalanative.unsafe.alloc[_GAppLaunchContextClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, get_display : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString], get_startup_notify_id : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GList], CString], launch_failed : CFuncPtr2[Ptr[GAppLaunchContext], CString, Unit], launched : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], launch_started : CFuncPtr3[Ptr[GAppLaunchContext], Ptr[GAppInfo], Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit])(using Zone): Ptr[_GAppLaunchContextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_display = get_display
    (!____ptr).get_startup_notify_id = get_startup_notify_id
    (!____ptr).launch_failed = launch_failed
    (!____ptr).launched = launched
    (!____ptr).launch_started = launch_started
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    ____ptr