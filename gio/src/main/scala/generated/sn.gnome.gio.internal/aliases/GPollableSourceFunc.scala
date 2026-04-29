package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GPollableSourceFunc: _stream: the #GPollableInputStream or #GPollableOutputStream
*/
opaque type GPollableSourceFunc = CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GPollableSourceFunc:
  given _tag: Tag[GPollableSourceFunc] = Tag.materializeCFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GPollableSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GPollableSourceFunc = o
  extension (v: GPollableSourceFunc)
    inline def value: CFuncPtr2[Ptr[_root_.sn.gnome.gobject.internal.GObject], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)