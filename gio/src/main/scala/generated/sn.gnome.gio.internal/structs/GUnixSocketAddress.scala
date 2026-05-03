package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixSocketAddress = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GUnixSocketAddress:
  given _tag: Tag[GUnixSocketAddress] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GUnixSocketAddress)
      inline def parent_instance: GSocketAddress = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketAddress]]
      inline def parent_instance_=(value: GSocketAddress): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketAddress]] = value
      inline def priv: Ptr[GUnixSocketAddressPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixSocketAddressPrivate]]]
      inline def priv_=(value: Ptr[GUnixSocketAddressPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixSocketAddressPrivate]]] = value
    end extension
  
  // Allocates GUnixSocketAddress on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GUnixSocketAddress] = scala.scalanative.unsafe.alloc[GUnixSocketAddress](1)
  def apply(parent_instance : GSocketAddress, priv : Ptr[GUnixSocketAddressPrivate])(using Zone): Ptr[GUnixSocketAddress] =
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
    
    res(0) = align(0, alignmentof[GSocketAddress].toInt)
    res(1) = align(res(0) + sizeof[GSocketAddress].toInt, alignmentof[Ptr[GUnixSocketAddressPrivate]].toInt)
    res
  end offsets