package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GMountOperation = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GMountOperationPrivate]]

object _GMountOperation:
  given _tag: Tag[_GMountOperation] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GMountOperationPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GMountOperation)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GMountOperationPrivate] = struct._2
      inline def priv_=(value: Ptr[GMountOperationPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GMountOperation on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GMountOperation] = scala.scalanative.unsafe.alloc[_GMountOperation](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GMountOperationPrivate])(using Zone): Ptr[_GMountOperation] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr