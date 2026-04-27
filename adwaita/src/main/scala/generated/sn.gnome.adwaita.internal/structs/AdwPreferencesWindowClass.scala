package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwPreferencesWindowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-window.h
*/
opaque type AdwPreferencesWindowClass = CStruct2[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object AdwPreferencesWindowClass:
  given _tag: Tag[AdwPreferencesWindowClass] = Tag.materializeCStruct2Tag[AdwWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwPreferencesWindowClass)
      inline def parent_class : AdwWindowClass = struct._1
      inline def parent_class_=(value: AdwWindowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates AdwPreferencesWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwPreferencesWindowClass] = scala.scalanative.unsafe.alloc[AdwPreferencesWindowClass](1)
  def apply(parent_class : AdwWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[AdwPreferencesWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr