package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GNode = CStruct5[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]

object GNode:
  given _tag: Tag[GNode] = Tag.materializeCStruct5Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GNode)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GNode] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GNode]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GNode]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[_root_.sn.gnome.glib.internal.GNode] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GNode]]
      inline def prev_=(value: Ptr[_root_.sn.gnome.glib.internal.GNode]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
      inline def parent : Ptr[_root_.sn.gnome.glib.internal.GNode] = struct._4.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GNode]]
      inline def parent_=(value: Ptr[_root_.sn.gnome.glib.internal.GNode]): Unit = (!struct.at4 = value.asInstanceOf[Ptr[Byte]])
      inline def children : Ptr[_root_.sn.gnome.glib.internal.GNode] = struct._5.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GNode]]
      inline def children_=(value: Ptr[_root_.sn.gnome.glib.internal.GNode]): Unit = (!struct.at5 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GNode on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GNode] = scala.scalanative.unsafe.alloc[GNode](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, next : Ptr[_root_.sn.gnome.glib.internal.GNode], prev : Ptr[_root_.sn.gnome.glib.internal.GNode], parent : Ptr[_root_.sn.gnome.glib.internal.GNode], children : Ptr[_root_.sn.gnome.glib.internal.GNode])(using Zone): Ptr[GNode] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    (!____ptr).parent = parent
    (!____ptr).children = children
    ____ptr