package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkConstraintClass = CStruct1[_root_.sn.gnome.gobject.internal.GObjectClass]

object GtkConstraintClass:
  given _tag: Tag[GtkConstraintClass] = Tag.materializeCStruct1Tag[_root_.sn.gnome.gobject.internal.GObjectClass]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkConstraintClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
    end extension
  
  // Allocates GtkConstraintClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkConstraintClass] = scala.scalanative.unsafe.alloc[GtkConstraintClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass)(using Zone): Ptr[GtkConstraintClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    ____ptr