package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GCancellableSourceFunc: : the #GCancellable
*/
opaque type GCancellableSourceFunc = CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GCancellableSourceFunc:
  given _tag: Tag[GCancellableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GCancellableSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GCancellableSourceFunc = o
  extension (v: GCancellableSourceFunc)
    inline def value: CFuncPtr2[Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)