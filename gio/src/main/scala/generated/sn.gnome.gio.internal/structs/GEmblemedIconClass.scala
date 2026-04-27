package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GEmblemedIconClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]]

object GEmblemedIconClass:
  given _tag: Tag[GEmblemedIconClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._3, Nat._6]](Tag.Byte, Tag.Digit3[Nat._1, Nat._3, Nat._6](Tag.Nat1, Tag.Nat3, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GEmblemedIconClass)
      inline def parent_class: _root_.sn.gnome.gobject.internal.GObjectClass = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]]
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.gobject.internal.GObjectClass]] = value
    end extension
  
  // Allocates GEmblemedIconClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GEmblemedIconClass] = scala.scalanative.unsafe.alloc[GEmblemedIconClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GEmblemedIconClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.gobject.internal.GObjectClass].toInt)
    res
  end offsets