package sn.gnome.gsk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GskParseErrorFunc: : start of the error location : end of the error location : the error _data: user data
*/
opaque type GskParseErrorFunc = CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit]
object GskParseErrorFunc:
  given _tag: Tag[GskParseErrorFunc] = Tag.materializeCFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GskParseErrorFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit]): GskParseErrorFunc = o
  extension (v: GskParseErrorFunc)
    inline def value: CFuncPtr4[Ptr[GskParseLocation], Ptr[GskParseLocation], Ptr[_root_.sn.gnome.glib.internal.GError], _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)