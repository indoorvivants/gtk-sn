package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GSocketService = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GSocketService:
  given _tag: Tag[GSocketService] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GSocketService)
      inline def parent_instance: GSocketListener = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketListener]]
      inline def parent_instance_=(value: GSocketListener): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketListener]] = value
      inline def priv: Ptr[GSocketServicePrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GSocketServicePrivate]]]
      inline def priv_=(value: Ptr[GSocketServicePrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GSocketServicePrivate]]] = value
    end extension
  
  // Allocates GSocketService on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GSocketService] = scala.scalanative.unsafe.alloc[GSocketService](1)
  def apply(parent_instance : GSocketListener, priv : Ptr[GSocketServicePrivate])(using Zone): Ptr[GSocketService] =
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
    
    res(0) = align(0, alignmentof[GSocketListener].toInt)
    res(1) = align(res(0) + sizeof[GSocketListener].toInt, alignmentof[Ptr[GSocketServicePrivate]].toInt)
    res
  end offsets