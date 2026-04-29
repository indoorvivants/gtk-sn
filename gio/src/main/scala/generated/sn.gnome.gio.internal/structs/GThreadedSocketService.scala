package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GThreadedSocketService = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GThreadedSocketService:
  given _tag: Tag[GThreadedSocketService] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GThreadedSocketService)
      inline def parent_instance: GSocketService = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketService]]
      inline def parent_instance_=(value: GSocketService): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketService]] = value
      inline def priv: Ptr[GThreadedSocketServicePrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GThreadedSocketServicePrivate]]]
      inline def priv_=(value: Ptr[GThreadedSocketServicePrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GThreadedSocketServicePrivate]]] = value
    end extension
  
  // Allocates GThreadedSocketService on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GThreadedSocketService] = scala.scalanative.unsafe.alloc[GThreadedSocketService](1)
  def apply(parent_instance : GSocketService, priv : Ptr[GThreadedSocketServicePrivate])(using Zone): Ptr[GThreadedSocketService] =
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
    
    res(0) = align(0, alignmentof[GSocketService].toInt)
    res(1) = align(res(0) + sizeof[GSocketService].toInt, alignmentof[Ptr[GThreadedSocketServicePrivate]].toInt)
    res
  end offsets