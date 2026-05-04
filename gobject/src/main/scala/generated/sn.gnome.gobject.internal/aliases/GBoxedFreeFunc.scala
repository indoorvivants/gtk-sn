package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBoxedFreeFunc: : (not nullable): The boxed structure to be freed.

 * [bindgen] header: /usr/include/glib-2.0/gobject/gboxed.h
*/
opaque type GBoxedFreeFunc = CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
object GBoxedFreeFunc:
  given _tag: Tag[GBoxedFreeFunc] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBoxedFreeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]): GBoxedFreeFunc = o
  extension (v: GBoxedFreeFunc)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)