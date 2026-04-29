package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GFilterInputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GFilterInputStream:
  given _tag: Tag[GFilterInputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GFilterInputStream)
      inline def parent_instance: GInputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GInputStream]]
      inline def parent_instance_=(value: GInputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GInputStream]] = value
      inline def base_stream: Ptr[GInputStream] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GInputStream]]]
      inline def base_stream_=(value: Ptr[GInputStream]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GInputStream]]] = value
    end extension
  
  // Allocates GFilterInputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GFilterInputStream] = scala.scalanative.unsafe.alloc[GFilterInputStream](1)
  def apply(parent_instance : GInputStream, base_stream : Ptr[GInputStream])(using Zone): Ptr[GFilterInputStream] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).base_stream = base_stream
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
    res(1) = align(res(0) + sizeof[GInputStream].toInt, alignmentof[Ptr[GInputStream]].toInt)
    res
  end offsets