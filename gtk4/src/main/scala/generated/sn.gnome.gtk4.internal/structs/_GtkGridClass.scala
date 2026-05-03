package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkGridClass: _class: The parent class.
*/
opaque type _GtkGridClass = CStruct2[GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkGridClass:
  given _tag: Tag[_GtkGridClass] = Tag.materializeCStruct2Tag[GtkWidgetClass, CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkGridClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._2
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at2 = value)
    end extension
  
  // Allocates _GtkGridClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkGridClass] = scala.scalanative.unsafe.alloc[_GtkGridClass](1)
  def apply(parent_class : GtkWidgetClass, padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkGridClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).padding = padding
    ____ptr