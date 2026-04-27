package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GList = CStruct3[gpointer, Ptr[Byte], Ptr[Byte]]

object GList:
  given _tag: Tag[GList] = Tag.materializeCStruct3Tag[gpointer, Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GList)
      inline def data : gpointer = struct._1
      inline def data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[GList] = struct._2.asInstanceOf[Ptr[GList]]
      inline def next_=(value: Ptr[GList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[GList] = struct._3.asInstanceOf[Ptr[GList]]
      inline def prev_=(value: Ptr[GList]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates GList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GList] = scala.scalanative.unsafe.alloc[GList](1)
  def apply(data : gpointer, next : Ptr[GList], prev : Ptr[GList])(using Zone): Ptr[GList] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr