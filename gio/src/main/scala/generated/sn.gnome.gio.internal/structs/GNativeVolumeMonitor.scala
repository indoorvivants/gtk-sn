package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNativeVolumeMonitor = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GNativeVolumeMonitor:
  given _tag: Tag[GNativeVolumeMonitor] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GNativeVolumeMonitor)
      inline def parent_instance: GVolumeMonitor = !struct.at(offsets(0)).asInstanceOf[Ptr[GVolumeMonitor]]
      inline def parent_instance_=(value: GVolumeMonitor): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GVolumeMonitor]] = value
    end extension
  
  // Allocates GNativeVolumeMonitor on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GNativeVolumeMonitor] = scala.scalanative.unsafe.alloc[GNativeVolumeMonitor](1)
  def apply(parent_instance : GVolumeMonitor)(using Zone): Ptr[GNativeVolumeMonitor] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](1)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GVolumeMonitor].toInt)
    res
  end offsets