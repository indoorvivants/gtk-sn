package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GNode = CStruct5[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object _GNode:
  given _tag: Tag[_GNode] = Tag.materializeCStruct5Tag[gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GNode)
      inline def data : gpointer = struct._1
      inline def data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[GNode] = struct._2.asInstanceOf[Ptr[GNode]]
      inline def next_=(value: Ptr[GNode]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[GNode] = struct._3.asInstanceOf[Ptr[GNode]]
      inline def prev_=(value: Ptr[GNode]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def parent : Ptr[GNode] = struct._4.asInstanceOf[Ptr[GNode]]
      inline def parent_=(value: Ptr[GNode]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def children : Ptr[GNode] = struct._5.asInstanceOf[Ptr[GNode]]
      inline def children_=(value: Ptr[GNode]): Unit = (!struct.at5 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GNode on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GNode] = scala.scalanative.unsafe.alloc[_GNode](1)
  def apply(data : gpointer, next : Ptr[GNode], prev : Ptr[GNode], parent : Ptr[GNode], children : Ptr[GNode])(using Zone): Ptr[_GNode] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).parent = parent
    (!____ptr).children = children
    ____ptr