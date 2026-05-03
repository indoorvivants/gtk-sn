package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GClosureNotify:
*/
opaque type GClosureNotify = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GClosure], Unit]
object GClosureNotify:
  given _tag: Tag[GClosureNotify] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GClosure], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GClosureNotify = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GClosure], Unit]): GClosureNotify = o
  extension (v: GClosureNotify)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, Ptr[GClosure], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)