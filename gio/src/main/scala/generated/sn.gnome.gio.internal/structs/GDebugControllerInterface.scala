package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDebugControllerInterface: _iface: The parent interface.
*/
opaque type GDebugControllerInterface = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GDebugControllerInterface:
  given _tag: Tag[GDebugControllerInterface] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDebugControllerInterface)
      inline def g_iface: _root_.sn.gnome.gobject.internal.GTypeInterface = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]]
      inline def g_iface_=(value: _root_.sn.gnome.gobject.internal.GTypeInterface): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GTypeInterface]] = value
    end extension
  
  // Allocates GDebugControllerInterface on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDebugControllerInterface] = scala.scalanative.unsafe.alloc[GDebugControllerInterface](1)
  def apply(g_iface : _root_.sn.gnome.gobject.internal.GTypeInterface)(using Zone): Ptr[GDebugControllerInterface] =
    val ____ptr = apply()
    (!____ptr).g_iface = g_iface
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GTypeInterface].toInt)
    res
  end offsets