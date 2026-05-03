package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkDialogClass: _class: The parent class. : Signal emitted when an action widget is activated. : Signal emitted when the user uses a keybinding to close the dialog.
*/
opaque type _GtkDialogClass = CStruct4[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkDialogClass:
  given _tag: Tag[_GtkDialogClass] = Tag.materializeCStruct4Tag[GtkWindowClass, CFuncPtr2[Ptr[GtkDialog], CInt, Unit], CFuncPtr1[Ptr[GtkDialog], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkDialogClass)
      inline def parent_class : GtkWindowClass = struct._1
      inline def parent_class_=(value: GtkWindowClass): Unit = (!struct.at1 = value)
      inline def response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit] = struct._2
      inline def response_=(value: CFuncPtr2[Ptr[GtkDialog], CInt, Unit]): Unit = (!struct.at2 = value)
      inline def close : CFuncPtr1[Ptr[GtkDialog], Unit] = struct._3
      inline def close_=(value: CFuncPtr1[Ptr[GtkDialog], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkDialogClass] = scala.scalanative.unsafe.alloc[_GtkDialogClass](1)
  def apply(parent_class : GtkWindowClass, response : CFuncPtr2[Ptr[GtkDialog], CInt, Unit], close : CFuncPtr1[Ptr[GtkDialog], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).response = response
    (!____ptr).close = close
    (!____ptr).padding = padding
    ____ptr