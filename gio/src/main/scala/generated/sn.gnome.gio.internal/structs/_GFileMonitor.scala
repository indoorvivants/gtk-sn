package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GFileMonitor = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GFileMonitorPrivate]]

object _GFileMonitor:
  given _tag: Tag[_GFileMonitor] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GFileMonitorPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GFileMonitor)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GFileMonitorPrivate] = struct._2
      inline def priv_=(value: Ptr[GFileMonitorPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GFileMonitor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GFileMonitor] = scala.scalanative.unsafe.alloc[_GFileMonitor](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GFileMonitorPrivate])(using Zone): Ptr[_GFileMonitor] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr