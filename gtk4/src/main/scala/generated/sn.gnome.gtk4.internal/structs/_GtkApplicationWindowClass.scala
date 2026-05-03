package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkApplicationWindowClass: _class: The parent class.
*/
opaque type _GtkApplicationWindowClass = CStruct2[GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkApplicationWindowClass:
  given _tag: Tag[_GtkApplicationWindowClass] = Tag.materializeCStruct2Tag[GtkWindowClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkApplicationWindowClass)
      inline def parent_class : GtkWindowClass = struct._1
      inline def parent_class_=(value: GtkWindowClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkApplicationWindowClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkApplicationWindowClass] = scala.scalanative.unsafe.alloc[_GtkApplicationWindowClass](1)
  def apply(parent_class : GtkWindowClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkApplicationWindowClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr