package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkLayoutChild = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object _GtkLayoutChild:
  given _tag: Tag[_GtkLayoutChild] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkLayoutChild)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates _GtkLayoutChild on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkLayoutChild] = scala.scalanative.unsafe.alloc[_GtkLayoutChild](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[_GtkLayoutChild] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr