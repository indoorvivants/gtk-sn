package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkRecentManagerClass:
*/
opaque type _GtkRecentManagerClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkRecentManagerClass:
  given _tag: Tag[_GtkRecentManagerClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkRecentManager], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkRecentManagerClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GtkRecentManager], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GtkRecentManager], Unit]): Unit = (!struct.at2 = value)
      inline def _gtk_recent1 : CFuncPtr0[Unit] = struct._3
      inline def _gtk_recent1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _gtk_recent2 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_recent2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_recent3 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_recent3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _gtk_recent4 : CFuncPtr0[Unit] = struct._6
      inline def _gtk_recent4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GtkRecentManagerClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkRecentManagerClass] = scala.scalanative.unsafe.alloc[_GtkRecentManagerClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, changed : CFuncPtr1[Ptr[GtkRecentManager], Unit], _gtk_recent1 : CFuncPtr0[Unit], _gtk_recent2 : CFuncPtr0[Unit], _gtk_recent3 : CFuncPtr0[Unit], _gtk_recent4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkRecentManagerClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_recent1 = _gtk_recent1
    (!____ptr)._gtk_recent2 = _gtk_recent2
    (!____ptr)._gtk_recent3 = _gtk_recent3
    (!____ptr)._gtk_recent4 = _gtk_recent4
    ____ptr