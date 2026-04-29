package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GUnixCredentialsMessage = CArray[CChar, Nat.Digit2[Nat._4, Nat._0]]

object GUnixCredentialsMessage:
  given _tag: Tag[GUnixCredentialsMessage] = Tag.CArray[CChar, Nat.Digit2[Nat._4, Nat._0]](Tag.Byte, Tag.Digit2[Nat._4, Nat._0](Tag.Nat4, Tag.Nat0))
  
  export fields.*
  private[internal] object fields:
    extension (struct: GUnixCredentialsMessage)
      inline def parent_instance: GSocketControlMessage = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketControlMessage]]
      inline def parent_instance_=(value: GSocketControlMessage): Unit = !struct.at(offsets(0)).asInstanceOf[Ptr[GSocketControlMessage]] = value
      inline def priv: Ptr[GUnixCredentialsMessagePrivate] = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixCredentialsMessagePrivate]]]
      inline def priv_=(value: Ptr[GUnixCredentialsMessagePrivate]): Unit = !struct.at(offsets(1)).asInstanceOf[Ptr[Ptr[GUnixCredentialsMessagePrivate]]] = value
    end extension
  
  // Allocates GUnixCredentialsMessage on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GUnixCredentialsMessage] = scala.scalanative.unsafe.alloc[GUnixCredentialsMessage](1)
  def apply(parent_instance : GSocketControlMessage, priv : Ptr[GUnixCredentialsMessagePrivate])(using Zone): Ptr[GUnixCredentialsMessage] =
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
    
    res(0) = align(0, alignmentof[GSocketControlMessage].toInt)
    res(1) = align(res(0) + sizeof[GSocketControlMessage].toInt, alignmentof[Ptr[GUnixCredentialsMessagePrivate]].toInt)
    res
  end offsets