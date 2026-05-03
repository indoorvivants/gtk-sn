package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GPowerProfileMonitorInterface = CStruct1[_root_.sn.gnome.gobject.internal.GTypeInterface]

object _GPowerProfileMonitorInterface:
  given _tag: Tag[_GPowerProfileMonitorInterface] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GTypeInterface]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GPowerProfileMonitorInterface)
      inline def g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface = struct._1
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GPowerProfileMonitorInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GPowerProfileMonitorInterface] = scala.scalanative.unsafe.alloc[_GPowerProfileMonitorInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface)(using Zone): Ptr[_GPowerProfileMonitorInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    ____ptr