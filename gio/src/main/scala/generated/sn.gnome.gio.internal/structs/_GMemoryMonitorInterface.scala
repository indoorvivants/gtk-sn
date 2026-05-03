package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMemoryMonitorInterface = CStruct2[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]]

object _GMemoryMonitorInterface:
  given _tag: Tag[_GMemoryMonitorInterface] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GTypeInterface, CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMemoryMonitorInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
      inline def low_memory_warning : CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit] = struct._2
      inline def low_memory_warning_=(value: CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMemoryMonitorInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMemoryMonitorInterface] = scala.scalanative.unsafe.alloc[_GMemoryMonitorInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, low_memory_warning : CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit])(using Zone): Ptr[_GMemoryMonitorInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).low_memory_warning = low_memory_warning
    ____ptr