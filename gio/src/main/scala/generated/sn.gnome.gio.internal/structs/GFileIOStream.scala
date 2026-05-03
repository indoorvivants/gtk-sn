package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileIOStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GFileIOStream:
  given _tag: Tag[GFileIOStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileIOStream)
      inline def parent_instance: GIOStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStream]]
      inline def parent_instance_=(value: GIOStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStream]] = value
      inline def priv: Ptr[GFileIOStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GFileIOStreamPrivate]]]
      inline def priv_=(value: Ptr[GFileIOStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GFileIOStreamPrivate]]] = value
    end extension
  
  // Allocates GFileIOStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileIOStream] = scala.scalanative.unsafe.alloc[GFileIOStream](1)
  def apply(parent_instance : GIOStream, priv : Ptr[GFileIOStreamPrivate])(using Zone): Ptr[GFileIOStream] =
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
    
    res(0) = align(0, alignmentof[GIOStream].toInt)
    res(1) = align(res(0) + sizeof[GIOStream].toInt, alignmentof[Ptr[GFileIOStreamPrivate]].toInt)
    res
  end offsets