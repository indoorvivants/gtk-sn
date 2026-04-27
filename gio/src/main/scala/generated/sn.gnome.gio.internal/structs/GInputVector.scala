package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GInputVector = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GInputVector:
  given _tag: Tag[GInputVector] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GInputVector)
      inline def buffer: _root_.sn.gnome.glib.internal.gpointer = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]]
      inline def buffer_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gpointer]] = value
      inline def size: _root_.sn.gnome.glib.internal.gsize = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
      inline def size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
    end extension
  
  // Allocates GInputVector on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GInputVector] = scala.scalanative.unsafe.alloc[GInputVector](1)
  def apply(buffer : _root_.sn.gnome.glib.internal.gpointer, size : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[GInputVector] =
    val ____ptr = apply()
    (!____ptr).buffer = buffer
    (!____ptr).size = size
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.glib.internal.gpointer].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.glib.internal.gpointer].toInt, alignmentof[_root_.sn.gnome.glib.internal.gsize].toInt)
    res
  end offsets