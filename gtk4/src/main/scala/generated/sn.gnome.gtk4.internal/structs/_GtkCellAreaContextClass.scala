package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCellAreaContextClass: : This tells the context that an allocation width or height (or both) have been decided for a group of rows. The context should store any allocations for internally aligned cells at this point so that they dont need to be recalculated at gtk_cell_area_render() time. : Clear any previously stored information about requested and allocated sizes for the context. _preferred_height_for_width: Returns the aligned height for the given width that context must store while collecting sizes for it’s rows. _preferred_width_for_height: Returns the aligned width for the given height that context must store while collecting sizes for it’s rows.
*/
opaque type _GtkCellAreaContextClass = CStruct6[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkCellAreaContextClass:
  given _tag: Tag[_GtkCellAreaContextClass] = Tag.materializeCStruct6Tag[_root_.sn.gnome.gobject.internal.GObjectClass, CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkCellAreaContext], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkCellAreaContextClass)
      inline def parent_class : _root_.sn.gnome.gobject.internal.GObjectClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gobject.internal.GObjectClass): Unit = (!struct.at1 = value)
      inline def allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit] = struct._2
      inline def allocate_=(value: CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit]): Unit = (!struct.at2 = value)
      inline def reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit] = struct._3
      inline def reset_=(value: CFuncPtr1[Ptr[GtkCellAreaContext], Unit]): Unit = (!struct.at3 = value)
      inline def get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._4
      inline def get_preferred_height_for_width_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at4 = value)
      inline def get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit] = struct._5
      inline def get_preferred_width_for_height_=(value: CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at5 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._6
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at6 = value)
    end extension
  
  // Allocates _GtkCellAreaContextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkCellAreaContextClass] = scala.scalanative.unsafe.alloc[_GtkCellAreaContextClass](1)
  def apply(parent_class : _root_.sn.gnome.gobject.internal.GObjectClass, allocate : CFuncPtr3[Ptr[GtkCellAreaContext], CInt, CInt, Unit], reset : CFuncPtr1[Ptr[GtkCellAreaContext], Unit], get_preferred_height_for_width : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], get_preferred_width_for_height : CFuncPtr4[Ptr[GtkCellAreaContext], CInt, Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkCellAreaContextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).allocate = allocate
    (!____ptr).reset = reset
    (!____ptr).get_preferred_height_for_width = get_preferred_height_for_width
    (!____ptr).get_preferred_width_for_height = get_preferred_width_for_height
    (!____ptr).padding = padding
    ____ptr