package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GObjectGetPropertyFunc: : a #GObject g_object_class_install_property(). : a #GValue to return the property value in : the #GParamSpec describing the property
*/
opaque type GObjectGetPropertyFunc = CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectGetPropertyFunc:
  given _tag: Tag[GObjectGetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GObjectGetPropertyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectGetPropertyFunc = o
  extension (v: GObjectGetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)