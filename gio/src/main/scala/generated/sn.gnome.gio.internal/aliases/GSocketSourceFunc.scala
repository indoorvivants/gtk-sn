package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSocketSourceFunc: : the #GSocket : the current condition at the source fired.
*/
opaque type GSocketSourceFunc = CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GSocketSourceFunc:
  given _tag: Tag[GSocketSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSocketSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GSocketSourceFunc = o
  extension (v: GSocketSourceFunc)
    inline def value: CFuncPtr3[Ptr[GSocket], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)