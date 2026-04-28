package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCustomAllocateFunc: : the widget to allocate : the new width of the widget : the new height of the widget : the new baseline of the widget, or -1
*/
opaque type GtkCustomAllocateFunc = CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
object GtkCustomAllocateFunc:
  given _tag: Tag[GtkCustomAllocateFunc] = Tag.materializeCFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomAllocateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit]): GtkCustomAllocateFunc = o
  extension (v: GtkCustomAllocateFunc)
    inline def value: CFuncPtr4[Ptr[GtkWidget], CInt, CInt, CInt, Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)