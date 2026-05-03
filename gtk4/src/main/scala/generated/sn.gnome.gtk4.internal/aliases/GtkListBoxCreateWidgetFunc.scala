package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkListBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data
*/
opaque type GtkListBoxCreateWidgetFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
object GtkListBoxCreateWidgetFunc:
  given _tag: Tag[GtkListBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkListBoxCreateWidgetFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]): GtkListBoxCreateWidgetFunc = o
  extension (v: GtkListBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)