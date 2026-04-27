package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GClassInitFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to initialize.
*/
opaque type GClassInitFunc = CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
object GClassInitFunc:
  given _tag: Tag[GClassInitFunc] = Tag.materializeCFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GClassInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit]): GClassInitFunc = o
  extension (v: GClassInitFunc)
    inline def value: CFuncPtr2[_root_.sn.gnome.glib.internal.gpointer, _root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)