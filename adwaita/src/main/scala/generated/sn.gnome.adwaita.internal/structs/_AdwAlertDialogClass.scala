package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-alert-dialog.h
*/
opaque type _AdwAlertDialogClass = CStruct3[AdwDialogClass, CFuncPtr2[Ptr[AdwAlertDialog], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _AdwAlertDialogClass:
  given _tag: Tag[_AdwAlertDialogClass] = Tag.materializeCStruct3Tag[AdwDialogClass, CFuncPtr2[Ptr[AdwAlertDialog], CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwAlertDialogClass)
      inline def parent_class : AdwDialogClass = struct._1
      inline def parent_class_=(value: AdwDialogClass): Unit = (!struct.at1 = value)
      inline def response : CFuncPtr2[Ptr[AdwAlertDialog], CString, Unit] = struct._2
      inline def response_=(value: CFuncPtr2[Ptr[AdwAlertDialog], CString, Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _AdwAlertDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwAlertDialogClass] = scala.scalanative.unsafe.alloc[_AdwAlertDialogClass](1)
  def apply(parent_class : AdwDialogClass, response : CFuncPtr2[Ptr[AdwAlertDialog], CString, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwAlertDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).padding = padding
    ____ptr