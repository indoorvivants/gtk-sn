package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkTreeModelFilterModifyFunc: : the `GtkTreeModelFilter` : a `GtkTreeIter` pointing to the row whose display values are determined : (out caller-allocates): A `GValue` which is already initialized for with the correct type for the column . : the column whose display value is determined
*/
opaque type GtkTreeModelFilterModifyFunc = CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GtkTreeModelFilterModifyFunc:
  given _tag: Tag[GtkTreeModelFilterModifyFunc] = Tag.materializeCFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkTreeModelFilterModifyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit]): GtkTreeModelFilterModifyFunc = o
  extension (v: GtkTreeModelFilterModifyFunc)
    inline def value: CFuncPtr5[Ptr[GtkTreeModel], Ptr[GtkTreeIter], Ptr[_root_.sn.gnome.gobject.internal.GValue], CInt, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)