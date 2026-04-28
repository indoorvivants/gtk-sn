package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellArea = CStruct1[_root_.sn.gnome.gobject.internal.GInitiallyUnowned]

object GtkCellArea:
  given _tag: Tag[GtkCellArea] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnowned]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCellArea)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnowned): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkCellArea on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCellArea] = scala.scalanative.unsafe.alloc[GtkCellArea](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned)(using Zone): Ptr[GtkCellArea] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr