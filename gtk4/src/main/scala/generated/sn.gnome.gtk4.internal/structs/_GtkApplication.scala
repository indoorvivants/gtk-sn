package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkApplication = CStruct1[_root_.sn.gnome.gio.internal.GApplication]

object _GtkApplication:
  given _tag: Tag[_GtkApplication] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gio.internal.GApplication]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkApplication)
      inline def parent_instance : _root_.sn.gnome.gio.internal.GApplication = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gio.internal.GApplication): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkApplication on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkApplication] = scala.scalanative.unsafe.alloc[_GtkApplication](1)
  def apply(parent_instance : _root_.sn.gnome.gio.internal.GApplication)(using Zone): Ptr[_GtkApplication] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr