package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type _GtkDrawingAreaClass = CStruct3[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkDrawingAreaClass:
  given _tag: Tag[_GtkDrawingAreaClass] = Tag.materializeCStruct3Tag[GtkWidgetClass, CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkDrawingAreaClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit] = struct._2
      inline def resize_=(value: CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit]): Unit = (!struct.at2 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._3
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at3 = value)
    end extension
  
  // Allocates _GtkDrawingAreaClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkDrawingAreaClass] = scala.scalanative.unsafe.alloc[_GtkDrawingAreaClass](1)
  def apply(parent_class : GtkWidgetClass, resize : CFuncPtr3[Ptr[GtkDrawingArea], CInt, CInt, Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkDrawingAreaClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).resize = resize
    (!____ptr).padding = padding
    ____ptr