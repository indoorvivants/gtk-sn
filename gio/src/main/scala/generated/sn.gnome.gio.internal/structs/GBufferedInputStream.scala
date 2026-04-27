package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GBufferedInputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GBufferedInputStream:
  given _tag: Tag[GBufferedInputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GBufferedInputStream)
      inline def parent_instance: GFilterInputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStream]]
      inline def parent_instance_=(value: GFilterInputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStream]] = value
      inline def priv: Ptr[GBufferedInputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GBufferedInputStreamPrivate]]]
      inline def priv_=(value: Ptr[GBufferedInputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GBufferedInputStreamPrivate]]] = value
    end extension
  
  // Allocates GBufferedInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GBufferedInputStream] = scala.scalanative.unsafe.alloc[GBufferedInputStream](1)
  def apply(parent_instance : GFilterInputStream, priv : Ptr[GBufferedInputStreamPrivate])(using Zone): Ptr[GBufferedInputStream] =
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
    
    res(0) = align(0, alignmentof[GFilterInputStream].toInt)
    res(1) = align(res(0) + sizeof[GFilterInputStream].toInt, alignmentof[Ptr[GBufferedInputStreamPrivate]].toInt)
    res
  end offsets