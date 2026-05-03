package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GMemoryOutputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GMemoryOutputStream:
  given _tag: Tag[GMemoryOutputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GMemoryOutputStream)
      inline def parent_instance: GOutputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GOutputStream]]
      inline def parent_instance_=(value: GOutputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GOutputStream]] = value
      inline def priv: Ptr[GMemoryOutputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GMemoryOutputStreamPrivate]]]
      inline def priv_=(value: Ptr[GMemoryOutputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GMemoryOutputStreamPrivate]]] = value
    end extension
  
  // Allocates GMemoryOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GMemoryOutputStream] = scala.scalanative.unsafe.alloc[GMemoryOutputStream](1)
  def apply(parent_instance : GOutputStream, priv : Ptr[GMemoryOutputStreamPrivate])(using Zone): Ptr[GMemoryOutputStream] =
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
    
    res(0) = align(0, alignmentof[GOutputStream].toInt)
    res(1) = align(res(0) + sizeof[GOutputStream].toInt, alignmentof[Ptr[GMemoryOutputStreamPrivate]].toInt)
    res
  end offsets