package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-message-dialog.h
*/
opaque type AdwMessageDialog = CStruct1[_root_.sn.gnome.gtk4.internal.GtkWindow]

object AdwMessageDialog:
  given _tag: Tag[AdwMessageDialog] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkWindow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwMessageDialog)
      inline def parent_instance : _root_.sn.gnome.gtk4.internal.GtkWindow = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gtk4.internal.GtkWindow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwMessageDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwMessageDialog] = scala.scalanative.unsafe.alloc[AdwMessageDialog](1)
  def apply(parent_instance : _root_.sn.gnome.gtk4.internal.GtkWindow)(using Zone): Ptr[AdwMessageDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr