package sn.gnome.pango.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * PangoAttrDataCopyFunc: _data: user data to copy
*/
opaque type PangoAttrDataCopyFunc = CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]
object PangoAttrDataCopyFunc:
  given _tag: Tag[PangoAttrDataCopyFunc] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): PangoAttrDataCopyFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer]): PangoAttrDataCopyFunc = o
  extension (v: PangoAttrDataCopyFunc)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gconstpointer, _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)