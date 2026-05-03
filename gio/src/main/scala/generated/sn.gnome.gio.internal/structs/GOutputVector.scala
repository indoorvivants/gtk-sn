package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GOutputVector = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GOutputVector:
  given _tag: Tag[GOutputVector] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GOutputVector)
      inline def buffer: _root_.sn.gnome.glib.internal.gconstpointer = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gconstpointer]]
      inline def buffer_=(value: _root_.sn.gnome.glib.internal.gconstpointer): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gconstpointer]] = value
      inline def size: _root_.sn.gnome.glib.internal.gsize = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]]
      inline def size_=(value: _root_.sn.gnome.glib.internal.gsize): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.gsize]] = value
    end extension
  
  // Allocates GOutputVector on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GOutputVector] = scala.scalanative.unsafe.alloc[GOutputVector](1)
  def apply(buffer : _root_.sn.gnome.glib.internal.gconstpointer, size : _root_.sn.gnome.glib.internal.gsize)(using Zone): Ptr[GOutputVector] =
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
    
    res(0) = align(0, alignmentof[_root_.sn.gnome.glib.internal.gconstpointer].toInt)
    res(1) = align(res(0) + sizeof[_root_.sn.gnome.glib.internal.gconstpointer].toInt, alignmentof[_root_.sn.gnome.glib.internal.gsize].toInt)
    res
  end offsets