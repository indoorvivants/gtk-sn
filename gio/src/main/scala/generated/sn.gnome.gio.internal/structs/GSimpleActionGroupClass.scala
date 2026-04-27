package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSimpleActionGroupClass = CArray[CChar, Nat.Digit3[Nat._2, Nat._3, Nat._2]]

object GSimpleActionGroupClass:
  given _tag: Tag[GSimpleActionGroupClass] = Tag.CArray[CChar, Nat.Digit3[Nat._2, Nat._3, Nat._2]](Tag.Byte, Tag.Digit3[Nat._2, Nat._3, Nat._2](Tag.Nat2, Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSimpleActionGroupClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
      inline def padding: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]] = !struct.at(offsets(1)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]]
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]]]] = value
    end extension
  
  // Allocates GSimpleActionGroupClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSimpleActionGroupClass] = scala.scalanative.unsafe.alloc[GSimpleActionGroupClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat.Digit2[Nat._1, Nat._2]])(using Zone): Ptr[GSimpleActionGroupClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res
  end offsets