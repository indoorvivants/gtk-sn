package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-alert-dialog.h
*/
opaque type AdwAlertDialog = CStruct1[AdwDialog]

object AdwAlertDialog:
  given _tag: Tag[AdwAlertDialog] = Tag.materializeCStruct1Tag[AdwDialog]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwAlertDialog)
      inline def parent_instance : AdwDialog = struct._1
      inline def parent_instance_=(value: AdwDialog): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwAlertDialog on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwAlertDialog] = scala.scalanative.unsafe.alloc[AdwAlertDialog](1)
  def apply(parent_instance : AdwDialog)(using Zone): Ptr[AdwAlertDialog] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr