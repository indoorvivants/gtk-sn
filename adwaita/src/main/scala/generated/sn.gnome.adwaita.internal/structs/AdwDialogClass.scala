package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-dialog.h
*/
opaque type AdwDialogClass = CStruct4[_root_.sn.gnome.gtk4.internal.GtkWidgetClass, CFuncPtr1[Ptr[AdwDialog], Unit], CFuncPtr1[Ptr[AdwDialog], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwDialogClass:
  given _tag: Tag[AdwDialogClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gtk4.internal.GtkWidgetClass, CFuncPtr1[Ptr[AdwDialog], Unit], CFuncPtr1[Ptr[AdwDialog], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwDialogClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def close_attempt : CFuncPtr1[Ptr[AdwDialog], Unit] = struct._2
      inline def close_attempt_=(value: CFuncPtr1[Ptr[AdwDialog], Unit]): Unit = (!struct.at2 = value)
      inline def closed : CFuncPtr1[Ptr[AdwDialog], Unit] = struct._3
      inline def closed_=(value: CFuncPtr1[Ptr[AdwDialog], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates AdwDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwDialogClass] = scala.scalanative.unsafe.alloc[AdwDialogClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass, close_attempt : CFuncPtr1[Ptr[AdwDialog], Unit], closed : CFuncPtr1[Ptr[AdwDialog], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).close_attempt = close_attempt
    (!____ptr).closed = closed
    (!____ptr).padding = padding
    ____ptr