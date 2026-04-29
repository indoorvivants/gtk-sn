package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDataInputStream = CArray[CChar, Nat.Digit2[Nat._5, Nat._6]]

object GDataInputStream:
  given _tag: Tag[GDataInputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._5, Nat._6]](Tag.Byte, Tag.Digit2[Nat._5, Nat._6](Tag.Nat5, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDataInputStream)
      inline def parent_instance: GBufferedInputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GBufferedInputStream]]
      inline def parent_instance_=(value: GBufferedInputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GBufferedInputStream]] = value
      inline def priv: Ptr[GDataInputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDataInputStreamPrivate]]]
      inline def priv_=(value: Ptr[GDataInputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDataInputStreamPrivate]]] = value
    end extension
  
  // Allocates GDataInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDataInputStream] = scala.scalanative.unsafe.alloc[GDataInputStream](1)
  def apply(parent_instance : GBufferedInputStream, priv : Ptr[GDataInputStreamPrivate])(using Zone): Ptr[GDataInputStream] =
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
    
    res(0) = align(0, alignmentof[GBufferedInputStream].toInt)
    res(1) = align(res(0) + sizeof[GBufferedInputStream].toInt, alignmentof[Ptr[GDataInputStreamPrivate]].toInt)
    res
  end offsets