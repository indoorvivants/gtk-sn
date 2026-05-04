package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBindingTransformFunc: : a #GBinding _value: the #GValue containing the value to transform _value: the #GValue in which to store the transformed value _data: data passed to the transform function

 * [bindgen] header: /usr/include/glib-2.0/gobject/gbinding.h
*/
opaque type GBindingTransformFunc = CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GBindingTransformFunc:
  given _tag: Tag[GBindingTransformFunc] = Tag.materializeCFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBindingTransformFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GBindingTransformFunc = o
  extension (v: GBindingTransformFunc)
    inline def value: CFuncPtr4[Ptr[GBinding], Ptr[GValue], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)