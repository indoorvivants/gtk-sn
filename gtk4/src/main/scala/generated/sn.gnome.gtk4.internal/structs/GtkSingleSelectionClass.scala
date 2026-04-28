package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkSingleSelectionClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object GtkSingleSelectionClass:
  given _tag: Tag[GtkSingleSelectionClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkSingleSelectionClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkSingleSelectionClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkSingleSelectionClass] = scala.scalanative.unsafe.alloc[GtkSingleSelectionClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GtkSingleSelectionClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr