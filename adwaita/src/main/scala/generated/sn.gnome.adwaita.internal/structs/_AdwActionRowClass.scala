package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * AdwActionRowClass _class: The parent class : Activates the row to trigger its main action.

 * [bindgen] header: /usr/include/libadwaita-1/adw-action-row.h
*/
opaque type _AdwActionRowClass = CStruct3[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]

object _AdwActionRowClass:
  given _tag: Tag[_AdwActionRowClass] = Tag.materializeCStruct3Tag[AdwPreferencesRowClass, CFuncPtr1[Ptr[AdwActionRow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwActionRowClass)
      inline def parent_class : AdwPreferencesRowClass = struct._1
      inline def parent_class_=(value: AdwPreferencesRowClass): Unit = (!struct.at1 = value)
      inline def activate : CFuncPtr1[Ptr[AdwActionRow], Unit] = struct._2
      inline def activate_=(value: CFuncPtr1[Ptr[AdwActionRow], Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _AdwActionRowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwActionRowClass] = scala.scalanative.unsafe.alloc[_AdwActionRowClass](1)
  def apply(parent_class : AdwPreferencesRowClass, activate : CFuncPtr1[Ptr[AdwActionRow], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._4])(using Zone): Ptr[_AdwActionRowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).activate = activate
    (!____ptr).padding = padding
    ____ptr