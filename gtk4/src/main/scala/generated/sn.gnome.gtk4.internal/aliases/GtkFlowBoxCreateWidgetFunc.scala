package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkFlowBoxCreateWidgetFunc: : (type GObject): the item from the model for which to create a widget for _data: (closure): user data from gtk_flow_box_bind_model()
*/
opaque type GtkFlowBoxCreateWidgetFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
object GtkFlowBoxCreateWidgetFunc:
  given _tag: Tag[GtkFlowBoxCreateWidgetFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkFlowBoxCreateWidgetFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]]): GtkFlowBoxCreateWidgetFunc = o
  extension (v: GtkFlowBoxCreateWidgetFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GtkWidget]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)