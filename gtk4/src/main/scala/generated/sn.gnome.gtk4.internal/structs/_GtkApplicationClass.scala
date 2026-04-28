package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkApplicationClass: _class: The parent class. _added: Signal emitted when a `GtkWindow` is added to application through gtk_application_add_window(). _removed: Signal emitted when a `GtkWindow` is removed from application, either as a side-effect of being destroyed or explicitly through gtk_application_remove_window().
*/
opaque type _GtkApplicationClass = CStruct4[_root_.sn.gnome.gio.internal.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]

object _GtkApplicationClass:
  given _tag: Tag[_GtkApplicationClass] = Tag.materializeCStruct4Tag[_root_.sn.gnome.gio.internal.GApplicationClass, CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]]
  
  export fields.*
  private[internal] object fields:
    extension (struct: _GtkApplicationClass)
      inline def parent_class : _root_.sn.gnome.gio.internal.GApplicationClass = struct._1
      inline def parent_class_=(value: _root_.sn.gnome.gio.internal.GApplicationClass): Unit = (!struct.at1 = value)
      inline def window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._2
      inline def window_added_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = (!struct.at2 = value)
      inline def window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit] = struct._3
      inline def window_removed_=(value: CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit]): Unit = (!struct.at3 = value)
      inline def padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8] = struct._4
      inline def padding_=(value: CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8]): Unit = (!struct.at4 = value)
    end extension
  
  // Allocates _GtkApplicationClass on the heap – fields are not initalised or zeroed out
  def apply()(using Zone): Ptr[_GtkApplicationClass] = scala.scalanative.unsafe.alloc[_GtkApplicationClass](1)
  def apply(parent_class : _root_.sn.gnome.gio.internal.GApplicationClass, window_added : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], window_removed : CFuncPtr2[Ptr[GtkApplication], Ptr[GtkWindow], Unit], padding : CArray[_root_.sn.gnome.glib.internal.gpointer, Nat._8])(using Zone): Ptr[_GtkApplicationClass] =
    val ____ptr = apply()
    (!____ptr).parent_class = parent_class
    (!____ptr).window_added = window_added
    (!____ptr).window_removed = window_removed
    (!____ptr).padding = padding
    ____ptr