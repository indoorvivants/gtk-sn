package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GObjectSetPropertyFunc: : a #GObject g_object_class_install_property(). : the new value for the property : the #GParamSpec describing the property
*/
opaque type GObjectSetPropertyFunc = CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
object GObjectSetPropertyFunc:
  given _tag: Tag[GObjectSetPropertyFunc] = Tag.materializeCFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GObjectSetPropertyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit]): GObjectSetPropertyFunc = o
  extension (v: GObjectSetPropertyFunc)
    inline def value: CFuncPtr4[Ptr[GObject], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], Ptr[GParamSpec], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)