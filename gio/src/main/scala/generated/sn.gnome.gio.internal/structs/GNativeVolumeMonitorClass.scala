package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNativeVolumeMonitorClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]]

object GNativeVolumeMonitorClass:
  given _tag: Tag[GNativeVolumeMonitorClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._4, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._4, Nat._4](Tag.Nat3, Tag.Nat4, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GNativeVolumeMonitorClass)
      inline def parent_class: GVolumeMonitorClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GVolumeMonitorClass]]
      inline def parent_class_=(value: GVolumeMonitorClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GVolumeMonitorClass]] = value
      inline def get_mount_for_mount_path: CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]]]
      inline def get_mount_for_mount_path_=(value: CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]]] = value
    end extension
  
  // Allocates GNativeVolumeMonitorClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GNativeVolumeMonitorClass] = scala.scalanative.unsafe.alloc[GNativeVolumeMonitorClass](1)
  def apply(parent_class : GVolumeMonitorClass, get_mount_for_mount_path : CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]])(using Zone): Ptr[GNativeVolumeMonitorClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_mount_for_mount_path = get_mount_for_mount_path
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](2)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GVolumeMonitorClass].toInt)
    res(1) = align(res(0) + sizeof[GVolumeMonitorClass].toInt, alignmentof[CFuncPtr2[CString, Ptr[GCancellable], Ptr[GMount]]].toInt)
    res
  end offsets