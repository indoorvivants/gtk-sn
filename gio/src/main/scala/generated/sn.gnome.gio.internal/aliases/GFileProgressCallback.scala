package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GFileProgressCallback: _num_bytes: the current number of bytes in the operation. _num_bytes: the total number of bytes in the operation.
*/
opaque type GFileProgressCallback = CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GFileProgressCallback:
  given _tag: Tag[GFileProgressCallback] = Tag.materializeCFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GFileProgressCallback = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit]): GFileProgressCallback = o
  extension (v: GFileProgressCallback)
    inline def value: CFuncPtr3[_root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.goffset, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)