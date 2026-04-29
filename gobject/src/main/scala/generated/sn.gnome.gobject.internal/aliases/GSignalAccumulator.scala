package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSignalAccumulator: : Signal invocation hint, see #GSignalInvocationHint.
*/
opaque type GSignalAccumulator = CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSignalAccumulator:
  given _tag: Tag[GSignalAccumulator] = Tag.materializeCFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSignalAccumulator = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSignalAccumulator = o
  extension (v: GSignalAccumulator)
    inline def value: CFuncPtr4[Ptr[GSignalInvocationHint], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)