package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileMonitorClass = CStruct8[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GFileMonitor], Ptr[GFile], Ptr[GFile], GFileMonitorEvent, Unit], CFuncPtr1[Ptr[GFileMonitor], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GFileMonitorClass:
  given _tag: Tag[_GFileMonitorClass] = Tag.materializeCStruct8Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr4[Ptr[GFileMonitor], Ptr[GFile], Ptr[GFile], GFileMonitorEvent, Unit], CFuncPtr1[Ptr[GFileMonitor], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileMonitorClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr4[Ptr[GFileMonitor], Ptr[GFile], Ptr[GFile], GFileMonitorEvent, Unit] = struct._2
      inline def changed_=(value: CFuncPtr4[Ptr[GFileMonitor], Ptr[GFile], Ptr[GFile], GFileMonitorEvent, Unit]): Unit = (!struct.at2 = value)
      inline def cancel : CFuncPtr1[Ptr[GFileMonitor], _root_.sn.gnome.glib.internal.gboolean] = struct._3
      inline def cancel_=(value: CFuncPtr1[Ptr[GFileMonitor], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at3 = value)
      inline def _g_reserved1 : CFuncPtr0[Unit] = struct._4
      inline def _g_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _g_reserved2 : CFuncPtr0[Unit] = struct._5
      inline def _g_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _g_reserved3 : CFuncPtr0[Unit] = struct._6
      inline def _g_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _g_reserved4 : CFuncPtr0[Unit] = struct._7
      inline def _g_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
      inline def _g_reserved5 : CFuncPtr0[Unit] = struct._8
      inline def _g_reserved5_=(value: CFuncPtr0[Unit]): Unit = (!struct.at8 = value)
    end extension
  
  // Allocates _GFileMonitorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileMonitorClass] = scala.scalanative.unsafe.alloc[_GFileMonitorClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, changed : CFuncPtr4[Ptr[GFileMonitor], Ptr[GFile], Ptr[GFile], GFileMonitorEvent, Unit], cancel : CFuncPtr1[Ptr[GFileMonitor], _root_.sn.gnome.glib.internal.gboolean], _g_reserved1 : CFuncPtr0[Unit], _g_reserved2 : CFuncPtr0[Unit], _g_reserved3 : CFuncPtr0[Unit], _g_reserved4 : CFuncPtr0[Unit], _g_reserved5 : CFuncPtr0[Unit])(using Zone): Ptr[_GFileMonitorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).cancel = cancel
    (!____ptr)._g_reserved1 = _g_reserved1
    (!____ptr)._g_reserved2 = _g_reserved2
    (!____ptr)._g_reserved3 = _g_reserved3
    (!____ptr)._g_reserved4 = _g_reserved4
    (!____ptr)._g_reserved5 = _g_reserved5
    ____ptr