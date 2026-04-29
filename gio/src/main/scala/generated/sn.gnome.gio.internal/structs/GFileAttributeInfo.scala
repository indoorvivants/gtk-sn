package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeInfo: : the #GFileAttributeType type of the attribute. : a set of #GFileAttributeInfoFlags.
*/
opaque type GFileAttributeInfo = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GFileAttributeInfo:
  given _tag: Tag[GFileAttributeInfo] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileAttributeInfo)
      inline def name: CString = !struct.at(offsets(0)).asInstanceOf[Ptr[CString]]
      inline def name_=(value: CString): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[CString]] = value
      inline def `type`: GFileAttributeType = !struct.at(offsets(1)).asInstanceOf[Ptr[GFileAttributeType]]
      inline def type_=(value: GFileAttributeType): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[GFileAttributeType]] = value
      inline def flags: GFileAttributeInfoFlags = !struct.at(offsets(2)).asInstanceOf[Ptr[GFileAttributeInfoFlags]]
      inline def flags_=(value: GFileAttributeInfoFlags): Unit = !struct.at(offsets(2)).asInstanceOf[Ptr[GFileAttributeInfoFlags]] = value
    end extension
  
  // Allocates GFileAttributeInfo on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileAttributeInfo] = scala.scalanative.unsafe.alloc[GFileAttributeInfo](1)
  def apply(name : CString, `type` : GFileAttributeType, flags : GFileAttributeInfoFlags)(using Zone): Ptr[GFileAttributeInfo] =
    val ____ptr = apply()
    (!____ptr).name = name
    (!____ptr).`type` = `type`
    (!____ptr).flags = flags
    ____ptr
  
  val offsets: Array[Int] =
    val res = Array.ofDim[Int](3)
    def align(offset: Int, alignment: Int) = {
      val alignmentMask = alignment - 1
      val padding =
        if ((offset & alignmentMask) == 0) 0
        else alignment - (offset & alignmentMask)
      offset + padding
    }
    
    res(0) = align(0, alignmentof[CString].toInt)
    res(1) = align(res(0) + sizeof[CString].toInt, alignmentof[GFileAttributeType].toInt)
    res(2) = align(res(1) + sizeof[GFileAttributeType].toInt, alignmentof[GFileAttributeInfoFlags].toInt)
    res
  end offsets