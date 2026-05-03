package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFrameClass: _class: The parent class. _child_allocation:
*/
opaque type _GtkFrameClass = CStruct3[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkFrameClass:
  given _tag: Tag[_GtkFrameClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkFrameClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit] = struct._2
      inline def compute_child_allocation_=(value: CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkFrameClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkFrameClass] = scala.scalanative.unsafe.alloc[_GtkFrameClass](1)
  def apply(parent_class : GtkWidgetClass, compute_child_allocation : CFuncPtr2[Ptr[GtkFrame], Ptr[GtkAllocation], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkFrameClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).compute_child_allocation = compute_child_allocation
    (!____ptr).padding = padding
    ____ptr