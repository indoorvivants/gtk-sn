package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkGLAreaClass: : class closure for the `GtkGLArea::render` signal : class closeure for the `GtkGLArea::resize` signal _context: class closure for the `GtkGLArea::create-context` signal
*/
opaque type _GtkGLAreaClass = CStruct5[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkGLAreaClass:
  given _tag: Tag[_GtkGLAreaClass] = Tag.materializeCStruct5Tag[GtkWidgetClass, CFuncPtr2[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext], _root_.sn.gnome.glib.internal.gboolean], CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], CFuncPtr1[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext]], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkGLAreaClass)
      inline def parent_class : GtkWidgetClass = struct._1
      inline def parent_class_=(value: GtkWidgetClass): Unit = (!struct.at1 = value)
      inline def render : CFuncPtr2[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext], _root_.sn.gnome.glib.internal.gboolean] = struct._2
      inline def render_=(value: CFuncPtr2[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext], _root_.sn.gnome.glib.internal.gboolean]): Unit = (!struct.at2 = value)
      inline def resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit] = struct._3
      inline def resize_=(value: CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit]): Unit = (!struct.at3 = value)
      inline def create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext]] = struct._4
      inline def create_context_=(value: CFuncPtr1[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext]]): Unit = (!struct.at4 = value)
      inline def _padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._5
      inline def _padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at5 = value)
    end extension
  
  // Allocates _GtkGLAreaClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkGLAreaClass] = scala.scalanative.unsafe.alloc[_GtkGLAreaClass](1)
  def apply(parent_class : GtkWidgetClass, render : CFuncPtr2[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext], _root_.sn.gnome.glib.internal.gboolean], resize : CFuncPtr3[Ptr[GtkGLArea], CInt, CInt, Unit], create_context : CFuncPtr1[Ptr[GtkGLArea], Ptr[_root_.sn.gnome.gdk4.internal.GdkGLContext]], _padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkGLAreaClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).render = render
    (!____ptr).resize = resize
    (!____ptr).create_context = create_context
    (!____ptr)._padding = _padding
    ____ptr