package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyAddress = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GProxyAddress:
  given _tag: Tag[GProxyAddress] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GProxyAddress)
      inline def parent_instance: GInetSocketAddress = !struct.at(offsets(0)).asInstanceOf[Ptr[GInetSocketAddress]]
      inline def parent_instance_=(value: GInetSocketAddress): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GInetSocketAddress]] = value
      inline def priv: Ptr[GProxyAddressPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GProxyAddressPrivate]]]
      inline def priv_=(value: Ptr[GProxyAddressPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GProxyAddressPrivate]]] = value
    end extension
  
  // Allocates GProxyAddress on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GProxyAddress] = scala.scalanative.unsafe.alloc[GProxyAddress](1)
  def apply(parent_instance : GInetSocketAddress, priv : Ptr[GProxyAddressPrivate])(using Zone): Ptr[GProxyAddress] =
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
    
    res(0) = align(0, alignmentof[GInetSocketAddress].toInt)
    res(1) = align(res(0) + sizeof[GInetSocketAddress].toInt, alignmentof[Ptr[GProxyAddressPrivate]].toInt)
    res
  end offsets