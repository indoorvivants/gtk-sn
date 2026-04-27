package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.3+6-e972956a-SNAPSHOT: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCustomRequestModeFunc: : the widget to be queried
*/
opaque type GtkCustomRequestModeFunc = CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
object GtkCustomRequestModeFunc:
  given _tag: Tag[GtkCustomRequestModeFunc] = Tag.materializeCFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomRequestModeFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode]): GtkCustomRequestModeFunc = o
  extension (v: GtkCustomRequestModeFunc)
    inline def value: CFuncPtr1[Ptr[GtkWidget], GtkSizeRequestMode] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)