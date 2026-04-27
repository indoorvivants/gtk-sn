package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSizeGroup = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object GtkSizeGroup:
  given _tag: Tag[GtkSizeGroup] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkSizeGroup)
      inline def parent_instance : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_instance_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkSizeGroup on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkSizeGroup] = scala.scalanative.unsafe.alloc[GtkSizeGroup](1)
  def apply(parent_instance : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[GtkSizeGroup] =
    val ____ptr = apply()
    (!____ptr).parent_instance = parent_instance
    ____ptr