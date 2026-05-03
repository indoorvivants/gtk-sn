package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-clamp-layout.h
*/
opaque type AdwClampLayoutClass = CStruct1[_root_.sn.gnome.gtk4.internal.GtkLayoutManagerClass]

object AdwClampLayoutClass:
  given _tag: Tag[AdwClampLayoutClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkLayoutManagerClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: AdwClampLayoutClass)
      inline def parent_class : _root_.sn.gnome.gtk4.internal.GtkLayoutManagerClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gtk4.internal.GtkLayoutManagerClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates AdwClampLayoutClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[AdwClampLayoutClass] = scala.scalanative.unsafe.alloc[AdwClampLayoutClass](1)
  def apply(parent_class : _root_.sn.gnome.gtk4.internal.GtkLayoutManagerClass)(using Zone): Ptr[AdwClampLayoutClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr