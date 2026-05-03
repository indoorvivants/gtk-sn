package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkFontDialogClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object GtkFontDialogClass:
  given _tag: Tag[GtkFontDialogClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkFontDialogClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkFontDialogClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkFontDialogClass] = scala.scalanative.unsafe.alloc[GtkFontDialogClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GtkFontDialogClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr