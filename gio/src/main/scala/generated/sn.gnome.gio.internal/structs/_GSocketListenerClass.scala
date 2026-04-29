package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketListenerClass: : virtual method called when the set of socket listened to changes
*/
opaque type _GSocketListenerClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketListener], Unit], CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GSocketListenerClass:
  given _tag: Tag[_GSocketListenerClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GSocketListener], Unit], CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSocketListenerClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GSocketListener], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GSocketListener], Unit]): Unit = (!struct.at2 = value)
      inline def event : CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit] = struct._3
      inline def event_=(value: CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit]): Unit = (!struct.at3 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._4
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._6
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _g_reserved6 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved6_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GSocketListenerClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSocketListenerClass] = scala.scalanative.unsafe.alloc[_GSocketListenerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, changed : CFuncPtr1[Ptr[GSocketListener], Unit], event : CFuncPtr3[Ptr[GSocketListener], GSocketListenerEvent, Ptr[GSocket], Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit], _g_reserved6 : CFuncPtr0[Unit])(using Zone): Ptr[_GSocketListenerClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).event = event
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    (!____ptr)._g_reserved6 = _g_reserved6
    ____ptr