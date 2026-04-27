package sn.gnome.gio.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GSimpleAsyncThreadFunc: : a #GSimpleAsyncResult. : a #GObject. : optional #GCancellable object, %NULL to ignore.
*/
opaque type GSimpleAsyncThreadFunc = CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]
object GSimpleAsyncThreadFunc:
  given _tag: Tag[GSimpleAsyncThreadFunc] = Tag.materializeCFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GSimpleAsyncThreadFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit]): GSimpleAsyncThreadFunc = o
  extension (v: GSimpleAsyncThreadFunc)
    inline def value: CFuncPtr3[Ptr[GSimpleAsyncResult], Ptr[_root_.sn.gnome.gobject.internal.GObject], Ptr[GCancellable], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)