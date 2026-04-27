package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GDatagramBasedSourceFunc: _based: the #GDatagramBased : the current condition at the source fired
*/
opaque type GDatagramBasedSourceFunc = CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
object GDatagramBasedSourceFunc:
  given _tag: Tag[GDatagramBasedSourceFunc] = Tag.materializeCFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GDatagramBasedSourceFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean]): GDatagramBasedSourceFunc = o
  extension (v: GDatagramBasedSourceFunc)
    inline def value: CFuncPtr3[Ptr[GDatagramBased], _root_.sn.gnome.glib.internal.GIOCondition, _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gboolean] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)