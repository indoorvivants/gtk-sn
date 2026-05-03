package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-window.h
*/
opaque type _AdwWindowClass = CStruct2[_root_.sn.gnome.gtk4.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _AdwWindowClass:
  given _tag: Tag[_AdwWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk4.internal.GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwWindowClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWindowClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWindowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _AdwWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwWindowClass] = scala.scalanative.unsafe.alloc[_AdwWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr