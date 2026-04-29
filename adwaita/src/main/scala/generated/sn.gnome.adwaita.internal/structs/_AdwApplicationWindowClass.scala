package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindowClass = CStruct2[_root_.sn.gnome.gtk4.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _AdwApplicationWindowClass:
  given _tag: Tag[_AdwApplicationWindowClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk4.internal.GtkApplicationWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwApplicationWindowClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkApplicationWindowClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkApplicationWindowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _AdwApplicationWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwApplicationWindowClass] = scala.scalanative.unsafe.alloc[_AdwApplicationWindowClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkApplicationWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwApplicationWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr