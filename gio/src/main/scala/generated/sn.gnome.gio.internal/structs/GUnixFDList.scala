package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixFDList = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GUnixFDList:
  given _tag: Tag[GUnixFDList] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GUnixFDList)
      inline def parent_instance: _root_.sn.gnome.gobject.internal.GObject = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]]
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObject]] = value
      inline def priv: Ptr[GUnixFDListPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixFDListPrivate]]]
      inline def priv_=(value: Ptr[GUnixFDListPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixFDListPrivate]]] = value
    end extension
  
  // Allocates GUnixFDList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GUnixFDList] = scala.scalanative.unsafe.alloc[GUnixFDList](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GUnixFDListPrivate])(using Zone): Ptr[GUnixFDList] =
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
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObject].toInt, alignmentof[Ptr[GUnixFDListPrivate]].toInt)
    res
  end offsets