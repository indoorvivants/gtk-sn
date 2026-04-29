package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GIOSchedulerJobFunc: : a #GIOSchedulerJob. : optional #GCancellable object, %NULL to ignore.
*/
opaque type GIOSchedulerJobFunc = CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GIOSchedulerJobFunc:
  given _tag: Tag[GIOSchedulerJobFunc] = Tag.materializeCFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GIOSchedulerJobFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GIOSchedulerJobFunc = o
  extension (v: GIOSchedulerJobFunc)
    inline def value: CFuncPtr3[Ptr[GIOSchedulerJob], Ptr[GCancellable], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)