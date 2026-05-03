package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkButtonClass: _class: The parent class. : Signal emitted when the button has been activated (pressed and released). : Signal that causes the button to animate press then release. Applications should never connect to this signal, but use the signal.
*/
opaque type GtkButtonClass = CStruct4[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkButtonClass:
  given _tag: Tag[GtkButtonClass] = Tag.materializeCStruct4Tag[GtkWidgetClass, CFuncPtr1[Ptr[GtkButton], Unit], CFuncPtr1[Ptr[GtkButton], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkButtonClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def clicked : CFuncPtr1[Ptr[GtkButton], Unit] = struct._2
      inline def clicked_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = (!struct.at2 = value)
      inline def activate : CFuncPtr1[Ptr[GtkButton], Unit] = struct._3
      inline def activate_=(value: CFuncPtr1[Ptr[GtkButton], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates GtkButtonClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkButtonClass] = scala.scalanative.unsafe.alloc[GtkButtonClass](1)
  def apply(parent_class : GtkWidgetClass, clicked : CFuncPtr1[Ptr[GtkButton], Unit], activate : CFuncPtr1[Ptr[GtkButton], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkButtonClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).clicked = clicked
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr