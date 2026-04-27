package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-about-dialog.h
*/
opaque type AdwAboutDialogClass = CStruct1[AdwDialogClass]

object AdwAboutDialogClass:
  given _tag: Tag[AdwAboutDialogClass] = Tag.materializeCStruct1Tag[AdwDialogClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwAboutDialogClass)
      inline def parent_class : AdwDialogClass = struct._1
      inline def parent_class_=(value: AdwDialogClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwAboutDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwAboutDialogClass] = scala.scalanative.unsafe.alloc[AdwAboutDialogClass](1)
  def apply(parent_class : AdwDialogClass)(using Zone): Ptr[AdwAboutDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr