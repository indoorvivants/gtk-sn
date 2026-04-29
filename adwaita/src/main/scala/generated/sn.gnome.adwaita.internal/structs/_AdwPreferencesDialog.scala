package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-dialog.h
*/
opaque type _AdwPreferencesDialog = CStruct1[AdwDialog]

object _AdwPreferencesDialog:
  given _tag: Tag[_AdwPreferencesDialog] = Tag.materializeCStruct1Tag[AdwDialog]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwPreferencesDialog)
      inline def parent_instance : AdwDialog = struct._1
      inline def parent_instance_=(value: AdwDialog): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwPreferencesDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwPreferencesDialog] = scala.scalanative.unsafe.alloc[_AdwPreferencesDialog](1)
  def apply(parent_instance : AdwDialog)(using Zone): Ptr[_AdwPreferencesDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr