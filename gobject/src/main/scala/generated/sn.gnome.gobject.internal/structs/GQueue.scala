package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GQueue: : a pointer to the first element of the queue : a pointer to the last element of the queue : the number of elements in the queue
*/
opaque type GQueue = CStruct3[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint]

object GQueue:
  given _tag: Tag[GQueue] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], _root_.sn.gnome.glib.internal.guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GQueue)
      inline def head : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._1.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def head_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def tail : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def tail_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def length : _root_.sn.gnome.glib.internal.guint = struct._3
      inline def length_=(value: _root_.sn.gnome.glib.internal.guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GQueue on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GQueue] = scala.scalanative.unsafe.alloc[GQueue](1)
  def apply(head : Ptr[_root_.sn.gnome.glib.internal.GList], tail : Ptr[_root_.sn.gnome.glib.internal.GList], length : _root_.sn.gnome.glib.internal.guint)(using Zone): Ptr[GQueue] =
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).tail = tail
    (!____ptr).length = length
    ____ptr