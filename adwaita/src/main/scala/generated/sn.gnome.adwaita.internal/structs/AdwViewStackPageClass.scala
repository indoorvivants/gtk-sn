package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-view-stack.h
*/
opaque type AdwViewStackPageClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object AdwViewStackPageClass:
  given _tag: Tag[AdwViewStackPageClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwViewStackPageClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwViewStackPageClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwViewStackPageClass] = scala.scalanative.unsafe.alloc[AdwViewStackPageClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[AdwViewStackPageClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr