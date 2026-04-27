package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-tab-view.h
*/
opaque type AdwTabPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object AdwTabPageClass:
  given _tag: Tag[AdwTabPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwTabPageClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwTabPageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwTabPageClass] = scala.scalanative.unsafe.alloc[AdwTabPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwTabPageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr