package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkMountOperation = CStruct2[_root_.sn.gnome.gio.internal.GMountOperation, Ptr[GtkMountOperationPrivate]]

object _GtkMountOperation:
  given _tag: Tag[_GtkMountOperation] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gio.internal.GMountOperation, Ptr[GtkMountOperationPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkMountOperation)
      inline def parent_instance : _root_.sn.gnome.gio.internal.GMountOperation = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gio.internal.GMountOperation): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkMountOperationPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkMountOperationPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkMountOperation on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkMountOperation] = scala.scalanative.unsafe.alloc[_GtkMountOperation](1)
  def apply(parent_instance : _root_.sn.gnome.gio.internal.GMountOperation, priv : Ptr[GtkMountOperationPrivate])(using Zone): Ptr[_GtkMountOperation] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr