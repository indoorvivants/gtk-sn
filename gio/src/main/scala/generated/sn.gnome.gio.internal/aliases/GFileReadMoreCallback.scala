package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileReadMoreCallback:
*/
opaque type GFileReadMoreCallback = CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GFileReadMoreCallback:
  given _tag: Tag[GFileReadMoreCallback] = Tag.materializeCFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GFileReadMoreCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GFileReadMoreCallback = o
  extension (v: GFileReadMoreCallback)
    inline def value: CFuncPtr3[CString, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)