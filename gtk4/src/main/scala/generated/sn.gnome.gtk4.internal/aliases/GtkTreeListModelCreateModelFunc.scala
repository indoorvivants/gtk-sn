package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeListModelCreateModelFunc: : (type GObject): The item that is being expanded _data: User data passed when registering the function
*/
opaque type GtkTreeListModelCreateModelFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]
object GtkTreeListModelCreateModelFunc:
  given _tag: Tag[GtkTreeListModelCreateModelFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeListModelCreateModelFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]]): GtkTreeListModelCreateModelFunc = o
  extension (v: GtkTreeListModelCreateModelFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[_root_.sn.gnome.gio.internal.GListModel]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)