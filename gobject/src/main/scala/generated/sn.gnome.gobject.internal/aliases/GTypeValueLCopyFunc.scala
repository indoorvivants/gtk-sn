package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeValueLCopyFunc: : the value to lcopy _collect_values: the number of collected values _values: (array length=n_collect_values): the collected locations for storage _flags: optional flags
*/
opaque type GTypeValueLCopyFunc = CFuncPtr4[Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GTypeCValue], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar]]
object GTypeValueLCopyFunc:
  given _tag: Tag[GTypeValueLCopyFunc] = Tag.materializeCFuncPtr4[Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GTypeCValue], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypeValueLCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GTypeCValue], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar]]): GTypeValueLCopyFunc = o
  extension (v: GTypeValueLCopyFunc)
    inline def value: CFuncPtr4[Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GTypeCValue], _root_.sn.gnome.glib.internal.guint, Ptr[_root_.sn.gnome.glib.internal.gchar]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)