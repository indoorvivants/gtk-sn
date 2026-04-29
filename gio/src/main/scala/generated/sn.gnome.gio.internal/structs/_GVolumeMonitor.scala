package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GVolumeMonitor = CStruct2[_root_.sn.gnome.gobject.internal.GObject, _root_.sn.gnome.glib.internal.gpointer]

object _GVolumeMonitor:
  given _tag: Tag[_GVolumeMonitor] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, _root_.sn.gnome.glib.internal.gpointer]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GVolumeMonitor)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : _root_.sn.gnome.glib.internal.gpointer = struct._2
      inline def priv_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GVolumeMonitor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GVolumeMonitor] = scala.scalanative.unsafe.alloc[_GVolumeMonitor](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : _root_.sn.gnome.glib.internal.gpointer)(using Zone): Ptr[_GVolumeMonitor] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr