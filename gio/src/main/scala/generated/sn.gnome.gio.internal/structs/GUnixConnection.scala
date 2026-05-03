package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixConnection = CArray[CChar, Nat.Digit2[Nat._4, Nat._8]]

object GUnixConnection:
  given _tag: Tag[GUnixConnection] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._8]](Tag.Byte, Tag.Digit2[Nat._4, Nat._8](Tag.Nat4, Tag.Nat8))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GUnixConnection)
      inline def parent_instance: GSocketConnection = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketConnection]]
      inline def parent_instance_=(value: GSocketConnection): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketConnection]] = value
      inline def priv: Ptr[GUnixConnectionPrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixConnectionPrivate]]]
      inline def priv_=(value: Ptr[GUnixConnectionPrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixConnectionPrivate]]] = value
    end extension
  
  // Allocates GUnixConnection on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GUnixConnection] = scala.scalanative.unsafe.alloc[GUnixConnection](1)
  def apply(parent_instance : GSocketConnection, priv : Ptr[GUnixConnectionPrivate])(using Zone): Ptr[GUnixConnection] =
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
    
    res(0) = align(0, alignmentof[GSocketConnection].toInt)
    res(1) = align(res(0) + sizeof[GSocketConnection].toInt, alignmentof[Ptr[GUnixConnectionPrivate]].toInt)
    res
  end offsets