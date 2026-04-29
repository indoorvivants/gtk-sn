package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GDataOutputStream = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GDataOutputStream:
  given _tag: Tag[GDataOutputStream] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GDataOutputStream)
      inline def parent_instance: GFilterOutputStream = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterOutputStream]]
      inline def parent_instance_=(value: GFilterOutputStream): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GFilterOutputStream]] = value
      inline def priv: Ptr[GDataOutputStreamPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDataOutputStreamPrivate]]]
      inline def priv_=(value: Ptr[GDataOutputStreamPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GDataOutputStreamPrivate]]] = value
    end extension
  
  // Allocates GDataOutputStream on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GDataOutputStream] = scala.scalanative.unsafe.alloc[GDataOutputStream](1)
  def apply(parent_instance : GFilterOutputStream, priv : Ptr[GDataOutputStreamPrivate])(using Zone): Ptr[GDataOutputStream] =
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
    
    res(0) = align(0, alignmentof[GFilterOutputStream].toInt)
    res(1) = align(res(0) + sizeof[GFilterOutputStream].toInt, alignmentof[Ptr[GDataOutputStreamPrivate]].toInt)
    res
  end offsets