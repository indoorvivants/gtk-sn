package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStyleContextClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]

object GtkStyleContextClass:
  given _tag: Tag[GtkStyleContextClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr1[Ptr[GtkStyleContext], Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit], CFuncPtr0[Unit]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkStyleContextClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def changed : CFuncPtr1[Ptr[GtkStyleContext], Unit] = struct._2
      inline def changed_=(value: CFuncPtr1[Ptr[GtkStyleContext], Unit]): Unit = (!struct.at2 = value)
      inline def _gtk_reserved1 : CFuncPtr0[Unit] = struct._3
      inline def _gtk_reserved1_=(value: CFuncPtr0[Unit]): Unit = (!struct.at3 = value)
      inline def _gtk_reserved2 : CFuncPtr0[Unit] = struct._4
      inline def _gtk_reserved2_=(value: CFuncPtr0[Unit]): Unit = (!struct.at4 = value)
      inline def _gtk_reserved3 : CFuncPtr0[Unit] = struct._5
      inline def _gtk_reserved3_=(value: CFuncPtr0[Unit]): Unit = (!struct.at5 = value)
      inline def _gtk_reserved4 : CFuncPtr0[Unit] = struct._6
      inline def _gtk_reserved4_=(value: CFuncPtr0[Unit]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates GtkStyleContextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkStyleContextClass] = scala.scalanative.unsafe.alloc[GtkStyleContextClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, changed : CFuncPtr1[Ptr[GtkStyleContext], Unit], _gtk_reserved1 : CFuncPtr0[Unit], _gtk_reserved2 : CFuncPtr0[Unit], _gtk_reserved3 : CFuncPtr0[Unit], _gtk_reserved4 : CFuncPtr0[Unit])(using Zone): Ptr[GtkStyleContextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).changed = changed
    (!____ptr)._gtk_reserved1 = _gtk_reserved1
    (!____ptr)._gtk_reserved2 = _gtk_reserved2
    (!____ptr)._gtk_reserved3 = _gtk_reserved3
    (!____ptr)._gtk_reserved4 = _gtk_reserved4
    ____ptr