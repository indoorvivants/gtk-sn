package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GConverterInputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GConverterInputStream:
  given _tag: Tag[GConverterInputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GConverterInputStream)
      inline def parent_instance: GFilterInputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStream]]
      inline def parent_instance_=(value: GFilterInputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterInputStream]] = value
      inline def priv: Ptr[GConverterInputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GConverterInputStreamPrivate]]]
      inline def priv_=(value: Ptr[GConverterInputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GConverterInputStreamPrivate]]] = value
    end extension
  
  // Allocates GConverterInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GConverterInputStream] = scala.scalanative.unsafe.alloc[GConverterInputStream](1)
  def apply(parent_instance : GFilterInputStream, priv : Ptr[GConverterInputStreamPrivate])(using Zone): Ptr[GConverterInputStream] =
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
    
    res(0) = align(0, alignmentof[GFilterInputStream].toInt)
    res(1) = align(res(0) + sizeof[GFilterInputStream].toInt, alignmentof[Ptr[GConverterInputStreamPrivate]].toInt)
    res
  end offsets