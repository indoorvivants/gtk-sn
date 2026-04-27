package sn.gnome.adwaita.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * [bindgen] header: /usr/include/libadwaita-1/adw-bin.h
*/
opaque type _AdwBin = CStruct1[_root_.sn.gnome.gtk4.internal.GtkWidget]

object _AdwBin:
  given _tag: Tag[_AdwBin] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gtk4.internal.GtkWidget]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _AdwBin)
      inline def parent_instance : _root_.sn.gnome.gtk4.internal.GtkWidget = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gtk4.internal.GtkWidget): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _AdwBin on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_AdwBin] = scala.scalanative.unsafe.alloc[_AdwBin](1)
  def apply(parent_instance : _root_.sn.gnome.gtk4.internal.GtkWidget)(using Zone): Ptr[_AdwBin] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr