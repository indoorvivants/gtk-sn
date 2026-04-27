package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GSList = CStruct2[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]

object _GSList:
  given _tag: Tag[_GSList] = Tag.materializeCStruct2Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GSList)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GSList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GSList]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GSList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GSList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GSList] = scala.scalanative.unsafe.alloc[_GSList](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, next : Ptr[_root_.sn.gnome.glib.internal.GSList])(using Zone): Ptr[_GSList] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    ____ptr