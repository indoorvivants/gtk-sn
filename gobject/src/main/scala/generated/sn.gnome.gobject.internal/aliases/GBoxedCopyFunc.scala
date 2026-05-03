package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBoxedCopyFunc: : (not nullable): The boxed structure to be copied.
*/
opaque type GBoxedCopyFunc = CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
object GBoxedCopyFunc:
  given _tag: Tag[GBoxedCopyFunc] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBoxedCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer]): GBoxedCopyFunc = o
  extension (v: GBoxedCopyFunc)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)