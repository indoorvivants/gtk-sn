package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-application-window.h
*/
opaque type _AdwApplicationWindow = CStruct1[_root_.sn.gnome.gtk4.internal.GtkApplicationWindow]

object _AdwApplicationWindow:
  given _tag: Tag[_AdwApplicationWindow] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkApplicationWindow]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwApplicationWindow)
      inline def parent_instance : _root_.sn.gnome.gtk4.internal.GtkApplicationWindow = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gtk4.internal.GtkApplicationWindow): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwApplicationWindow on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwApplicationWindow] = scala.scalanative.unsafe.alloc[_AdwApplicationWindow](1)
  def apply(parent_instance : _root_.sn.gnome.gtk4.internal.GtkApplicationWindow)(using Zone): Ptr[_AdwApplicationWindow] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr