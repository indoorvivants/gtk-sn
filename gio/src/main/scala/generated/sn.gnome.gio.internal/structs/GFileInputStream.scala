package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFileInputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GFileInputStream:
  given _tag: Tag[GFileInputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFileInputStream)
      inline def parent_instance: GInputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GInputStream]]
      inline def parent_instance_=(value: GInputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GInputStream]] = value
      inline def priv: Ptr[GFileInputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GFileInputStreamPrivate]]]
      inline def priv_=(value: Ptr[GFileInputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GFileInputStreamPrivate]]] = value
    end extension
  
  // Allocates GFileInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFileInputStream] = scala.scalanative.unsafe.alloc[GFileInputStream](1)
  def apply(parent_instance : GInputStream, priv : Ptr[GFileInputStreamPrivate])(using Zone): Ptr[GFileInputStream] =
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
    
    res(0) = align(0, alignmentof[GInputStream].toInt)
    res(1) = align(res(0) + sizeof[GInputStream].toInt, alignmentof[Ptr[GFileInputStreamPrivate]].toInt)
    res
  end offsets