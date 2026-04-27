package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkStyleContext = CStruct1[_root_.sn.gnome.gobject.internal.GObject]

object GtkStyleContext:
  given _tag: Tag[GtkStyleContext] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObject]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkStyleContext)
      inline def parent_object : _root_.sn.gnome.gobject.internal.GObject = struct._1
      inline def parent_object_=(value: _root_.sn.gnome.gobject.internal.GObject): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkStyleContext on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkStyleContext] = scala.scalanative.unsafe.alloc[GtkStyleContext](1)
  def apply(parent_object : _root_.sn.gnome.gobject.internal.GObject)(using Zone): Ptr[GtkStyleContext] =
    val ____ptr = apply()
    (!____ptr).parent_object = parent_object
    ____ptr