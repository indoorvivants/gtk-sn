package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkCellRenderer = CStruct2[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]

object _GtkCellRenderer:
  given _tag: Tag[_GtkCellRenderer] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnowned, Ptr[GtkCellRendererPrivate]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCellRenderer)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnowned): Unit = (!struct.at1 = value)
      inline def priv : Ptr[GtkCellRendererPrivate] = struct._2
      inline def priv_=(value: Ptr[GtkCellRendererPrivate]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkCellRenderer on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCellRenderer] = scala.scalanative.unsafe.alloc[_GtkCellRenderer](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GInitiallyUnowned, priv : Ptr[GtkCellRendererPrivate])(using Zone): Ptr[_GtkCellRenderer] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    (!____ptr).priv = priv
    ____ptr