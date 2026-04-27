package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GBaseInitFunc: _class: (type GObject.TypeClass): The #GTypeClass structure to initialize
*/
opaque type GBaseInitFunc = CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
object GBaseInitFunc:
  given _tag: Tag[GBaseInitFunc] = Tag.materializeCFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GBaseInitFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit]): GBaseInitFunc = o
  extension (v: GBaseInitFunc)
    inline def value: CFuncPtr1[_root_.sn.gnome.glib.internal.gpointer, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)