package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GTrashStack = CStruct1[Ptr[Byte]]

object _GTrashStack:
  given _tag: Tag[_GTrashStack] = Tag.materializeCStruct1Tag[Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GTrashStack)
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GTrashStack] = struct._1.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GTrashStack]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GTrashStack]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GTrashStack on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GTrashStack] = scala.scalanative.unsafe.alloc[_GTrashStack](1)
  def apply(next : Ptr[_root_.sn.gnome.glib.internal.GTrashStack])(using Zone): Ptr[_GTrashStack] =
    val ____ptr = apply()
    (!____ptr).next = next
    ____ptr