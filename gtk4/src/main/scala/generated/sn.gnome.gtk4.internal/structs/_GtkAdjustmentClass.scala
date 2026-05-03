package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkAdjustmentClass = CStruct7[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object _GtkAdjustmentClass:
  given _tag: Tag[_GtkAdjustmentClass] = Tag.materializeCStruct7Tag[_root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr1[Ptr[GtkAdjustment], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkAdjustmentClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = (!struct.at2 = value)
      inline def value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit] = struct._3
      inline def value_changed_=(value: CFuncPtr1[Ptr[GtkAdjustment], Unit]): Unit = (!struct.at3 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._6
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._7
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at7 = value)
    end extension
  
  // Allocates _GtkAdjustmentClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkAdjustmentClass] = scala.scalanative.unsafe.alloc[_GtkAdjustmentClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GInitiallyUnownedClass, changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], value_changed : CFuncPtr1[Ptr[GtkAdjustment], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[_GtkAdjustmentClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr).value_changed = value_changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr