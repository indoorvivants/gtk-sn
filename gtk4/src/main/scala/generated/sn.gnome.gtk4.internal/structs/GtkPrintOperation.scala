package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkPrintOperation = CStruct2[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkPrintOperationPrivate]]

object GtkPrintOperation:
  given _tag: Tag[GtkPrintOperation] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GObject, Ptr[GtkPrintOperationPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkPrintOperation)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkPrintOperationPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkPrintOperationPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkPrintOperation on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkPrintOperation] = scala.scalanative.unsafe.alloc[GtkPrintOperation](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject, priv : Ptr[GtkPrintOperationPrivate])(using Zone): Ptr[GtkPrintOperation] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr