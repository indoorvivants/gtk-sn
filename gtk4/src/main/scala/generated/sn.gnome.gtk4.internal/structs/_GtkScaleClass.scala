package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkScaleClass = CStruct3[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkScaleClass:
  given _tag: Tag[_GtkScaleClass] = Tag.materializeCStruct3Tag[GtkRangeClass, CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkScaleClass)
      inline def parent_class : GtkRangeClass = struct._1
      inline def parent_class_=(value: GtkRangeClass): Unit = (!struct.at1 = value)
      inline def get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit] = struct._2
      inline def get_layout_offsets_=(value: CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkScaleClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkScaleClass] = scala.scalanative.unsafe.alloc[_GtkScaleClass](1)
  def apply(parent_class : GtkRangeClass, get_layout_offsets : CFuncPtr3[Ptr[GtkScale], Ptr[CInt], Ptr[CInt], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkScaleClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).get_layout_offsets = get_layout_offsets
    (!____ptr).padding = padding
    ____ptr