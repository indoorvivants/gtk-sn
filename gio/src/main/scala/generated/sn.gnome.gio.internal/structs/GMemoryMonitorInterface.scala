package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryMonitorInterface = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]

object GMemoryMonitorInterface:
  given _tag: Tag[GMemoryMonitorInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMemoryMonitorInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
      inline def low_memory_warning: CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit] = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]]]
      inline def low_memory_warning_=(value: CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]]] = value
    end extension
  
  // Allocates GMemoryMonitorInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMemoryMonitorInterface] = scala.scalanative.unsafe.alloc[GMemoryMonitorInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface, low_memory_warning : CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit])(using Zone): Ptr[GMemoryMonitorInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
    (!____ptr).low_memory_warning = low_memory_warning
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt, alignmentof[CFuncPtr2[Ptr[GMemoryMonitor], GMemoryMonitorWarningLevel, Unit]].toInt)
    res
  end offsets