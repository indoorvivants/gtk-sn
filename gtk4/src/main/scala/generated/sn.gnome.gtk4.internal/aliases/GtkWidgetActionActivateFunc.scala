package sn.gnome.gtk4.internal

// This file was generated using sn-bindgen 0.4.4: https://sn-bindgen.indoorvivants.com/

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

/**
 * GtkWidgetActionActivateFunc: : the widget to which the action belongs _name: the action name : (nullable): parameter for activation
*/
opaque type GtkWidgetActionActivateFunc = CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]
object GtkWidgetActionActivateFunc:
  given _tag: Tag[GtkWidgetActionActivateFunc] = Tag.materializeCFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]
  inline def fromPtr(ptr: Ptr[Byte] | CVoidPtr): GtkWidgetActionActivateFunc = CFuncPtr.fromPtr(ptr.asInstanceOf[Ptr[Byte]])
  inline def apply(inline o: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit]): GtkWidgetActionActivateFunc = o
  extension (v: GtkWidgetActionActivateFunc)
    inline def value: CFuncPtr3[Ptr[GtkWidget], CString, Ptr[_root_.sn.gnome.glib.internal.GVariant], Unit] = v
    inline def toPtr: CVoidPtr = CFuncPtr.toPtr(v)