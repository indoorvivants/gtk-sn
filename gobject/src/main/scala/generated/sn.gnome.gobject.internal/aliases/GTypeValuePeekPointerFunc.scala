package sn.gnome.gobject.internal

// This file was generated using sn-bindgen 0.4.4+1-3da9c949-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GTypeValuePeekPointerFunc: : the value to peek
*/
opaque type GTypeValuePeekPointerFunc = CFuncPtr1[Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer]
object GTypeValuePeekPointerFunc:
  given _tag: Tag[GTypeValuePeekPointerFunc] = Tag.materializeCFuncPtr1[Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GTypeValuePeekPointerFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer]): GTypeValuePeekPointerFunc = o
  extension (v: GTypeValuePeekPointerFunc)
    inline def value: CFuncPtr1[Ptr[GValue], _root_.sn.gnome.glib.internal.gpointer] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)