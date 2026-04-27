package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketConnection = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GSocketConnection:
  given _tag: Tag[GSocketConnection] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketConnection)
      inline def parent_instance: GIOStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStream]]
      inline def parent_instance_=(value: GIOStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GIOStream]] = value
      inline def priv: Ptr[GSocketConnectionPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GSocketConnectionPrivate]]]
      inline def priv_=(value: Ptr[GSocketConnectionPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GSocketConnectionPrivate]]] = value
    end extension
  
  // Allocates GSocketConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketConnection] = scala.scalanative.unsafe.alloc[GSocketConnection](1)
  def apply(parent_instance : GIOStream, priv : Ptr[GSocketConnectionPrivate])(using Zone): Ptr[GSocketConnection] =
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
    res(1) = align(res(0) + sizeof[GIOStream].toInt, alignmentof[Ptr[GSocketConnectionPrivate]].toInt)
    res
  end offsets