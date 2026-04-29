package sn.gnome.glib.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSList = CStruct2[gpointer, Ptr[Byte]]

object _GSList:
  given _tag: Tag[_GSList] = Tag.materializeCStruct2Tag[gpointer, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSList)
      inline def data : gpointer = struct._1
      inline def data_=(value: gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[GSList] = struct._2.asInstanceOf[Ptr[GSList]]
      inline def next_=(value: Ptr[GSList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GSList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSList] = scala.scalanative.unsafe.alloc[_GSList](1)
  def apply(data : gpointer, next : Ptr[GSList])(using Zone): Ptr[_GSList] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    ____ptr