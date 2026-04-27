package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwApplicationClass: _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-application.h
*/
opaque type AdwApplicationClass = CStruct2[_root_.sn.gnome.gtk4.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwApplicationClass:
  given _tag: Tag[AdwApplicationClass] = Tag.materializeCStruct2Tag[_root_.sn.gnome.gtk4.internal.GtkApplicationClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwApplicationClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkApplicationClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkApplicationClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates AdwApplicationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwApplicationClass] = scala.scalanative.unsafe.alloc[AdwApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkApplicationClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwApplicationClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr