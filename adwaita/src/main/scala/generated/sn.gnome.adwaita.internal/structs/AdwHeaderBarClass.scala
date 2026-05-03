package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-header-bar.h
*/
opaque type AdwHeaderBarClass = CStruct1[_root_.sn.gnome.gtk4.internal.GtkWidgetClass]

object AdwHeaderBarClass:
  given _tag: Tag[AdwHeaderBarClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkWidgetClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwHeaderBarClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkWidgetClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwHeaderBarClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwHeaderBarClass] = scala.scalanative.unsafe.alloc[AdwHeaderBarClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkWidgetClass)(using Zone): Ptr[AdwHeaderBarClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr