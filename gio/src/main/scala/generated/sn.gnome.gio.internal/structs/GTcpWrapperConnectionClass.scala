package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTcpWrapperConnectionClass = CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]]

object GTcpWrapperConnectionClass:
  given _tag: Tag[GTcpWrapperConnectionClass] = Tag.CArray[CChar, Nat.Digit3[Nat._3, Nat._0, Nat._4]](Tag.Byte, Tag.Digit3[Nat._3, Nat._0, Nat._4](Tag.Nat3, Tag.Nat0, Tag.Nat4))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTcpWrapperConnectionClass)
      inline def parent_class: GTcpConnectionClass = !struct.at(offsets(0)).asInstanceOf[Ptr[GTcpConnectionClass]]
      inline def parent_class_=(value: GTcpConnectionClass): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GTcpConnectionClass]] = value
    end extension
  
  // Allocates GTcpWrapperConnectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTcpWrapperConnectionClass] = scala.scalanative.unsafe.alloc[GTcpWrapperConnectionClass](1)
  def apply(parent_class : GTcpConnectionClass)(using Zone): Ptr[GTcpWrapperConnectionClass] =
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
    
    res(0) = align(0, alignmentof[GTcpConnectionClass].toInt)
    res
  end offsets