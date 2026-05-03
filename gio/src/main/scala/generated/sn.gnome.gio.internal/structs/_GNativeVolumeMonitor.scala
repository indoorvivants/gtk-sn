package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GNativeVolumeMonitor = CStruct1[GVolumeMonitor]

object _GNativeVolumeMonitor:
  given _tag: Tag[_GNativeVolumeMonitor] = Tag.materializeCStruct1Tag[GVolumeMonitor]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GNativeVolumeMonitor)
      inline def parent_instance : GVolumeMonitor = struct._1
      inline def parent_instance_=(value: GVolumeMonitor): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GNativeVolumeMonitor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GNativeVolumeMonitor] = scala.scalanative.unsafe.alloc[_GNativeVolumeMonitor](1)
  def apply(parent_instance : GVolumeMonitor)(using Zone): Ptr[_GNativeVolumeMonitor] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr