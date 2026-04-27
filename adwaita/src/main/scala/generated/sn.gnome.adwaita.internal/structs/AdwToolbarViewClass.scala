package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-toolbar-view.h
*/
opaque type AdwToolbarViewClass = CStruct1[_root_.sn.gnome.gtk4.internal.GtkWidgetClass]

object AdwToolbarViewClass:
  given _tag: Tag[AdwToolbarViewClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkWidgetClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwToolbarViewClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWidgetClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwToolbarViewClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwToolbarViewClass] = scala.scalanative.unsafe.alloc[AdwToolbarViewClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass)(using Zone): Ptr[AdwToolbarViewClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr