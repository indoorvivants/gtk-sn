package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwExpanderRowClass _class: The parent class

 * [bindgen] header: /usr/include/libadwaita-1/adw-expander-row.h
*/
opaque type _AdwExpanderRowClass = CStruct2[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _AdwExpanderRowClass:
  given _tag: Tag[_AdwExpanderRowClass] = Tag.materializeCStruct2Tag[AdwPreferencesRowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwExpanderRowClass)
      inline def parent_class : AdwPreferencesRowClass = struct._1
      inline def parent_class_=(value: AdwPreferencesRowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _AdwExpanderRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwExpanderRowClass] = scala.scalanative.unsafe.alloc[_AdwExpanderRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwExpanderRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr