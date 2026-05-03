package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRenderer = CStruct2[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]

object GtkCellRenderer:
  given _tag: Tag[GtkCellRenderer] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCellRenderer)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnowned): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkCellRendererPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkCellRendererPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates GtkCellRenderer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCellRenderer] = scala.scalanative.unsafe.alloc[GtkCellRenderer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned, priv : Ptr[GtkCellRendererPrivate])(using Zone): Ptr[GtkCellRenderer] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr