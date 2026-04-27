package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GProxyAddressClass = CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]]

object GProxyAddressClass:
  given _tag: Tag[GProxyAddressClass] = Tag.CArray[CChar, Nat.Digit3[Nat._1, Nat._6, Nat._0]](Tag.Byte, Tag.Digit3[Nat._1, Nat._6, Nat._0](Tag.Nat1, Tag.Nat6, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GProxyAddressClass)
      inline def parent_class: GInetSocketAddressClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GInetSocketAddressClass]]
      inline def parent_class_=(value: GInetSocketAddressClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GInetSocketAddressClass]] = value
    end extension
  
  // Allocates GProxyAddressClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GProxyAddressClass] = scala.scalanative.unsafe.alloc[GProxyAddressClass](1)
  def apply(parent_class : GInetSocketAddressClass)(using Zone): Ptr[GProxyAddressClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](1)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[GInetSocketAddressClass].toInt)
    res
  end offsets