package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketAddressEnumerator = CArray[CChar, Nat.Digit2[Nat._2, Nat._4]]

object GSocketAddressEnumerator:
  given _tag: Tag[GSocketAddressEnumerator] = Tag.CArray[CChar, Nat.Digit2[Nat._2, Nat._4]](Tag.Byte, Tag.Digit2[Nat._2, Nat._4](Tag.Nat2, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketAddressEnumerator)
      inline def parent_instance: _root_.sn.gnome.gobject.internal.GObject = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]] = value
    end extension
  
  // Allocates GSocketAddressEnumerator on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketAddressEnumerator] = scala.scalanative.unsafe.alloc[GSocketAddressEnumerator](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[GSocketAddressEnumerator] =
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObject].toInt)
    res
  end offsets