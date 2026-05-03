package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GtkCellRendererTextClass = CStruct3[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object GtkCellRendererTextClass:
  given _tag: Tag[GtkCellRendererTextClass] = Tag.materializeCStruct3Tag[GtkCellRendererClass, CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: GtkCellRendererTextClass)
      inline def parent_class : GtkCellRendererClass = struct._1
      inline def parent_class_=(value: GtkCellRendererClass): Unit = (!struct.at1 = value)
      inline def edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit] = struct._2
      inline def edited_=(value: CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates GtkCellRendererTextClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[GtkCellRendererTextClass] = scala.scalanative.unsafe.alloc[GtkCellRendererTextClass](1)
  def apply(parent_class : GtkCellRendererClass, edited : CFuncPtr3[Ptr[GtkCellRendererText], CString, CString, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[GtkCellRendererTextClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).edited = edited
    (!____ptr).padding = padding
    ____ptr