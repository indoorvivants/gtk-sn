package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-message-dialog.h
*/
opaque type AdwMessageDialogClass = CStruct3[_root_.sn.gnome.gtk4.internal.GtkWindowClass, CFuncPtr2[Ptr[AdwMessageDialog], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwMessageDialogClass:
  given _tag: Tag[AdwMessageDialogClass] = Tag.materializeCStruct3Tag[_root_.sn.gnome.gtk4.internal.GtkWindowClass, CFuncPtr2[Ptr[AdwMessageDialog], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwMessageDialogClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWindowClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWindowClass): Unit = (!struct.at1 = value)
      inline def response : CFuncPtr2[Ptr[AdwMessageDialog], CString, Unit] = struct._2
      inline def response_=(value: CFuncPtr2[Ptr[AdwMessageDialog], CString, Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates AdwMessageDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwMessageDialogClass] = scala.scalanative.unsafe.alloc[AdwMessageDialogClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWindowClass, response : CFuncPtr2[Ptr[AdwMessageDialog], CString, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwMessageDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).padding = padding
    ____ptr