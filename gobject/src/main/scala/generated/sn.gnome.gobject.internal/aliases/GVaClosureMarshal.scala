package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GVaClosureMarshal: : the #GClosure to which the marshaller belongs
*/
opaque type GVaClosureMarshal = CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, va_list, _root_.sn.gnome.glib.internal.gpointer, CInt, Ptr[GType], Unit]
object GVaClosureMarshal:
  given _tag: Tag[GVaClosureMarshal] = Tag.materializeCFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, va_list, _root_.sn.gnome.glib.internal.gpointer, CInt, Ptr[GType], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GVaClosureMarshal = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, va_list, _root_.sn.gnome.glib.internal.gpointer, CInt, Ptr[GType], Unit]): GVaClosureMarshal = o
  extension (v: GVaClosureMarshal)
    inline def value: CFuncPtr7[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, va_list, _root_.sn.gnome.glib.internal.gpointer, CInt, Ptr[GType], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)