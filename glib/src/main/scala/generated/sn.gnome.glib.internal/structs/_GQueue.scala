package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GQueue: : a pointer to the first element of the queue : a pointer to the last element of the queue : the number of elements in the queue
*/
opaque type _GQueue = CStruct3[Ptr[Byte], Ptr[Byte], guint]

object _GQueue:
  given _tag: Tag[_GQueue] = Tag.materializeCStruct3Tag[Ptr[Byte], Ptr[Byte], guint]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GQueue)
      inline def head : Ptr[GList] = struct._1.asInstanceOf[Ptr[GList]]
      inline def head_=(value: Ptr[GList]): Unit = (!struct.at1 = value.asInstanceOf[Ptr[Byte]])
      inline def tail : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
      inline def tail_=(value: Ptr[GList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def length : guint = struct._3
      inline def length_=(value: guint): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GQueue on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GQueue] = scala.scalanative.unsafe.alloc[_GQueue](1)
  def apply(head : Ptr[GList], tail : Ptr[GList], length : guint)(using Zone): Ptr[_GQueue] =
    val ____ptr = apply()
    (!____ptr).head = head
    (!____ptr).tail = tail
    (!____ptr).length = length
    ____ptr