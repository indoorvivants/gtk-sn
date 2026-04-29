package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GClassFinalizeFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to finalize
*/
opaque type GClassFinalizeFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GClassFinalizeFunc:
  given _tag: Tag[GClassFinalizeFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GClassFinalizeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): GClassFinalizeFunc = o
  extension (v: GClassFinalizeFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)