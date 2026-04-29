package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GIOStream = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GIOStream:
  given _tag: Tag[GIOStream] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GIOStream)
      inline def parent_instance: _root_.sn.gnome.gobject.internal.GObject = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]] = value
      inline def priv: Ptr[GIOStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GIOStreamPrivate]]]
      inline def priv_=(value: Ptr[GIOStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GIOStreamPrivate]]] = value
    end extension
  
  // Allocates GIOStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GIOStream] = scala.scalanative.unsafe.alloc[GIOStream](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GIOStreamPrivate])(using Zone): Ptr[GIOStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObject].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObject].toInt, alignmentof[Ptr[GIOStreamPrivate]].toInt)
    res
  end offsets