package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyAddressEnumerator = CArray[CChar, Nat.Digit2[Nat._3, Nat._2]]

object GProxyAddressEnumerator:
  given _tag: Tag[GProxyAddressEnumerator] = Tag.CArray[CChar, Nat.Digit2[Nat._3, Nat._2]](Tag.Byte, Tag.Digit2[Nat._3, Nat._2](Tag.Nat3, Tag.Nat2))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GProxyAddressEnumerator)
      inline def parent_instance: GSocketAddressEnumerator = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketAddressEnumerator]]
      inline def parent_instance_=(value: GSocketAddressEnumerator): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketAddressEnumerator]] = value
      inline def priv: Ptr[GProxyAddressEnumeratorPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GProxyAddressEnumeratorPrivate]]]
      inline def priv_=(value: Ptr[GProxyAddressEnumeratorPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GProxyAddressEnumeratorPrivate]]] = value
    end extension
  
  // Allocates GProxyAddressEnumerator on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GProxyAddressEnumerator] = scala.scalanative.unsafe.alloc[GProxyAddressEnumerator](1)
  def apply(parent_instance : GSocketAddressEnumerator, priv : Ptr[GProxyAddressEnumeratorPrivate])(using Zone): Ptr[GProxyAddressEnumerator] =
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
    
    res(0) = align(0, alignmentof[GSocketAddressEnumerator].toInt)
    res(1) = align(res(0) + sizeof[GSocketAddressEnumerator].toInt, alignmentof[Ptr[GProxyAddressEnumeratorPrivate]].toInt)
    res
  end offsets