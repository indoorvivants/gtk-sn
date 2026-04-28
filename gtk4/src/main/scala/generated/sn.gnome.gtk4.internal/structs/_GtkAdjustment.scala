package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkAdjustment = CStruct1[_root_.sn.gnome.gobject.internal.GInitiallyUnowned]

object _GtkAdjustment:
  given _tag: Tag[_GtkAdjustment] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnowned]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkAdjustment)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnowned): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkAdjustment on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkAdjustment] = scala.scalanative.unsafe.alloc[_GtkAdjustment](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned)(using Zone): Ptr[_GtkAdjustment] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr