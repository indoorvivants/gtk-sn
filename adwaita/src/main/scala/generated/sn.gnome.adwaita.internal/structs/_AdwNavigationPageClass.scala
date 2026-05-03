package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-navigation-view.h
*/
opaque type _AdwNavigationPageClass = CStruct6[_root_.sn.gnome.gtk4.internal.GtkWidgetClass, CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _AdwNavigationPageClass:
  given _tag: Tag[_AdwNavigationPageClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gtk4.internal.GtkWidgetClass, CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CFuncPtr1[Ptr[AdwNavigationPage], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwNavigationPageClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def showing : CFuncPtr1[Ptr[AdwNavigationPage], Unit] = struct._2
      inline def showing_=(value: CFuncPtr1[Ptr[AdwNavigationPage], Unit]): Unit = (!struct.at2 = value)
      inline def shown : CFuncPtr1[Ptr[AdwNavigationPage], Unit] = struct._3
      inline def shown_=(value: CFuncPtr1[Ptr[AdwNavigationPage], Unit]): Unit = (!struct.at3 = value)
      inline def hiding : CFuncPtr1[Ptr[AdwNavigationPage], Unit] = struct._4
      inline def hiding_=(value: CFuncPtr1[Ptr[AdwNavigationPage], Unit]): Unit = (!struct.at4 = value)
      inline def hidden : CFuncPtr1[Ptr[AdwNavigationPage], Unit] = struct._5
      inline def hidden_=(value: CFuncPtr1[Ptr[AdwNavigationPage], Unit]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _AdwNavigationPageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwNavigationPageClass] = scala.scalanative.unsafe.alloc[_AdwNavigationPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass, showing : CFuncPtr1[Ptr[AdwNavigationPage], Unit], shown : CFuncPtr1[Ptr[AdwNavigationPage], Unit], hiding : CFuncPtr1[Ptr[AdwNavigationPage], Unit], hidden : CFuncPtr1[Ptr[AdwNavigationPage], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_AdwNavigationPageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).showing = showing
    (!____ptr).shown = shown
    (!____ptr).hiding = hiding
    (!____ptr).hidden = hidden
    (!____ptr).padding = padding
    ____ptr