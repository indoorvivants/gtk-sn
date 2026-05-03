package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-preferences-dialog.h
*/
opaque type AdwPreferencesDialog = CStruct1[AdwDialog]

object AdwPreferencesDialog:
  given _tag: Tag[AdwPreferencesDialog] = Tag.materializeCStruct1Tag[AdwDialog]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwPreferencesDialog)
      inline def parent_instance : AdwDialog = struct._1
      inline def parent_instance_=(value: AdwDialog): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwPreferencesDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwPreferencesDialog] = scala.scalanative.unsafe.alloc[AdwPreferencesDialog](1)
  def apply(parent_instance : AdwDialog)(using Zone): Ptr[AdwPreferencesDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr