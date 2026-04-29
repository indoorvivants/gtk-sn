package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTrashStack = CStruct1[Ptr[Byte]]

object GTrashStack:
  given _tag: Tag[GTrashStack] = Tag.materializeCStruct1Tag[Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GTrashStack)
      inline def next : Ptr[GTrashStack] = struct._1.asInstanceOf[Ptr[GTrashStack]]
      inline def next_=(value: Ptr[GTrashStack]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GTrashStack on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GTrashStack] = scala.scalanative.unsafe.alloc[GTrashStack](1)
  def apply(next : Ptr[GTrashStack])(using Zone): Ptr[GTrashStack] =
    val ____ptr = apply()
    (!____ptr).next = next
    ____ptr