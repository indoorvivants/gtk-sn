package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkCustomMeasureFunc: : the widget to be measured : the direction to be measured _size: the size to be measured for : (out): the measured minimum size of the widget : (out): the measured natural size of the widget _baseline: (out): the measured minimum baseline of the widget _baseline: (out): the measured natural baseline of the widget
*/
opaque type GtkCustomMeasureFunc = CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
object GtkCustomMeasureFunc:
  given _tag: Tag[GtkCustomMeasureFunc] = Tag.materializeCFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkCustomMeasureFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit]): GtkCustomMeasureFunc = o
  extension (v: GtkCustomMeasureFunc)
    inline def value: CFuncPtr7[Ptr[GtkWidget], GtkOrientation, CInt, Ptr[CInt], Ptr[CInt], Ptr[CInt], Ptr[CInt], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)