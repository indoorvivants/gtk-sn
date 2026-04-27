package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GVfsFileLookupFunc: : a #GVfs : the identifier to look up a #GFile for. This can either be an URI or a parse name as returned by g_file_get_parse_name() _data: user data passed to the function
*/
opaque type GVfsFileLookupFunc = CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]
object GVfsFileLookupFunc:
  given _tag: Tag[GVfsFileLookupFunc] = Tag.materializeCFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GVfsFileLookupFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]]): GVfsFileLookupFunc = o
  extension (v: GVfsFileLookupFunc)
    inline def value: CFuncPtr3[Ptr[GVfs], CString, _root_.sn.gnome.glib.internal.gpointer, Ptr[GFile]] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)