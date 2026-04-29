package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTcpConnection = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GTcpConnection:
  given _tag: Tag[GTcpConnection] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTcpConnection)
      inline def parent_instance: GSocketConnection = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketConnection]]
      inline def parent_instance_=(value: GSocketConnection): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketConnection]] = value
      inline def priv: Ptr[GTcpConnectionPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GTcpConnectionPrivate]]]
      inline def priv_=(value: Ptr[GTcpConnectionPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GTcpConnectionPrivate]]] = value
    end extension
  
  // Allocates GTcpConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTcpConnection] = scala.scalanative.unsafe.alloc[GTcpConnection](1)
  def apply(parent_instance : GSocketConnection, priv : Ptr[GTcpConnectionPrivate])(using Zone): Ptr[GTcpConnection] =
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
    
    res(0) = align(0, alignmentof[GSocketConnection].toInt)
    res(1) = align(res(0) + sizeof[GSocketConnection].toInt, alignmentof[Ptr[GTcpConnectionPrivate]].toInt)
    res
  end offsets