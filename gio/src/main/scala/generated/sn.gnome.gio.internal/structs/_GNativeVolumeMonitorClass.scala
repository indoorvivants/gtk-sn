package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GNativeVolumeMonitorClass = CStruct2[GVolumeMonitorClass, CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]]

object _GNativeVolumeMonitorClass:
  given _tag: Tag[_GNativeVolumeMonitorClass] = Tag.materializeCStruct2Tag[GVolumeMonitorClass, CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GNativeVolumeMonitorClass)
      inline def parent_class : GVolumeMonitorClass = struct._1
      inline def parent_class_=(value: GVolumeMonitorClass): Unit = (!struct.at1 = value)
      inline def get_mount_for_mount_path : CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]] = struct._2
      inline def get_mount_for_mount_path_=(value: CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GNativeVolumeMonitorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GNativeVolumeMonitorClass] = scala.scalanative.unsafe.alloc[_GNativeVolumeMonitorClass](1)
  def apply(parent_class : GVolumeMonitorClass, get_mount_for_mount_path : CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]])(using Zone): Ptr[_GNativeVolumeMonitorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_mount_for_mount_path = get_mount_for_mount_path
    ____ptr