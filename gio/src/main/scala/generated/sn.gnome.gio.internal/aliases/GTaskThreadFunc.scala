package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

opaque type GTaskThreadFunc = CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]
object GTaskThreadFunc:
  given _tag: Tag[GTaskThreadFunc] = Tag.materializeCFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTaskThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit]): GTaskThreadFunc = o
  extension (v: GTaskThreadFunc)
    inline def value: CFuncPtr4[Ptr[GTask], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Ptr[GCancellable], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)