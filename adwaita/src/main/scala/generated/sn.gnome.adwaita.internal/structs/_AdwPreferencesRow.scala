package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-row.h
*/
opaque type _AdwPreferencesRow = CStruct1[_root_.sn.gnome.gtk4.internal.GtkListBoxRow]

object _AdwPreferencesRow:
  given _tag: Tag[_AdwPreferencesRow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkListBoxRow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwPreferencesRow)
      inline def parent_instance : _root_.sn.gnome.gtk4.internal.GtkListBoxRow = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gtk4.internal.GtkListBoxRow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwPreferencesRow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwPreferencesRow] = scala.scalanative.unsafe.alloc[_AdwPreferencesRow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk4.internal.GtkListBoxRow)(using Zone): Ptr[_AdwPreferencesRow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr