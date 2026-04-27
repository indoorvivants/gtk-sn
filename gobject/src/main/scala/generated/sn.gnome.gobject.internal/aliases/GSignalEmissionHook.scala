package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalEmissionHook: : Signal invocation hint, see #GSignalInvocationHint. _param_values: the number of parameters to the function, including the instance on which the signal was emitted.
*/
opaque type GSignalEmissionHook = CFuncPtr4[Ptr[GSignalInvocationHint], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSignalEmissionHook:
  given _tag: Tag[GSignalEmissionHook] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSignalEmissionHook = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSignalEmissionHook = o
  extension (v: GSignalEmissionHook)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)