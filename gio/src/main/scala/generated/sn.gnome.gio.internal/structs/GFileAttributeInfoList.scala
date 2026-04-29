package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileAttributeInfoList: : an array of #GFileAttributeInfos. _infos: the number of values in the array.
*/
opaque type GFileAttributeInfoList = CArray[CChar, Nat.Digit2[Nat._1, Nat._6]]

object GFileAttributeInfoList:
  given _tag: Tag[GFileAttributeInfoList] = Tag.CArray[CChar, Nat.Digit2[Nat._1, Nat._6]](Tag.Byte, Tag.Digit2[Nat._1, Nat._6](Tag.Nat1, Tag.Nat6))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileAttributeInfoList)
      inline def infos: Ptr[GFileAttributeInfo] = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[GFileAttributeInfo]]]
      inline def infos_=(value: Ptr[GFileAttributeInfo]): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[Ptr[GFileAttributeInfo]]] = value
      inline def n_infos: CInt = !struct.at(offsets(1)).asInstanceOf[Ptr[CInt]]
      inline def n_infos_=(value: CInt): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[CInt]] = value
    end extension
  
  // Allocates GFileAttributeInfoList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileAttributeInfoList] = scala.scalanative.unsafe.alloc[GFileAttributeInfoList](1)
  def apply(infos : Ptr[GFileAttributeInfo], n_infos : CInt)(using Zone): Ptr[GFileAttributeInfoList] =
    val ____ptr = apply()
    (!____ptr).infos = infos
    (!____ptr).n_infos = n_infos
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
    
    res(0) = align(0, alignmentof[Ptr[GFileAttributeInfo]].toInt)
    res(1) = align(res(0) + sizeof[Ptr[GFileAttributeInfo]].toInt, alignmentof[CInt].toInt)
    res
  end offsets