package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GList = CStruct3[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte]]

object _GList:
  given _tag: Tag[_GList] = Tag.materializeCStruct3Tag[_root_.sn.gnome.glib.internal.gpointer, Ptr[Byte], Ptr[Byte]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GList)
      inline def data : _root_.sn.gnome.glib.internal.gpointer = struct._1
      inline def data_=(value: _root_.sn.gnome.glib.internal.gpointer): Unit = (!struct.at1 = value)
      inline def next : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._2.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def next_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at2 = value.asInstanceOf[Ptr[Byte]])
      inline def prev : Ptr[_root_.sn.gnome.glib.internal.GList] = struct._3.asInstanceOf[Ptr[_root_.sn.gnome.glib.internal.GList]]
      inline def prev_=(value: Ptr[_root_.sn.gnome.glib.internal.GList]): Unit = (!struct.at3 = value.asInstanceOf[Ptr[Byte]])
    end extension
  
  // Allocates _GList on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GList] = scala.scalanative.unsafe.alloc[_GList](1)
  def apply(data : _root_.sn.gnome.glib.internal.gpointer, next : Ptr[_root_.sn.gnome.glib.internal.GList], prev : Ptr[_root_.sn.gnome.glib.internal.GList])(using Zone): Ptr[_GList] =
    val ____ptr = apply()
    (!____ptr).data = data
    (!____ptr).next = next
    (!____ptr).prev = prev
    ____ptr