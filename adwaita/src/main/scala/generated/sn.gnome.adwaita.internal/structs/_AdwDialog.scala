package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-dialog.h
*/
opaque type _AdwDialog = CStruct1[_root_.sn.gnome.gtk4.internal.GtkWidget]

object _AdwDialog:
  given _tag: Tag[_AdwDialog] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwDialog)
      inline def parent_instance : _root_.sn.gnome.gtk4.internal.GtkWidget = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gtk4.internal.GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwDialog] = scala.scalanative.unsafe.alloc[_AdwDialog](1)
  def apply(parent_instance : _root_.sn.gnome.gtk4.internal.GtkWidget)(using Zone): Ptr[_AdwDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr