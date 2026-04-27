package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GClosureMarshal: : the #GClosure to which the marshaller belongs
*/
opaque type GClosureMarshal = CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GClosureMarshal:
  given _tag: Tag[GClosureMarshal] = Tag.materializeCFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GClosureMarshal = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): GClosureMarshal = o
  extension (v: GClosureMarshal)
    inline def value: CFuncPtr6[Ptr[GClosure], Ptr[GValue], _root_.sn.gnome.glib.internal.guint, Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)